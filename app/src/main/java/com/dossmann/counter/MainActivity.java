package com.dossmann.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button toast_button = findViewById(R.id.toast_button);
    toast_button.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            showToast();
        }
    });

    Button count_button = findViewById(R.id.count_button);
    count_button.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            count ++;
            Log.e( "Activity", "Increment of count variable");
            TextView count_text = (TextView) findViewById(R.id.count_text);
            count_text.setText((String.valueOf(count)));
        }
    });

    Button reset_count_button = findViewById(R.id.reset_count_button);
    reset_count_button.setOnClickListener((new View.OnClickListener(){
        public void onClick(View v){
            count = 0;
            Log.e("Activity","Reset of count variable");
            TextView count_text = (TextView) findViewById(R.id.count_text);
            count_text.setText((String.valueOf(count)));
        }
    }));
    }

    private void showToast(){
        Toast.makeText(this, R.string.hello_toast, Toast.LENGTH_SHORT).show();
    }


}
