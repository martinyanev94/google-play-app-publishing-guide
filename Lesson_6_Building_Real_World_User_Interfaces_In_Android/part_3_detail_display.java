textView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        TextView detailTextView = findViewById(R.id.detail_layout);
        detailTextView.setText("Details about " + textView.getText().toString());
    }
});
<LinearLayout
    android:id="@+id/detail_layout"
    android:layout_width="0dp"
    android:layout_height="match_parent"
    android:layout_weight="0.6"
    android:orientation="vertical">

    <TextView
        android:id="@+id/detail_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select an item to see details."/>
</LinearLayout>
