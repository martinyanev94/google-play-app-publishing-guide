GoogleMap googleMap;

@Override
protected void onMapReady(GoogleMap map) {
    googleMap = map;
    loadPhotosOnMap();
}

private void loadPhotosOnMap() {
    SQLiteDatabase db = new DatabaseHelper(this).getReadableDatabase();
    Cursor cursor = db.query(TABLE_PHOTOS, null, null, null, null, null, null);
    while (cursor.moveToNext()) {
        String imagePath = cursor.getString(cursor.getColumnIndex(COLUMN_IMAGE_PATH));
        double latitude = cursor.getDouble(cursor.getColumnIndex(COLUMN_LATITUDE));
        double longitude = cursor.getDouble(cursor.getColumnIndex(COLUMN_LONGITUDE));

        LatLng position = new LatLng(latitude, longitude);
        googleMap.addMarker(new MarkerOptions().position(position).title(imagePath));
    }
    cursor.close();
    db.close();
}
