@Override
protected void onStop() {
    super.onStop();
    // Clean up resources
    Log.d("Lifecycle", "onStop called: Cleaning up resources...");
    cleanupResources();
}

@Override
protected void onDestroy() {
    super.onDestroy();
    // Final cleanup
    Log.d("Lifecycle", "onDestroy called: Finalizing resources...");
    finalizeResources();
}

private void cleanupResources() {
    // code to clean up resources like database connections
}

private void finalizeResources() {
    // code to finalize all remaining resources
}
