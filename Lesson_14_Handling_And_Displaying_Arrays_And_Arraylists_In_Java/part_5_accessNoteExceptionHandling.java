try {
    String myNote = notesList.get(10); // Trying to access index 10
} catch (IndexOutOfBoundsException e) {
    System.out.println("That note doesn't exist!");
}
