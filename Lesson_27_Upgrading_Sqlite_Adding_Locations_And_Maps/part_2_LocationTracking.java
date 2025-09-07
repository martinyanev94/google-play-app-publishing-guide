FusedLocationProviderClient fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

LocationRequest locationRequest = new LocationRequest();
locationRequest.setInterval(10000);
locationRequest.setFastestInterval(5000);
locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

LocationCallback locationCallback = new LocationCallback() {
    @Override
    public void onLocationResult(LocationResult locationResult) {
        if (locationResult == null) {
            return;
        }
        for (Location location : locationResult.getLocations()) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Log.d("Location", "Lat: " + latitude + ", Lon: " + longitude);
            // Here you can save these coordinates to SQLite with the photo
        }
    }
};

// Start location updates
fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, null);
