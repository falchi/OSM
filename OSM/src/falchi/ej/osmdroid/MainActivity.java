package falchi.ej.osmdroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.MyLocationOverlay;

public class MainActivity extends Activity {
	
	private MapView myOpenMapView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        myOpenMapView = (MapView)findViewById(R.id.openmapview);
        myOpenMapView.setBuiltInZoomControls(true);
        MapController myMapController = myOpenMapView.getController();
        myMapController.setZoom(4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    //Faltan los métodos onResume() y onPause() para suspender el uso del gps cuando no se use la app y para reanudarlo cuando se vuelva a abrir.
}
