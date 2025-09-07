public class MainActivity extends AppCompatActivity {

    private EditText editTextNote;
    private Button buttonAdd;
    private RecyclerView recyclerViewNotes;
    private NotesAdapter notesAdapter;
    private ArrayList<String> notesList;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNote = findViewById(R.id.editTextNote);
        buttonAdd = findViewById(R.id.buttonAdd);
        recyclerViewNotes = findViewById(R.id.recyclerViewNotes);
        
        databaseHelper = new DatabaseHelper(this);
        notesList = databaseHelper.getAllNotes();
        
        notesAdapter = new NotesAdapter(notesList);
        recyclerViewNotes.setAdapter(notesAdapter);
        recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this));

        buttonAdd.setOnClickListener(view -> {
            String note = editTextNote.getText().toString().trim();
            if (!note.isEmpty()) {
                notesList.add(note);
                databaseHelper.addNote(note);
                notesAdapter.notifyItemInserted(notesList.size() - 1);
                editTextNote.setText("");
            }
        });
    }
}
