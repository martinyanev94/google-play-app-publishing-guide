public class DetailFragment extends Fragment {
    private TextView detailView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        detailView = view.findViewById(R.id.detail_view);
        return view;
    }

    public void updateDetail(String detail) {
        detailView.setText(detail);
    }
}
public class MainActivity extends AppCompatActivity implements ListFragment.OnItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_list, new ListFragment())
                .replace(R.id.container_detail, new DetailFragment())
                .commit();
        }
    }

    @Override
    public void onItemSelected(int position) {
        DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.container_detail);
        if (detailFragment != null) {
            detailFragment.updateDetail("Details for item " + position);
        }
    }
}
