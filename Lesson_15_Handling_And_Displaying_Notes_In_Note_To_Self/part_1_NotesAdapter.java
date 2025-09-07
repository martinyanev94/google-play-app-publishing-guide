public class NotesAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> notes;

    public NotesAdapter(Context context, ArrayList<String> notes) {
        this.context = context;
        this.notes = notes;
    }

    @Override
    public int getCount() {
        return notes.size();
    }

    @Override
    public Object getItem(int position) {
        return notes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.note_item_layout, parent, false);
        }

        TextView noteText = convertView.findViewById(R.id.note_text);
        noteText.setText(notes.get(position));

        return convertView;
    }
}
