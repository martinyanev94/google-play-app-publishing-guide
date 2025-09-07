@Override
protected void onPause() {
    super.onPause();
    saveUserData();
    stopDataSync();
}

@Override
protected void onResume() {
    super.onResume();
    loadUserData();
    startDataSync();
}

@Override
protected void onStop() {
    super.onStop();
    cleanupResources();
}

@Override
protected void onDestroy() {
    super.onDestroy();
    finalizeResources();
}

private void saveUserData() {
    // frequent use of SharedPreferences for lightweight data storage
    SharedPreferences preferences = getSharedPreferences("AppData", MODE_PRIVATE);
    SharedPreferences.Editor editor = preferences.edit();
    editor.putString("username", "JohnDoe");
    editor.apply();
}

// Assume loadUserData(), cleanupResources(), finalizeResources() are as defined before
