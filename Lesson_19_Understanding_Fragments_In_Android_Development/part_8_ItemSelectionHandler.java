public interface OnItemSelectedListener {
    void onItemSelected(String item);
}

// Notify the activity about the selection
listener.onItemSelected(selectedItem);
public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {
    @Override
    public void onItemSelected(String item) {
        // Pass the item to the detail fragment
        DetailFragment detailFragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString("selected_item", item);
        detailFragment.setArguments(args);
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, detailFragment)
            .addToBackStack(null)
            .commit();
    }
}
