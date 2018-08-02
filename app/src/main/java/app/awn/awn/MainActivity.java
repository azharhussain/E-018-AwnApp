package app.awn.awn;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= "MainActivity";
    private static final int ERROR_DIALOG_REQUEST= 9001;


   /* private Button redButton;
    private Button yellowButton;
    private Button greenButton;*/
    private ImageButton redImgButton;
    private ImageButton yellowImgButton;
    private ImageButton greenImgButton;
    private TextView message;
    private FirebaseDatabase database;
    private DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     if (isServicesOK()) {
         redImgButton = (ImageButton) findViewById(R.id.redImgButton);
         yellowImgButton = (ImageButton) findViewById(R.id.yellowImgButton);
         greenImgButton = (ImageButton) findViewById(R.id.greenImgButton);
         message = (TextView) findViewById(R.id.message);
         database = FirebaseDatabase.getInstance();
         myRef = database.getReference("Message");


         redImgButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 message.setText("Red Button Pressed");
                 String id = myRef.push().getKey();


                 myRef.setValue(id);
                 myRef.child(id).setValue("Red");

                 Message msg = new Message(id, "Message", "SenderID", "RecieiverID", "Red", "Open");
                 //   myRef.setValue(id);
                 myRef.child(id).setValue(msg);

                 Intent intent = new Intent(MainActivity.this,VolumteerMapsActivity.class);
                 startActivity( intent);
             }
         });
         yellowImgButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 message.setText("Yellow Button Pressed");
                 String id = myRef.push().getKey();
                 Message msg = new Message(id, "Message", "SenderID", "RecieiverID", "Yellow", "Open");
                 //   myRef.setValue(id);
                 myRef.child(id).setValue(msg);
             }
         });
         greenImgButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 message.setText("Green Button Pressed");
                 String id = myRef.push().getKey();
                 Message msg = new Message(id, "Message", "SenderID", "RecieiverID", "Green", "Open");
                 //   myRef.setValue(id);
                 myRef.child(id).setValue(msg);
             }
         });
     }
    }

    private void SaveToDb(String id, Object obj)
    {

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
