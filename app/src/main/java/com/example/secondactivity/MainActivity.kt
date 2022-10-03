package com.example.secondactivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var choix : TextView;
    lateinit var yes : CheckBox;
    lateinit var no : CheckBox;
    lateinit var button : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        choix = findViewById(R.id.choix);
        yes = findViewById(R.id.checkBox);
        no = findViewById(R.id.checkBox2);
        button = findViewById(R.id.button);

        button.setOnClickListener {
            choix.setTextColor(Color.BLACK);
            if(yes.isChecked){
                choix.text = "Yes i have";
                no.isChecked = false;
            }else if (no.isChecked){
                choix.text = "No i don't";
                yes.isChecked = false;
            }else{
                choix.setTextColor(Color.RED);
                choix.text = "You must pick a choice";
            }
        }
        yes.setOnClickListener {
            if(yes.isChecked){
                no.isChecked = false;
            }
        }
        no.setOnClickListener {
            if (no.isChecked){
                yes.isChecked = false;
            }
        }
    }
}