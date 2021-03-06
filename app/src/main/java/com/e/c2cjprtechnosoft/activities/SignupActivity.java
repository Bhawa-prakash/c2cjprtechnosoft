package com.e.c2cjprtechnosoft.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.c2cjprtechnosoft.R;

public class SignupActivity extends AppCompatActivity {

    private EditText editName, editDlno, editemail, editAdhar, editAge, editMobile, editPassword;
    private Button btnSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        editName = findViewById(R.id.name);
        editDlno = findViewById(R.id.dl);
        editemail = findViewById(R.id.emailid);
        editAdhar = findViewById(R.id.adharcard);
        editAge = findViewById(R.id.age);
        editMobile = findViewById(R.id.mobile);
        editPassword = findViewById(R.id.password);
        btnSignup = findViewById(R.id.signup);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });



    }


    public boolean validate() {
        boolean valid = true;

        String name = editName.getText().toString();
        String dlno = editDlno.getText().toString();
        String email = editemail.getText().toString();
        String adhar = editAdhar.getText().toString();
        String age = editAge.getText().toString();
        String mobile = editMobile.getText().toString();
        String password = editPassword.getText().toString();


        if (name.isEmpty() || name.length() < 3) {
            editName.setError("at least 3 characters");
            valid = false;
        } else {
            editName.setError(null);
        }

        if (dlno.isEmpty()) {
            editDlno.setError("Enter Valid Address");
            valid = false;
        } else {
            editDlno.setError(null);
        }


        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editemail.setError("enter a valid email address");
            valid = false;
        } else {
            editemail.setError(null);
        }

        if (mobile.isEmpty() || mobile.length() != 10) {
            editMobile.setError("Enter Valid Mobile Number");
            valid = false;
        } else {
            editMobile.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            editPassword.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            editPassword.setError(null);
        }
        if (age.isEmpty() || password.length() < 4 || password.length() > 10) {
            editAge.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            editAge.setError(null);
        }
        if (adhar.isEmpty() || password.length() < 4 || password.length() > 10) {
            editAdhar.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            editAdhar.setError(null);
        }
        if (valid == true) {
            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Signup Failed", Toast.LENGTH_SHORT).show();
        }

        return valid;
    }


}

