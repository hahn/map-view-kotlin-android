# MapView Android

Belajar menampilkan peta dari Google Maps di Android.

Untuk menampilkan peta di Android, pastikan Anda sudah memiliki kunci API
dari Google Maps. Setelah itu, lakukan langkah berikut:

* Buat berkas `google_map_api.xml` di direktori `res/values`, lalu masukkan API anda di sana
```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="google_maps_api_key" templateMergeStrategy="preserve">
        tulis_google_api_kamu_di_sini
    </string>
</resources>
```
* Buka berkas `AndroidManifest.xml` dan isi di bagian `meta-data`:

```
<meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="@string/google_maps_api_key" />
```
 * Jangan lupa librarinya dimasukkan juga.

```
dependencies{
    implementation 'com.google.android.gms:play-services-maps:11.4.2'
}
```

