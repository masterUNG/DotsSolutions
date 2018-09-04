package nuttapon.dots.co.th.dotssolutions;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

public class ServiceActivity extends AppCompatActivity {

    private String jsonUserString, nameAnSurString, phoneString;
    private MyConstant myConstant = new MyConstant();
    private String[] columnStrings = myConstant.getColumnTcust();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

//        Get Value From Preference
        getValueFromPreference();

//        Create Toolbar
        createToolbar();


    }   // Main Method

    private void createToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbarService);
        setSupportActionBar(toolbar);

        String firstName = findValueFromJSON(columnStrings[1]);
        String lastName = findValueFromJSON(columnStrings[2]);
        nameAnSurString = firstName + " " + lastName;

        getSupportActionBar().setSubtitle(nameAnSurString);

    }

    private String findValueFromJSON(String columnString) {

        String result = null;

        try {

            JSONArray jsonArray = new JSONArray(jsonUserString);
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            result = jsonObject.getString(columnString);
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return "Non";
        }



    }

    private void getValueFromPreference() {

        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);
        jsonUserString = sharedPreferences.getString("User", "");
        Log.d("4SepV1", "jsonUserString ==> " + jsonUserString);




    }


}   // Main Class
