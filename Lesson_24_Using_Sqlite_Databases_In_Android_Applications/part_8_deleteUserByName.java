public void deleteUserByName(String name) {
    SQLiteDatabase db = this.getWritableDatabase();
    db.delete(TABLE_NAME, COLUMN_NAME + " = ?", new String[]{name});
    db.close();
}
