class GameView extends SurfaceView implements Runnable {
    Thread mGameThread = null;

    // SurfaceHolder to handle drawing
    SurfaceHolder mOurHolder;
    volatile boolean mPlaying;

    public void resume() {
        mPlaying = true;
        mGameThread = new Thread(this);
        mGameThread.start();
    }

    public void pause() {
        mPlaying = false;
        try {
            mGameThread.join();
        } catch (InterruptedException e) {
            Log.e("Error:", "joining thread");
        }
    }
    
    // The run method where our game loop will be
    @Override
    public void run() {
        while (mPlaying) {
            // Update and render your game here
        }
    }
}
