holder.itemView.setOnClickListener(v -> {
    final int positionToEdit = position;
    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
    builder.setTitle("Edit Note");

    EditText editText = new EditText(v.getContext());
    editText.setText(notesList.get(position));
    builder.setView(editText);
    
    builder.setPositiveButton("Update", (dialog, which) -> {
        String updatedNote = editText.getText().toString().trim();
        if (!updatedNote.isEmpty()) {
            notesList.set(positionToEdit, updatedNote);
            notifyItemChanged(positionToEdit);
            databaseHelper.deleteNote(notesList.get(positionToEdit));
            databaseHelper.addNote(updatedNote);
        }
    });
    
    builder.setNegativeButton("Cancel", (dialog, which) -> dialog.cancel());
    builder.show();
});
