package game.MemoryGame;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MemoryGame extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        buildPieces();
    }

    private void buildPieces()
    {
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
    }
}
