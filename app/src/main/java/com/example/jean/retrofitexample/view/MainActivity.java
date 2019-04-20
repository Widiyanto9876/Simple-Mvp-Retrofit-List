package com.example.jean.retrofitexample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.jean.retrofitexample.R;
import com.example.jean.retrofitexample.model.Player;
import com.example.jean.retrofitexample.presenter.PlayerPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements FootbalView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PlayerPresenter playerPresenter = new PlayerPresenter(this);
        playerPresenter.getPlayers();

    }

    @Override
    public void listOfPlayers(List<Player> players) {
        // See your Logcat :)
        for (Player player : players) {
            Log.i("RETROFIT", player.getAge() + "\n"
                    + " - Title:  " + player.getDeskripsi() + " \n"
                    + " - Brief: " + player.getId());
        }
    }
}
