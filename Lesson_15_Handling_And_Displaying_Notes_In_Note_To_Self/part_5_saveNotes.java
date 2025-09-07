private void saveNotes() {
    try {
        FileOutputStream fos = openFileOutput("notes.txt", Context.MODE_PRIVATE);
        for (String note : notes) {
            fos.write((note + "\n").getBytes());
        }
        fos.close();
        Toast.makeText(this, "Notes saved", Toast.LENGTH_SHORT).show();
    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error saving notes", Toast.LENGTH_SHORT).show();
    }
}
