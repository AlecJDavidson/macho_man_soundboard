package com.example.machomansoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer ohYeahMP = MediaPlayer.create(this, R.raw.oh_yeah);
        Button playOhYeah = (Button) this.findViewById(R.id.play_oh_yeah);
        playOhYeah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ohYeahMP.start();

            }
        });

        final MediaPlayer CreamMP = MediaPlayer.create(this, R.raw.cream_of_the_crop);
        Button play_cream = (Button) this.findViewById(R.id.play_cream);
        play_cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreamMP.start();

            }
        });

        final MediaPlayer FreakoutMP = MediaPlayer.create(this, R.raw.freakout);
        Button play_freak = (Button) this.findViewById(R.id.play_freak);
        play_freak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FreakoutMP.start();

            }
        });

        final MediaPlayer TowerMP = MediaPlayer.create(this, R.raw.tower_of_power);
        Button play_tower = (Button) this.findViewById(R.id.play_tower);
        play_tower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TowerMP.start();

            }
        });

        final MediaPlayer MachoMP = MediaPlayer.create(this, R.raw.macho_man);
        Button play_macho_man = (Button) this.findViewById(R.id.play_macho_man);
        play_macho_man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MachoMP.start();

            }
        });

    }

}
