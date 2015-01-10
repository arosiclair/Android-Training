package rosiclair.andrew.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get extra message
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Display message as a text view
        TextView text = new TextView(this);
        text.setText(message);
        text.setTextSize(40);
        //Set the new text view as the activity's root view.
        setContentView(text);

        //Set the up button icon
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
