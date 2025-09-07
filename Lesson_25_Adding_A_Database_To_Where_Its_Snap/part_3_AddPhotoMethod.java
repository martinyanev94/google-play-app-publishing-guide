public void addPhoto(Photo photo) {
    ContentValues values = new ContentValues();
    values.put("image_title", photo.getTitle());
    values.put("image_uri", photo.getStorageLocation().toString());
    values.put("tag1", photo.getTag1());
    values.put("tag2", photo.getTag2());
    values.put("tag3", photo.getTag3());

    db.insert(TABLE_PHOTOS, null, values);
}
