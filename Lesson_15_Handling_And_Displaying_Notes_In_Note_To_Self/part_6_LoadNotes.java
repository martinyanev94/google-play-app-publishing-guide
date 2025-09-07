private void loadNotes() {
    try {
        FileInputStream fis = openFileInput("notes.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        String line;
        notes.clear();
        while ((line = reader.readLine()) != null) {
            notes.add(line);
        }
        fis.close();
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Notes loaded", Toast.LENGTH_SHORT).show();
    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error loading notes", Toast.LENGTH_SHORT).show();
    }
}
