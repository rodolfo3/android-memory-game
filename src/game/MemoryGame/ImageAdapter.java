package game.MemoryGame;

import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.GridView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import android.util.Log;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private Integer[] pieces;

    public ImageAdapter(Context c) {
        mContext = c;
        List ipieces = new ArrayList();
        for(int i=0; i<12; i++) {
            ipieces.add(i);
            ipieces.add(i);
        }
        Collections.shuffle(ipieces);
        pieces = (Integer[]) ipieces.toArray(new Integer[0]);

    }

    public int getCount() {
        return 24; //mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(60, 80));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(2, 2, 2, 2);
        } else {
            imageView = (ImageView) convertView;
        }
        int i = pieces[position];
        Log.d("ImageAdapter", Integer.toString(i));
        imageView.setImageResource(mThumbIds[i]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.american_gangster_icon,
            R.drawable.a_moment_icon,
            R.drawable.angels_and_demons_icon,
            R.drawable.apocalypto_icon,
            R.drawable.i300_icon,
            R.drawable.b13_u_icon,
            R.drawable.baby_and_me_icon,
            R.drawable.bangkok_dangerous_icon,
            R.drawable.batman_begins_1_icon,
            R.drawable.batman_begins_2_icon,
            R.drawable.batman_begins_3_icon,
            R.drawable.batman_dark_knight_icon,
        };
}
