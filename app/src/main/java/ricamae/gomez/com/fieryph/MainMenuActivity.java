package ricamae.gomez.com.fieryph;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void process (View v) {
        Intent i = null, chooser = null;

        if(v.getId()== R.id.emergencycall){
            i = new Intent(this, LocationActivity.class);
            startActivity(i);
        }

//        else if(v.getId()==R.id.btnMap){
//            i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("geo:14.611282,120.992259"));
//            chooser = Intent.createChooser(i,"Choose Application for Map");
//            startActivity(chooser);
//        }
//
//        else if(v.getId()==R.id.btnWeb){
//            i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ust.edu.ph"));
//            chooser = Intent.createChooser(i,"Choose Application to open site");
//            startActivity(chooser);
//        }
    }

}
