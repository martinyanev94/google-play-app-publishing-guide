public void insertUser(String name, int age) {
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues values = new ContentValues();
    values.put(COLUMN_NAME, name);
    values.put(COLUMN_AGE, age);
    
    db.insert(TABLE_NAME, null, values);
    db.close();
}
