public class TitlesFragment extends ListFragment {
    private Cursor mCursor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataManager dataManager = new DataManager(getActivity());
        mCursor = dataManager.getTitles();
        
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getActivity(),
                android.R.layout.simple_list_item_1,
                mCursor,
                new String[] { "image_title" },
                new int[] { android.R.id.text1 },
                0);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        mCursor.moveToPosition(position);
        int dBID = mCursor.getInt(mCursor.getColumnIndex("_id"));
        // Pass dBID to Activity
    }
}
