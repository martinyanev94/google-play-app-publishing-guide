public Cursor getTitles() {
    return db.rawQuery("SELECT _id, image_title FROM " + TABLE_PHOTOS, null);
}
