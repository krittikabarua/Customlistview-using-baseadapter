package com.krittika.custom_listview_with_baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Secondpage extends AppCompatActivity {

    TextView text,text1,text2;
    ImageView   img11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        text=findViewById(R.id.txt11);
        String value_name1 =getIntent().getExtras().getString("key_name");
        text.setText(value_name1);

        text1=findViewById(R.id.txt22);
        String value_name2 =getIntent().getExtras().getString("key_name1");
        text1.setText(value_name2);

        text2=findViewById(R.id.txt33);
        String value_name3 =getIntent().getExtras().getString("key_name2");
        text2.setText(value_name3);

        img11=findViewById(R.id.img1);

        int imageId =getIntent().getExtras().getInt("imageId",0);
        img11.setImageResource(imageId);






    }
}