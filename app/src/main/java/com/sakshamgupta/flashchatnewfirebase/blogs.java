package com.sakshamgupta.flashchatnewfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class blogs  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports);

    }

    public void sports(View v)   {
        // TODO: Call attemptLogin() here
        Intent intent = new Intent(blogs.this, MainChatActivity.class);
        //Intent intent = new Intent(LoginActivity.this, blogs.class);
        finish();
        startActivity(intent);
    }

    public void education(View v)   {
        // TODO: Call attemptLogin() here
        Intent intent = new Intent(blogs.this, educationactivity.class);
        //Intent intent = new Intent(LoginActivity.this, blogs.class);
        finish();
        startActivity(intent);
    }

    public void politics(View v)   {
        // TODO: Call attemptLogin() here
        Intent intent = new Intent(blogs.this, politicsActivity.class);
        //Intent intent = new Intent(LoginActivity.this, blogs.class);
        finish();
        startActivity(intent);
    }

}
