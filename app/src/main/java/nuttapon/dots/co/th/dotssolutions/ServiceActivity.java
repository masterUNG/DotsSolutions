package nuttapon.dots.co.th.dotssolutions;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ServiceActivity extends AppCompatActivity {

    private String jsonUserString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

//        Get Value From Preference
        getValueFromPreference();

    }   // Main Method

    private void getValueFromPreference() {

        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);
        jsonUserString = sharedPreferences.getString("User", "");


    }


}   // Main Class
