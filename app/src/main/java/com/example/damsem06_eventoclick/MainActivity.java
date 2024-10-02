    package com.example.damsem06_eventoclick;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button_primero);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Clic en el Botón 1", Toast.LENGTH_SHORT).show());

        TextView tv2 = findViewById(R.id.textView_segundo);
        tv2.setOnClickListener(view -> Toast.makeText(this, "Clic en el Texto 2", Toast.LENGTH_SHORT).show());

    }
}