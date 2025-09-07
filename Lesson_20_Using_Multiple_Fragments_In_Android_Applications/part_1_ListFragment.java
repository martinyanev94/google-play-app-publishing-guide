public class ListFragment extends Fragment {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private OnItemSelectedListener callback;

    public interface OnItemSelectedListener {
        void onItemSelected(int position);
    }

    @Override
    public void onAttach(@NonNull Context activity) {
        super.onAttach(activity);
        try {
            callback = (OnItemSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new ItemAdapter(getItems(), position -> callback.onItemSelected(position));
        recyclerView.setAdapter(adapter);
        return view;
    }
    
    // ... Assume other necessary methods like getItems() to populate data are included
}
