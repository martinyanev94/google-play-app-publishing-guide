public class Ball {
    private RectF mRect;
    private float mXVelocity;
    private float mYVelocity;

    public Ball(int screenX, int screenY) {
        mRect = new RectF();
        mXVelocity = 200;  // Example speed
        mYVelocity = 200;  // Example speed
    }

    public void update(long fps) {
        mRect.left += (mXVelocity / fps);
        mRect.top += (mYVelocity / fps);
        mRect.right = mRect.left + 20;  // Assuming a fixed width for the ball
        mRect.bottom = mRect.top + 20;  // Assuming a fixed height for the ball
    }
}
