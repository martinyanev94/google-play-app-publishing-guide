Button longClickButton = findViewById(R.id.longClickButton);
longClickButton.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        textView.setText("Button Long Clicked!");
        return true; // Returning true indicates the event was handled
    }
});
