@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == REQUEST_IMAGE_PICK && resultCode == RESULT_OK) {
        Uri imageUri = data.getData();
        imageView.setImageURI(imageUri);
    }
}
