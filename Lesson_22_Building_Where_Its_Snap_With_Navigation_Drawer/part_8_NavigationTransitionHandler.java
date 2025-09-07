@Override
public void onNavigationItemSelected(@NonNull MenuItem item) {
    //...
    Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.change_bounds);
    TransitionManager.beginDelayedTransition((ViewGroup) findViewById(R.id.content_frame), transition);
    //...
}
