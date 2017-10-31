package id.web.hn.mapview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pakai supportMapFragment
        val map: SupportMapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment

        map.getMapAsync(this)



//        mapView.getMapAsync {
//            googleMap ->
//            googleMap.addMarker(MarkerOptions().position(LatLng(106.827153, -6.175392)).title("Monas"))
//        }


    }

    override fun onMapReady(map: GoogleMap) {
        val lok = LatLng(-6.259412, 106.878688)
        val update = CameraUpdateFactory.newLatLng(lok)
        val zoom = CameraUpdateFactory.zoomTo(17f)
        map.moveCamera(update)
        map.animateCamera(zoom)
        map.addMarker(MarkerOptions()
                .position(lok)
                .title("Pratama Bahagia").snippet("Alamatnya di sana"))

    }
}
