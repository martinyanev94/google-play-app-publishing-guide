listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        notes.remove(position);
        adapter.notifyDataSetChanged();
        Toast.makeText(MainActivity.this, "Note deleted", Toast.LENGTH_SHORT).show();
        return true;
    }
});
