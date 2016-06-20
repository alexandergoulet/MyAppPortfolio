package com.alexandergoulet.www.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String defaultToastMessageFormat = "This button will launch my %s app!";
    private String fallbackToastMessage = "This button will launch my app!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method renders toast notification upon clicking/pressing
     * on project buttons
     * @param view
     */
    public void showToast (View view) {

        Button button = null;
        if (view instanceof Button) {
            button = (Button)view;

            String strToast = "";

            if (button.getText() != null && !button.getText().toString().isEmpty()) {
                strToast = String.format(defaultToastMessageFormat, button.getText().toString().toLowerCase());
            } else {
                strToast = fallbackToastMessage;
            }

            Toast toast = Toast.makeText(getApplicationContext(), strToast, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
