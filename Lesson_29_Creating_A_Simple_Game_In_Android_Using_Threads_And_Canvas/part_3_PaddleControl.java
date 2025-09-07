@Override
public boolean onTouchEvent(MotionEvent motionEvent) {
    switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {
        case MotionEvent.ACTION_DOWN:
            if (motionEvent.getX() > mScreenX / 2) {
                mPaddle.setMovementState(Paddle.RIGHT);
            } else {
                mPaddle.setMovementState(Paddle.LEFT);
            }
            break;
        case MotionEvent.ACTION_UP:
            mPaddle.setMovementState(Paddle.STOPPED);
            break;
    }
    return true;
}
