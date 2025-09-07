@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    NotesDatabaseHelper dbHelper = new NotesDatabaseHelper(this);
    List<String> notes = dbHelper.getAllNotes();
    // Now update your ListView Adapter with retrieved notes
}
