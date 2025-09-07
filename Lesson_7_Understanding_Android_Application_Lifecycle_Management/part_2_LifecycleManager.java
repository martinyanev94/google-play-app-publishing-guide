@Override
protected void onPause() {
    super.onPause();
    // Pause ongoing tasks, save data
    Log.d("Lifecycle", "onPause called: Saving data...");
    saveUserData();
    stopDataSync();
}

@Override
protected void onResume() {
    super.onResume();
    // Resume tasks
    Log.d("Lifecycle", "onResume called: Loading data...");
    loadUserData();
    startDataSync();
}

private void saveUserData() {
    // code to save data
}

private void loadUserData() {
    // code to load data
}

private void stopDataSync() {
    // code to stop data synchronization
}

private void startDataSync() {
    // code to start data synchronization
}
