package cejv669.concordia.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowMessage = findViewById(R.id.btnShowMessage);
        final EditText txtName = findViewById(R.id.txtName);

        btnShowMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello! " + txtName.getText().toString(), Toast.LENGTH_LONG).show();

                CheckBox checkBox = findViewById(R.id.checkBox);
                Switch switch1 = findViewById(R.id.switch1);
                ToggleButton toggleButton = findViewById(R.id.toggleButton);
                RatingBar ratingBar = findViewById(R.id.ratingBar);

                Boolean checkBoxChecked = checkBox.isChecked();
                Boolean switchSwitched = switch1.isChecked();
                Boolean toggleToggled = toggleButton.isChecked();
                float starRating = ratingBar.getRating();
            }
        });
    }

    public void displayName(View view) {

        Log.i("pressed", "button is pressed");

        EditText txtName = findViewById(R.id.txtName);
        TextView lblResult = findViewById(R.id.lblResult);

        String name = txtName.getText().toString();
        String resultName = "";


        for (int i = name.length() - 1; i >= 0; i--) {
            resultName += name.charAt(i);
        }

        lblResult.setText("Your name in reverse is " + resultName);

    }


}
