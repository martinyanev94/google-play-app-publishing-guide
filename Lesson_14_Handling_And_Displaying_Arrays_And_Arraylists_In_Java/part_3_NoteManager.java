import java.util.ArrayList;

ArrayList<String> notesList = new ArrayList<>();
notesList.add("Note 1");
notesList.add("Note 2");
ArrayList<String> additionalNotes = new ArrayList<>();
additionalNotes.add("Note 3");
additionalNotes.add("Note 4");

notesList.addAll(additionalNotes);
String secondNote = notesList.get(1);
System.out.println(secondNote); // Outputs "Note 2"
notesList.remove("Note 3");
