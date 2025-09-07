listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String selectedNote = notes.get(position);
        Toast.makeText(MainActivity.this, "Selected note: " + selectedNote, Toast.LENGTH_SHORT).show();
    }
});
