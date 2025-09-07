for (String note : notes) {
    System.out.println(note);
}
Iterator<Note> iterator = notesList.iterator();
while (iterator.hasNext()) {
    Note note = iterator.next();
    System.out.println("Title: " + note.getTitle());
}
