public class ListFragment extends Fragment {
    private SharedViewModel viewModel;
    // Other initializations...

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);
    }

    // When an item is clicked:
    callback.onItemSelected(position);
    viewModel.select(getItems().get(position));
}
viewModel.getSelectedItem().observe(getViewLifecycleOwner(), item -> {
    updateDetail(item);
});
