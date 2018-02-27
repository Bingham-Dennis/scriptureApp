package com.example.dpbin.week5app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.dpbin.week5app.R.id.TextView_Book;
import static com.example.dpbin.week5app.R.id.TextView_Chapter;
import static com.example.dpbin.week5app.R.id.TextView_Verse;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String EXTRA_BOOK = "com.example.dpbin.week5app.EXTRA_BOOK";
    public static final String EXTRA_CHAPTER = "com.example.dpbin.week5app.EXTRA_CHAPTER";
    public static final String EXTRA_VERSE = "com.example.dpbin.week5app.EXTRA_VERSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button saveScriptureButton = (Button) findViewById(R.id.Button_Submit_Scripture);
        saveScriptureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openDisplayScriptureActivity();
            }
        });

        Button loadScriptureButton = (Button) findViewById(R.id.Button_Load_Scripture);
        loadScriptureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

            }
        });
    }

    public void openDisplayScriptureActivity() {
        EditText BookId = (EditText) findViewById(TextView_Book);
        EditText ChapterId = (EditText) findViewById(TextView_Chapter);
        EditText VerseId = (EditText) findViewById(TextView_Verse);

        String book = BookId.getText().toString();
        String chapter = ChapterId.getText().toString();
        String verse = VerseId.getText().toString();

        // Log message to see if scripture was created.
        String scripture = "About to create intent with " + book + " " + chapter + ":" + verse;
        Log.i(TAG, scripture);

        Intent intent = new Intent(this, DisplayScriptureActivity.class);
        intent.putExtra(EXTRA_BOOK, book);
        intent.putExtra(EXTRA_CHAPTER, chapter);
        intent.putExtra(EXTRA_VERSE, verse);
        startActivity(intent);
    }

}
