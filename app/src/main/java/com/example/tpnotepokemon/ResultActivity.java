package com.example.tpnotepokemon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Définissez votre vue, rien de plus. Tout sera pris en charge par le fragment qui affiche les données
        setContentView(R.layout.activity_result);
    }
}
