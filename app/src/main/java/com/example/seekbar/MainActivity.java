package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView tvResultado;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        tvResultado = findViewById(R.id.tvResultado);
        button = findViewById(R.id.button);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvResultado.setText("on progress changed: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                tvResultado.setText("on start tracking");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tvResultado.setText("on stop tracking");
            }
        });
    }

    public void recuperarProgresso(View view) {
        tvResultado.setText("Escolhido: " + seekBar.getProgress());
    }
}