public class Note {
    private String title;
    private String content;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
ArrayList<Note> notesList = new ArrayList<>();
notesList.add(new Note("Note 1", "This is the first note."));
notesList.add(new Note("Note 2", "This is the second note."));
for(Note note : notesList) {
    System.out.println("Title: " + note.getTitle() + ", Content: " + note.getContent());
}
