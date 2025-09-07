public class EditNoteActivity extends AppCompatActivity {
    private EditText noteEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);
        
        noteEditText = findViewById(R.id.noteEditText);
        String note = getIntent().getStringExtra("note_key");
        
        if (note != null) {
            noteEditText.setText(note);
        }
    }
}
