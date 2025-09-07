@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    switch (requestCode) {
        case REQUEST_IMAGE_CAPTURE:
        case REQUEST_IMAGE_PICK:
            // Handle these requests as covered earlier
            break;
            
        case UCrop.REQUEST_CROP:
            if (resultCode == RESULT_OK) {
                final Uri resultUri = UCrop.getOutput(data);
                imageView.setImageURI(resultUri);
            }
            break;
    }
}
