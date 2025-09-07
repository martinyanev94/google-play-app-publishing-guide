public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
      
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
}
@Override
public void onMapReady(GoogleMap googleMap) {
    mMap = googleMap;

    LatLng siliconValley = new LatLng(37.3876, -122.0575);
    mMap.addMarker(new MarkerOptions().position(siliconValley).title("Marker in Silicon Valley"));
    mMap.moveCamera(CameraUpdateFactory.newLatLng(siliconValley));
}
