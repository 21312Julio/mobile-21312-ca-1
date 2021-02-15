package com.example.mobile_21312_ca_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.util.Log

class MainActivity : AppCompatActivity() {

    private lateinit var num1: EditText;
    private lateinit var num2: EditText;
    private lateinit var result: TextView;
    private lateinit var addButton: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById<EditText>(R.id.number_1);
        num2 = findViewById<EditText>(R.id.number_2);
        result = findViewById<TextView>(R.id.result);
        addButton = findViewById<Button>(R.id.add_button);
        addButton.setOnClickListener(View.OnClickListener { view ->
            var number1: Int = Integer.parseInt(num1.text.toString());
            var number2: Int = Integer.parseInt(num2.text.toString());
            var sum: Int = number1 + number2;
            result.setText(sum.toString());

        Log.i("ADDITION", "The user has realized an addition.")
        });



    }
}