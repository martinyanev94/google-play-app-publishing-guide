@Override
public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    Fragment selectedFragment = null;
    
    switch (item.getItemId()) {
        case R.id.nav_camera:
            selectedFragment = new CameraFragment();
            break;
        case R.id.nav_gallery:
            selectedFragment = new GalleryFragment();
            break;
        case R.id.nav_slideshow:
            selectedFragment = new SlideshowFragment();
            break;
        case R.id.nav_tools:
            selectedFragment = new ToolsFragment();
            break;
    }
    
    if (selectedFragment != null) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, selectedFragment)
                .commit();
    }
    
    drawerLayout.closeDrawer(GravityCompat.START);
    return true;
}
