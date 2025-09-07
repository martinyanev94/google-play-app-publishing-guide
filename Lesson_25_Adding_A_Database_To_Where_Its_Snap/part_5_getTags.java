public Cursor getTags() {
    return db.rawQuery("SELECT _id, tag FROM " + TABLE_TAGS, null);
}
