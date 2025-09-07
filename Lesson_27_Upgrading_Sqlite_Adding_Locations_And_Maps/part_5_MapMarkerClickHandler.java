googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
    @Override
    public boolean onMarkerClick(Marker marker) {
        String imagePath = marker.getTitle();
        Intent intent = new Intent(MapActivity.this, PhotoDetailActivity.class);
        intent.putExtra("imagePath", imagePath);
        startActivity(intent);
        return true;
    }
});
