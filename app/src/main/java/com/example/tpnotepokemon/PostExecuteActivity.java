package com.example.tpnotepokemon;

import java.util.List;

public interface PostExecuteActivity<T> {
    void onPostExecutePokemons(List<T> itemList);
    void runOnUiThread( Runnable runable);
}
