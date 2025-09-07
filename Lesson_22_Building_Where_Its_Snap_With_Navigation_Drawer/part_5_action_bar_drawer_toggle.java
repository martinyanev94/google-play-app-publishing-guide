ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
drawerLayout.addDrawerListener(toggle);
toggle.syncState();
