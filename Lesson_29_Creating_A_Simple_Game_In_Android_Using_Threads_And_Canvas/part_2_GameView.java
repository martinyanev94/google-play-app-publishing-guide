Canvas mCanvas;
Paint mPaint;

public GameView(Context context) {
    super(context);
    mOurHolder = getHolder();
    mPaint = new Paint();
    mPaint.setColor(Color.WHITE);  // Set a default drawing color
}
public void draw() {
    if (mOurHolder.getSurface().isValid()) {
        mCanvas = mOurHolder.lockCanvas();  // Lock the Canvas
        
        // Clear the previous frame
        mCanvas.drawColor(Color.argb(255, 0, 0, 0));  // Clear with black
        
        // Draw your game objects here
        mCanvas.drawRect(mPaddle.getRect(), mPaint); // Draw the paddle
        mCanvas.drawRect(mBall.getRect(), mPaint); // Draw the ball
        
        // Count down from time and update scores
        mOurHolder.unlockCanvasAndPost(mCanvas); // Draw everything to the screen
    }
}
