public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
<ListView
    android:id="@+id/itemListView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_below="@id/button"/>
ListView listView = findViewById(R.id.itemListView);
ArrayList<Item> items = new ArrayList<>();
items.add(new Item("Item 1"));
items.add(new Item("Item 2"));

ArrayAdapter<Item> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
listView.setAdapter(adapter);
