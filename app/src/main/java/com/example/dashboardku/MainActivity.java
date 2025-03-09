package com.example.dashboardku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CardView clothingCard, electronicCard, homeCard;
    CardView beautyCard, groceriesCard, pharmacyCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clothingCard = findViewById(R.id.clothingCard);
        electronicCard = findViewById(R.id.electronicCard);
        beautyCard = findViewById(R.id.beautyCard);
        groceriesCard = findViewById(R.id.groceriesCard);
        pharmacyCard = findViewById(R.id.pharmacyCard);
        homeCard =findViewById(R.id.homeCard);

        clothingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClothingActivity.class);
                startActivity(intent);
            }
        });
        electronicCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ElectronicActivity.class);
                startActivity(intent);
            }
        }
        );
        homeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        beautyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, beautyActivity.class);
                startActivity(intent);
            }
        });
        groceriesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GroceriesActivity.class);
                startActivity(intent);
            }
        });
        pharmacyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PharmacyActivity.class);
                startActivity(intent);
            }
        });
    }
}