public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {

    private ArrayList<String> notesList;

    public NotesAdapter(ArrayList<String> notesList) {
        this.notesList = notesList;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        holder.bind(notesList.get(position));
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    static class NoteViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNote;

        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNote = itemView.findViewById(android.R.id.text1);
        }

        public void bind(String note) {
            textViewNote.setText(note);
        }
    }
}
