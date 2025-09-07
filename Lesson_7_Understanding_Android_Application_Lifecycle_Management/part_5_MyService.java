public class MyService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("Service", "Service started...");
        // perform background work
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Service", "Service destroyed...");
    }
}
