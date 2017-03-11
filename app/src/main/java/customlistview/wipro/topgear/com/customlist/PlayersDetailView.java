package customlistview.wipro.topgear.com.customlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayersDetailView extends AppCompatActivity {
    // Declare Variables
    TextView txtplayer;
    TextView txtcountry;
    TextView txtage;
    ImageView imgplayer;
    String[] player;
    String country;
    String[] age;
    int[] img;
    int position;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_player_profile);
        // Retrieve data from MainActivity on listview item click
        Intent i = getIntent();
        // Get a single position
        position = i.getExtras().getInt("position");
        // Get the list of player
        player = i.getStringArrayExtra("player");
        // Get the list of country
        country = i.getStringExtra("country");
        // Get the list of age
        age = i.getStringArrayExtra("age");
        // Get the list of player image
        img = i.getIntArrayExtra("player_image");

        // initialise TextViews in activity_player_profile.xml
        txtplayer = (TextView) findViewById(R.id.player);
        txtcountry = (TextView) findViewById(R.id.country);
        txtage = (TextView) findViewById(R.id.age);

        // initialise ImageView in activity_player_profile.xml
        imgplayer = (ImageView) findViewById(R.id.PlayerImage);

        // Load the text into the TextViews followed by the position
        txtplayer.setText(player[position]);
        txtcountry.setText(country);
        txtage.setText(age[position]);


        // Load the image into the ImageView followed by the position
        imgplayer.setImageResource(img[position]);
    }
}
