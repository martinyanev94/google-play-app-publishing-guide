public class MyViewModel extends ViewModel {
    private MutableLiveData<String> data;

    public LiveData<String> getData() {
        if (data == null) {
            data = new MutableLiveData<>();
            loadData();
        }
        return data;
    }

    private void loadData() {
        // Fetch the data here
        data.setValue("Sample Data");
    }
}

// Inside your fragment
MyViewModel model = new ViewModelProvider(this).get(MyViewModel.class);
model.getData().observe(getViewLifecycleOwner(), newData -> {
    // Update the UI
});
