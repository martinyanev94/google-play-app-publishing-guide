public Cursor searchUserByName(String name) {
    SQLiteDatabase db = this.getReadableDatabase();
    return db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + COLUMN_NAME + " = ?", new String[]{name});
}
