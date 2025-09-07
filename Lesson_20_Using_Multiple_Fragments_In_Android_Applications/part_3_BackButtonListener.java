@Override
public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    Button backButton = view.findViewById(R.id.back_button);
    backButton.setOnClickListener(v -> getActivity().onBackPressed());
}
