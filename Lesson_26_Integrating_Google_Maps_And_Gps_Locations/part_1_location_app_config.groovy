defaultConfig {
    applicationId "com.gamecodeschool.whereitssnap3"
    minSdkVersion 15
    targetSdkVersion 22
    versionCode 1
    versionName "1.0"
}
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
<uses-permission android:name="android.permission.INTERNET" />
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/txtLat"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Lat ?"
        android:textSize="40dip"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="20dp" />
    
    <TextView
        android:id="@+id/txtLong"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Long ?"
        android:textSize="40dip"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="100dp" />
   
    <TextView
        android:id="@+id/txtSource"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Source ?"
        android:textSize="40dip"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="100dp" />
</LinearLayout>
