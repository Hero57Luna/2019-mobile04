package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.model.user;

import static id.ac.polinema.intent.BundleActivity.USERNAME_KEY;
import static id.ac.polinema.intent.ParcelableActivity.USER_KEY;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.input_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            user use = new user();
            use = extras.getParcelable(USER_KEY);

            usernameText.setText(use.getUsername());
            nameText.setText(use.getName());
            ageText.setText(String.valueOf(use.getAge()));
        }
    }
}
