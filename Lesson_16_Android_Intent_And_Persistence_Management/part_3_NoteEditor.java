Button saveButton = findViewById(R.id.saveButton);
saveButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String updatedNote = noteEditText.getText().toString();
        Intent resultIntent = new Intent();
        resultIntent.putExtra("updated_note_key", updatedNote);
        setResult(RESULT_OK, resultIntent);
        finish(); // Closes the current activity and returns to the previous one
    }
});
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == EDIT_NOTE_REQUEST && resultCode == RESULT_OK) {
        String updatedNote = data.getStringExtra("updated_note_key");
        // Update the displayed note in the list or save it as needed
    }
}
