@Override
public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
    holder.bind(notesList.get(position));
    holder.itemView.setOnLongClickListener(v -> {
        notesList.remove(position);
        notifyItemRemoved(position);
        return true;
    });
}
