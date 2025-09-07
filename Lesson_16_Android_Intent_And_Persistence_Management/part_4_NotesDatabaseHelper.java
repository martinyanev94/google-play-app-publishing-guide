public class NotesDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "notes.db";
    private static final String TABLE_NAME = "notes_table";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NOTE = "note";
    
    public NotesDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" 
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
                + COLUMN_NOTE + " TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
