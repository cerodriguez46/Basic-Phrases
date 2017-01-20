package christopher.basicphrases;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view) {

        int id = view.getId();
        String ourId = "";

        //this gives us the id of the object we want to set to ourId variable
        ourId = view.getResources().getResourceEntryName(id);

        //this line finds the resources from raw folder for each phrase button
        int resourceId = getResources().getIdentifier(ourId, "raw", "christopher.basicphrases");

        //instead of using this, R.raw...., can use resourceId
        MediaPlayer mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();

        // integer.toString converts integers to string
        Log.i("button tapped", ourId);

    }
}
