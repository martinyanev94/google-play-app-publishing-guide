@Override
public void onLocationChanged(Location location) {
    double lat = location.getLatitude();
    double lng = location.getLongitude();
    txtLat.setText(String.valueOf(lat));
    txtLong.setText(String.valueOf(lng));
    txtSource.setText("Source = " + provider);
}

@Override
public void onStatusChanged(String provider, int status, Bundle extras) {
    txtSource.setText("Source = " + provider);
}

@Override
public void onProviderEnabled(String provider) {
    txtSource.setText("Source = " + provider);
}

@Override
public void onProviderDisabled(String provider) {
    txtSource.setText("Source = " + provider);
}
