btnSave.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (mImageUri != null && !mImageUri.equals(Uri.EMPTY)) {
            Photo photo = new Photo();
            photo.setTitle(mEditTextTitle.getText().toString());
            photo.setStorageLocation(mImageUri);
            photo.setTag1(mEditTextTag1.getText().toString());
            photo.setTag2(mEditTextTag2.getText().toString());
            photo.setTag3(mEditTextTag3.getText().toString());

            mDataManager.addPhoto(photo);
            Toast.makeText(getActivity(), "Photo saved!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "No image to save!", Toast.LENGTH_SHORT).show();
        }
    }
});
