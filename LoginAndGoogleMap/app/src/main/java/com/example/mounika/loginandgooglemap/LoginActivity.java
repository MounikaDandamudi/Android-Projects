package com.example.mounika.loginandgooglemap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A login screen that offers login via email/password.
 */

    public class LoginActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_main);

        }


        public void checkCredentials(View v)
        {
            EditText usernameCtrl = (EditText)findViewById(R.id.Text_Username);
            EditText passwordCtrl = (EditText) findViewById(R.id.Text_password);
            TextView errorText = (TextView)findViewById(R.id.error);
            String userName = usernameCtrl.getText().toString();
            String password = passwordCtrl.getText().toString();

            boolean validationFlag = false;
            //Verify if the username and password are not empty.
            if(!userName.isEmpty() && !password.isEmpty()) {
                if(userName.equals("Mounika") && password.equals("mouni")) {
                    validationFlag = true;

                }
            }
            if(!validationFlag)
            {
                errorText.setVisibility(View.VISIBLE);
            }
            else
            {
                //This code redirects the from login page to the home page.
                Intent redirect = new Intent(LoginActivity.this, MapsActivity.class);
                startActivity(redirect);
            }

        }
    }