package com.example.tpnotepokemon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PodiumPokemonFragment extends Fragment {

    private final String TAG = getClass().getSimpleName();

    public PodiumPokemonFragment() {
        Log.d(TAG, "Fragment Podium Pokemon created");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_podium_pokemon, container, false);
        //Instancier vos composants graphique ici (faîtes vos findViewById)
        return view;
    }

}