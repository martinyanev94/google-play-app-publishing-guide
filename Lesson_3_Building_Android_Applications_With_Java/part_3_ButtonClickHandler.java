public void onButtonClick(View view) {
    Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show();
}
button.setOnClickListener(this::onButtonClick);
