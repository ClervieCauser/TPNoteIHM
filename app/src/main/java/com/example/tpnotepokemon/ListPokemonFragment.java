package com.example.tpnotepokemon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ListPokemonFragment extends Fragment {
    private final String TAG = getClass().getSimpleName();

    public ListPokemonFragment() {
        Log.d(TAG, "Fragment Podium Pokemon created");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_pokemon, container, false);
        //Instancier vos composants graphique ici (faîtes vos findViewById)
        return view;
    }
}