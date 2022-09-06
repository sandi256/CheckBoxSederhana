package com.example.checkboxsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox ayam1, ayam2, ayam3;
    private String menu1, menu2, menu3;
    private Button pesan;
    private TextView pilihan1, pilihan2, pilihan3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ayam1 = findViewById(R.id.ayam1);
        ayam2 = findViewById(R.id.ayam2);
        ayam3 = findViewById(R.id.ayam3);
        pilihan1 = findViewById(R.id.menu_satu);
        pilihan2 = findViewById(R.id.menu_dua);
        pilihan3 = findViewById(R.id.menu_tiga);
        pesan = findViewById(R.id.pesan);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ayam1.isChecked()) {
                    menu1 = "Ayam Geprek";
                } else if (!ayam1.isChecked()) {
                    menu1 = " ";
                }

                if (ayam2.isChecked()) {
                    menu2 = "Ayam Bakar";
                } else if (!ayam2.isChecked()) {
                    menu2 = " ";
                }

                if (ayam3.isChecked()) {
                    menu3 = "Soto Ayam";
                } else if (!ayam3.isChecked()) {
                    menu3 = " ";
                }

                if(!ayam1.isChecked() && !ayam2.isChecked() && !ayam3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Tidak ada menu makanan yang dipesan", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Pesanan Terkirim", Toast.LENGTH_SHORT).show();
                    pilihan1.setText("Menu 1: "+menu1);
                    pilihan2.setText("Menu 2: "+menu2);
                    pilihan3.setText("Menu 3: "+menu3);
                }
            }
        });
    }
}