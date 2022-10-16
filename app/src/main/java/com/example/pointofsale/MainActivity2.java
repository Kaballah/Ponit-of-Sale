package com.example.pointofsale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView22, textView23, textView24, textView25, textView27, textView28, textView29, textView30, textView35, textView36, textView37, textView38, textView40, textView43, textView44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);

        textView27 = findViewById(R.id.textView27);
        textView28 = findViewById(R.id.textView28);
        textView29 = findViewById(R.id.textView29);
        textView30 = findViewById(R.id.textView30);

        textView35 = findViewById(R.id.textView35);
        textView36 = findViewById(R.id.textView36);
        textView37 = findViewById(R.id.textView37);
        textView38 = findViewById(R.id.textView38);

        textView40 = findViewById(R.id.textView40);
        textView43 = findViewById(R.id.textView43);
        textView44 = findViewById(R.id.textView44);

        Intent intent = getIntent();

        String milk = intent.getStringExtra("milk");
        String bread = intent.getStringExtra("bread");
        String eggs = intent.getStringExtra("eggs");
        String flour = intent.getStringExtra("flour");

        String milk_quantity = intent.getStringExtra("milk_quantity");
        String bread_quantity = intent.getStringExtra("bread_quantity");
        String eggs_quantity = intent.getStringExtra("eggs_quantity");
        String flour_quantity = intent.getStringExtra("flour_quantity");

        String milk_price = intent.getStringExtra("milk_price");
        String bread_price = intent.getStringExtra("bread_price");
        String eggs_price = intent.getStringExtra("eggs_price");
        String flour_price = intent.getStringExtra("flour_price");

        textView22.setText(milk);
        textView23.setText(bread);
        textView24.setText(eggs);
        textView25.setText(flour);

        textView27.setText(milk_quantity);
        textView28.setText(bread_quantity);
        textView29.setText(eggs_quantity);
        textView30.setText(flour_quantity);

        textView35.setText(milk_price);
        textView36.setText(bread_price);
        textView37.setText(eggs_price);
        textView38.setText(flour_price);

        Integer milkQuantity = Integer.parseInt(milk_quantity);
        Integer breadQuantity = Integer.parseInt(bread_quantity);
        Integer eggsQuantity = Integer.parseInt(eggs_quantity);
        Integer flourQuantity = Integer.parseInt(flour_quantity);

        Integer totalItems = milkQuantity + breadQuantity + eggsQuantity + flourQuantity;
        textView40.setText(totalItems.toString());

        String sub_total = intent.getStringExtra("sub_total");
        String total = intent.getStringExtra("total");

        textView43.setText(sub_total);
        textView44.setText(total);

    }
}