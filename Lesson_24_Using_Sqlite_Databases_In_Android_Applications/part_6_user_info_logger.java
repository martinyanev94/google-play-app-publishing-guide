Cursor cursor = dataManager.getAllUsers();
while (cursor.moveToNext()) {
    String userName = cursor.getString(cursor.getColumnIndex(DataManager.COLUMN_NAME));
    int userAge = cursor.getInt(cursor.getColumnIndex(DataManager.COLUMN_AGE));
    Log.i("User Info", "Name: " + userName + ", Age: " + userAge);
}
cursor.close();
