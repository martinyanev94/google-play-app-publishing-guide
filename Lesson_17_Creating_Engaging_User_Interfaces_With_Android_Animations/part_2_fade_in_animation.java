Animation fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
ImageView imageView = (ImageView) findViewById(R.id.imageView);
imageView.startAnimation(fadeIn);
