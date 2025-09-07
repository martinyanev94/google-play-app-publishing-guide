@Override
protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    // Save UI state
    Log.d("Lifecycle", "onSaveInstanceState called: Saving instance state...");
    outState.putString("key", "value"); // Example of saving data
}

@Override
protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    // Restore UI state
    Log.d("Lifecycle", "onRestoreInstanceState called: Restoring instance state...");
    String value = savedInstanceState.getString("key"); // Example of restoring data
}
