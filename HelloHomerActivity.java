package us.thejosh.hellohomer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HelloHomerActivity extends AppCompatActivity {
    private TextView message;
    private int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.clickCounter);
        ImageView homer = findViewById(R.id.homerImage);

        //Define and attach click listener
        homer.setOnClickListener(v -> tapDroid());
    }

    @SuppressLint("DefaultLocale")
    private void tapDroid() {
        counter++;
        String countAsText;
        /*
         * In real applications you should not write switch like the one below.
         * Use resource of type "Quantity strings (plurals)" instead.
         * See https://developer.android.com/guide/topics/resources/string-resource#Plurals
         */
        switch (counter) {
            case 1:
                countAsText = "once";
                break;
            case 2:
                countAsText = "twice";
                break;
            default:
                countAsText = String.format("%d times", counter);
        }
        message.setText(String.format("You tapped Homer %s", countAsText));
    }





}