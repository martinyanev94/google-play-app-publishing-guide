holder.itemView.setOnClickListener(v -> {
    Intent shareIntent = new Intent(Intent.ACTION_SEND);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TEXT, notesList.get(position));
    v.getContext().startActivity(Intent.createChooser(shareIntent, "Share note via"));
});
