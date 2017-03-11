package customlistview.wipro.topgear.com.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter  extends BaseAdapter {

    // Declare Variables
    Context context;
    String[] player;
    String country;
    String[] age;
    int[] img;
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] player, String country,
                           String[] age, int[] img) {
        this.context = context;
        this.player = player;
        this.country = country;
        this.age = age;
        this.img = img;
    }

    @Override
    public int getCount() {
        return player.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Declare Variables
        TextView txtPlayer;
        TextView txtCountry;
        TextView txtAge;
        ImageView imgPlayer;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.listview_item, parent, false);

        // initialise TextViews in listview_item.xml
        txtPlayer = (TextView) itemView.findViewById(R.id.player);
        txtCountry = (TextView) itemView.findViewById(R.id.country);
        txtAge = (TextView) itemView.findViewById(R.id.age);

        // initialise ImageView in listview_item.xml
        imgPlayer = (ImageView) itemView.findViewById(R.id.PlayerImage);

        // Locate position and set to the TextViews
        txtPlayer.setText(player[position]);
        txtCountry.setText(country);
        txtAge.setText(age[position]);


        // Locate position and set to the ImageView
        imgPlayer.setImageResource(img[position]);

        return itemView;
    }
}
