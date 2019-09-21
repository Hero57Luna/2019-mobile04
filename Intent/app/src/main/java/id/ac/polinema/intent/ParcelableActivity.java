package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.model.user;

public class ParcelableActivity extends AppCompatActivity {

    private EditText usernameInput, nameInput, ageInput;
    public static final String USER_KEY = "parcelable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
    }

    public void handleParcelable(View view) {
        String username = usernameInput.getText().toString();
        String name = nameInput.getText().toString();
        int age = Integer.parseInt(ageInput.getText().toString());

        Intent intent = new Intent(this, ProfileParcelableActivity.class);
        user use = new user(username, name, age);
        intent.putExtra(USER_KEY, use);
        startActivity(intent);

    }
}
