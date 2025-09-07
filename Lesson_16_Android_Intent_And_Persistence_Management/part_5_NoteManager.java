public void addNote(String note) {
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues contentValues = new ContentValues();
    contentValues.put(COLUMN_NOTE, note);
    db.insert(TABLE_NAME, null, contentValues);
    db.close();
}
public List<String> getAllNotes() {
    List<String> notes = new ArrayList<>();
    SQLiteDatabase db = this.getReadableDatabase();
    Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
    
    if (cursor.moveToFirst()) {
        do {
            notes.add(cursor.getString(1)); // Index 1 corresponds to COLUMN_NOTE
        } while (cursor.moveToNext());
    }
    cursor.close();
    db.close();
    return notes;
}
