public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "notes.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NOTES = "notes";
    
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NOTES + " (id INTEGER PRIMARY KEY AUTOINCREMENT, note TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NOTES);
        onCreate(db);
    }

    public void addNote(String note) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("note", note);
        db.insert(TABLE_NOTES, null, values);
        db.close();
    }

    public ArrayList<String> getAllNotes() {
        ArrayList<String> notesList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NOTES, null);
        if (cursor.moveToFirst()) {
            do {
                notesList.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }
        cursor.close();
        return notesList;
    }

    public void deleteNote(String note) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NOTES, "note = ?", new String[]{note});
        db.close();
    }
}
