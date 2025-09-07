@Override
protected void onResume() {
    super.onResume();
    locationManager.requestLocationUpdates(provider, 500, 1, this);
}

@Override
protected void onPause() {
    super.onPause();
    locationManager.removeUpdates(this);
}
