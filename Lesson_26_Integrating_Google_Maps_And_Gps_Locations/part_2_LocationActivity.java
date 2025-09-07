public class MainActivity extends Activity implements LocationListener {

    private TextView txtLat;
    private TextView txtLong;
    private TextView txtSource;
    private LocationManager locationManager;
    private String provider;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        txtLat = (TextView) findViewById(R.id.txtLat);
        txtLong = (TextView) findViewById(R.id.txtLong);
        txtSource = (TextView) findViewById(R.id.txtSource);

        // Initialize locationManager
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        // Retrieve the best provider for location updates
        Criteria criteria = new Criteria();
        provider = locationManager.getBestProvider(criteria, false);
        Location location = locationManager.getLastKnownLocation(provider);

        // Check for valid location
        if (location != null) {
            txtSource.setText("Source = " + provider);
            onLocationChanged(location);
        }
    }
}
