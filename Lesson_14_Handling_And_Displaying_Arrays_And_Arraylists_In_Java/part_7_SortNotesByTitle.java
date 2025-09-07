Collections.sort(notesList, new Comparator<Note>() {
    @Override
    public int compare(Note n1, Note n2) {
        return n1.getTitle().compareTo(n2.getTitle());
    }
});
