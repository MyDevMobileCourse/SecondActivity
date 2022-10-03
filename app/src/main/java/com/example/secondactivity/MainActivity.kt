package com.example.secondactivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var root : ConstraintLayout;
    lateinit var button: Button;
    lateinit var red:RadioButton;
    lateinit var yellow : RadioButton;
    lateinit var green : RadioButton;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        root = findViewById(R.id.root);
        red = findViewById(R.id.r);
        yellow = findViewById(R.id.y);
        green = findViewById(R.id.g);
        button = findViewById(R.id.button);

        button.setOnClickListener {
            if(red.isChecked){
                root.setBackgroundColor(Color.RED);
            }else if (yellow.isChecked){
                root.setBackgroundColor(Color.YELLOW);
            }else if (green.isChecked){
                root.setBackgroundColor(Color.GREEN);
            }else{

            }

        }



    }
}