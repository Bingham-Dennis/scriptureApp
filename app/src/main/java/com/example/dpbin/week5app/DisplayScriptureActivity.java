package com.example.dpbin.week5app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayScriptureActivity extends AppCompatActivity {
    private static final String TAG = "DScriptureActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);
        Intent intent = getIntent();
        String book = intent.getStringExtra(MainActivity.EXTRA_BOOK);
        String chapter = intent.getStringExtra(MainActivity.EXTRA_CHAPTER);
        String verse = intent.getStringExtra(MainActivity.EXTRA_VERSE);

        String scripture = "Received intent with " + book + " " + chapter + ":" + verse;
        Log.i(TAG, scripture);

        String outputScripture = book + " " + chapter + ":" + verse;

        TextView DisplayId;
        DisplayId = (TextView) (findViewById(R.id.TextView_Display));
        DisplayId.setText(outputScripture);
    }
}
