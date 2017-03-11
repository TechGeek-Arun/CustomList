package customlistview.wipro.topgear.com.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Declare Variables
    ListView list;
    CustomAdapter adapter;
    String[] player;
    String country;
    String[] age;
    int[] player_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // static data declare
        player = new String[] {"Mahendra Singh Dhoni",
                "Virat Kohli",
                "Yuvraj Singh",
                "Ajinkya Rahane",
                "Ishanth Sharma",
                "Amit Mishra",
                "Shikhar Dhawan",
                "Suresh Raina",
                "K.L. Rahul",
                "Rohith Sharma",
                "Mohammed Shami",
                "Ravichandran Ashwin",
                "Ravindra Jadeja",
                "Cheteshwar Pujara",
                "Umesh Yadav"
        };

        country = "India";

        age = new String[] { "35" , "24","35","35" , "24","35","35" , "24","35","35" , "24","35","35" , "24","35" };

        player_image = new int[] { R.drawable.ms_dhoni,
                R.drawable.virat_kohli,
                R.drawable.yuvraj_singh1,
                R.drawable.ajinkya_rahane_,
                R.drawable.ishant_sharma1,
                R.drawable.amit_mishra1,
                R.drawable.shikhar_dhawan,
                R.drawable.suresh_raina,
                R.drawable.lokesh_rahul1,
                R.drawable.rohit_sharma,
                R.drawable.shami_ahmed1,
                R.drawable.ravichandran_ashwin,
                R.drawable.ravindra_jadeja,
                R.drawable.cheteshwar_pujara1,
                R.drawable.umesh_yadav};

        // Initialise ListView in listview_main.xml
        list = (ListView) findViewById(R.id.playerList);

        // Pass results to CustomAdapter Class
        adapter = new CustomAdapter(this, player, country, age, player_image);
        // Binds the Adapter to the ListView
        list.setAdapter(adapter);
        // Capture ListView item click
        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(MainActivity.this, PlayersDetailView.class);
                // Pass all data player
                i.putExtra("player", player);
                // Pass all data country
                i.putExtra("country", country);
                // Pass all data age
                i.putExtra("age", age);
                // Pass all data player image
                i.putExtra("player_image", player_image);
                // Pass a single position
                i.putExtra("position", position);
                // Open PlayerDeteilView.java Activity
                startActivity(i);
            }

        });
    }
}
