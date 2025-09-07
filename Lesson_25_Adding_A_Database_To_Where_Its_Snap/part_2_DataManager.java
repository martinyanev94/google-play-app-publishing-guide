public class DataManager {
    private SQLiteDatabase db;
    
    private static final String DB_NAME = "wis_db";
    private static final int DB_VERSION = 1;
    private static final String TABLE_PHOTOS = "wis_table_photos";
    private static final String TABLE_TAGS = "wis_table_tags";
    
    public DataManager(Context context) {
        CustomSQLiteOpenHelper helper = new CustomSQLiteOpenHelper(context);
        db = helper.getWritableDatabase();
    }

    private class CustomSQLiteOpenHelper extends SQLiteOpenHelper {
        public CustomSQLiteOpenHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String createPhotosTable = "CREATE TABLE " + TABLE_PHOTOS + " (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                    "image_title TEXT NOT NULL," +
                    "image_uri TEXT NOT NULL," +
                    "tag1 TEXT NOT NULL," +
                    "tag2 TEXT NOT NULL," +
                    "tag3 TEXT NOT NULL)";
            db.execSQL(createPhotosTable);

            String createTagsTable = "CREATE TABLE " + TABLE_TAGS + " (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                    "tag TEXT NOT NULL)";
            db.execSQL(createTagsTable);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // Handle database upgrades accordingly
        }
    }
}
