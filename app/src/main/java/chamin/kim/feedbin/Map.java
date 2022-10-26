package chamin.kim.feedbin;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends AppCompatActivity
        implements OnMapReadyCallback {


    protected void onCreate(Bundle si) {
        super.onCreate(si);

        setContentView(R.layout.map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapFrag);
        mapFragment.getMapAsync(this);
    }
    @Override

    public void onMapReady(GoogleMap googleMap) {
        LatLng hk = new LatLng(22.3193, 114.1694);
        googleMap.addMarker(new MarkerOptions()
                .position(hk)
                .title("Marker in HK"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(hk));

    }
}
