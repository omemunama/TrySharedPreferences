package nursulaeman.trysharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set value from shared preferences
        //shared preferences can be access from different activity
        SharedPreferences set_shared_preference = getSharedPreferences("authentication", MODE_PRIVATE);
        SharedPreferences.Editor sp_editor = set_shared_preference.edit();
        sp_editor.putString("token_authentication", "fd@3jfD83#dfaksdfweqoru#LEWlkj");
        sp_editor.commit();

    }

    public void go_to (View v)
    {
        Intent i=new Intent();
        i.setClass(this,ActivityTwo.class);
        startActivity(i);
    }

}