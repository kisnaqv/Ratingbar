package com.nareshit.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.rg);
        ratingBar=findViewById(R.id.ratingBar);

        radioGroup.setOnCheckedChangeListener
                (new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged
                            (RadioGroup group, int checkedId) {

                        if(checkedId==R.id.radioButton){
                            Toast.makeText(MainActivity.this,
                                    "Radioone",Toast.LENGTH_LONG).show();
                            ratingBar.setRating(3);
                        }else if(checkedId==R.id.radioButton2) {
                            Toast.makeText(getApplicationContext(),
                                    "Radiotwo",Toast.LENGTH_SHORT).show();
                            ratingBar.setRating(4);
                        }else {
                            Toast.makeText(MainActivity.this, "Radio three", Toast.LENGTH_SHORT).show();
                            ratingBar.setRating(7);
                        }

                    }
                });


        //rating bar

        ratingBar.setOnRatingBarChangeListener
                (new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged
                            (RatingBar ratingBar,
                             float rating, boolean fromUser) {

                        Toast.makeText(getApplicationContext(),
                                "Rate is"+rating,Toast.LENGTH_LONG).show();



                    }
                });


        ImageView imageView=findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingBar.setRating(1);
            }
        });
    }
}
