package nursulaeman.trysharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nur on 21/09/16.
 */
public class ActivityTwo extends AppCompatActivity {

    TextView tv_shared_preference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_two);
        tv_shared_preference = (TextView) findViewById(R.id.tv_shared_preference);

        //this for retrieve value from shared preferences
        SharedPreferences get_shared_preference = getSharedPreferences("authentication", MODE_PRIVATE);
        tv_shared_preference.setText(get_shared_preference.getString("token_authentication", ""));
    }
}
