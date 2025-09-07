public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "photos.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_PHOTOS = "photos";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_IMAGE_PATH = "image_path";
    private static final String COLUMN_TAGS = "tags";
    private static final String COLUMN_LATITUDE = "latitude";
    private static final String COLUMN_LONGITUDE = "longitude";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_PHOTOS + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_IMAGE_PATH + " TEXT, " +
                COLUMN_TAGS + " TEXT, " +
                COLUMN_LATITUDE + " REAL, " +
                COLUMN_LONGITUDE + " REAL)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PHOTOS);
        onCreate(db);
    }
}
