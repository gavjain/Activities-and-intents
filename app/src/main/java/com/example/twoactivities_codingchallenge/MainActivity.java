package com.example.twoactivities_codingchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String EXTRA_MESSAGE = "com.example.TwoActivitiesChallenge.extra.MESSAGE";
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view)
    {
        String message = "onClick garyo";
        Intent intent = new Intent(this, SecondActivity.class);

        switch (view.getId()) {
            case R.id.text_one:
                message = getString(R.string.passage_one);
                break;
            case R.id.text_two:
                message = getString(R.string.passage_two);
                break;
            case R.id.text_three:
                message = getString(R.string.passage_three);
                break;
        }
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}