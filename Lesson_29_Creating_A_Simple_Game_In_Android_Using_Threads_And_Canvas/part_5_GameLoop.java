@Override
public void run() {
    while (mPlaying) {
        long startFrameTime = System.currentTimeMillis();
        
        if (!mPaused) {
            mBall.update(mFPS); // Update ball position
            mPaddle.update(mFPS); // Update paddle position
        }

        draw(); // Render
        long timeThisFrame = System.currentTimeMillis() - startFrameTime;
        
        if (timeThisFrame >= 1) {
            mFPS = 1000 / timeThisFrame; // Calculate frames per second
        }
    }
}
