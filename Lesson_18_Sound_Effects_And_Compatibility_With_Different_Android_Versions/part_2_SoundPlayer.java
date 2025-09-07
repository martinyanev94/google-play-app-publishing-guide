try {
    AssetManager assetManager = this.getAssets();
    AssetFileDescriptor descriptor = assetManager.openFd("sound_file.ogg");
    soundID = soundPool.load(descriptor, 1);
} catch (IOException e) {
    e.printStackTrace();
}
soundPool.play(soundID, 1, 1, 0, 0, 1);
