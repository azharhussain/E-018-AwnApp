package app.awn.awn;

import android.Manifest;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int ERROR_DIALOG_REQUEST = 9001;
    private LocationManager locationManager;
    private LocationListener listener;
    private ImageButton redImgButton;
    private ImageButton yellowImgButton;
    private ImageButton greenImgButton;
    private TextView message;
    private FirebaseDatabase database;
    private DatabaseReference myRef;

    private String lng;
    private String lat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        if (isServicesOK()) {


            redImgButton = (ImageButton) findViewById(R.id.redImgButton);
            yellowImgButton = (ImageButton) findViewById(R.id.yellowImgButton);
            greenImgButton = (ImageButton) findViewById(R.id.greenImgButton);
            lng = "21";
            lat = "39";
            database = FirebaseDatabase.getInstance();
            myRef = database.getReference("Message");

      /*      listener = new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    lng = String.valueOf(location.getLongitude());
                    lat = String.valueOf(location.getLatitude());

                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {

                }

                @Override
                public void onProviderEnabled(String s) {

                }

                @Override
                public void onProviderDisabled(String s) {

                    Intent i = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    startActivity(i);
                }
            };*/



         redImgButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                // message.setText("Red Button Pressed");


                 String id = myRef.push().getKey();


                 myRef.setValue(id);
                 Message msg = new Message(id, "Message", "SenderID", "ReceiverID", "Red", "Open", lng,lat);
                 //   myRef.setValue(id);
                 myRef.child(id).setValue(msg);

                 Intent intent = new Intent(MainActivity.this,VolunteerMapsActivity.class);
                 startActivity( intent);
             }
         });
         yellowImgButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //message.setText("Yellow Button Pressed");
                 String id = myRef.push().getKey();
                 Message msg = new Message(id, "Message", "SenderID", "ReceiverID", "Yellow", "Open", lng,lat);
                 //   myRef.setValue(id);
                 myRef.child(id).setValue(msg);
                /* Intent intent = new Intent(MainActivity.this,HajiMapsActivity.class);
                 startActivity( intent);*/
                 Intent intent = new Intent(MainActivity.this,VolunteerMapsActivity.class);
                 startActivity( intent);
             }
         });
         greenImgButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //message.setText("Green Button Pressed");
                 String id = myRef.push().getKey();
                 Message msg = new Message(id, "Message", "SenderID", "ReceiverID", "Green", "Open", lng,lat);
                 //   myRef.setValue(id);
                 myRef.child(id).setValue(msg);
                 Intent intent = new Intent(MainActivity.this,VolunteerMapsActivity.class);
                 startActivity( intent);
             }
         });
     }
    }

    public boolean isServicesOK(){
        Log.d(TAG," isServicesOK checking for service avaliability");
       int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable (MainActivity.this);
      if (available== ConnectionResult.SUCCESS)
        {
            Log.d(TAG," GooglePlayService Working");
            return (true);
        }
        else if(GoogleApiAvailability.getInstance().isUserResolvableError(available))
      {
          Log.d(TAG," GooglePlayService is in Error but can be fixed");
          Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(MainActivity.this,available,ERROR_DIALOG_REQUEST);
          dialog.show();
          return (false);
      }
      else
      {
          Toast.makeText(this,"Issue with the map",Toast.LENGTH_SHORT).show();
          return (false);
      }



    }

}
