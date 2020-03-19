package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyText;
    private Button topBtn;
    private Button bottomBtn;
    private int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = findViewById(R.id.storyTextView);
        topBtn = findViewById(R.id.buttonTop);
        bottomBtn = findViewById(R.id.buttonBottom);
        mStoryIndex = 1;



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1 || mStoryIndex == 2){
                    storyText.setText(R.string.T3_Story);
                    topBtn.setText(R.string.T3_Ans1);
                    bottomBtn.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if(mStoryIndex == 3){
                  storyText.setText(R.string.T6_End);
                  topBtn.setVisibility(View.INVISIBLE);
                  bottomBtn.setVisibility(View.INVISIBLE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    storyText.setText(R.string.T2_Story);
                    topBtn.setText(R.string.T2_Ans1);
                    bottomBtn.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if(mStoryIndex == 3){
                    storyText.setText(R.string.T5_End);
                    topBtn.setVisibility(View.INVISIBLE);
                    bottomBtn.setVisibility(View.INVISIBLE);
                } else if(mStoryIndex == 2){
                    storyText.setText(R.string.T4_End);
                    topBtn.setVisibility(View.INVISIBLE);
                    bottomBtn.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
