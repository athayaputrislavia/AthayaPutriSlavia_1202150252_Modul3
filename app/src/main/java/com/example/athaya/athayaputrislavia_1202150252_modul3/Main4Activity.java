package com.example.athaya.athayaputrislavia_1202150252_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    private TextView a,b, Liter;
    private ImageView d, Baterai;
    ImageButton tambah,kurang;

    private int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //untuk memanggil id
        a = findViewById(R.id.namaAir);
        b = findViewById(R.id.keterangan);
        d = findViewById(R.id.gambar);
        Liter = findViewById(R.id.liter);
        Baterai = findViewById(R.id.baterai);
        tambah = findViewById(R.id.plus);
        kurang = findViewById(R.id.minus);

        //untuk pindah tampilan
        Intent e = getIntent();
        String menu = e.getStringExtra("judul");
        String Deskripsi = e.getStringExtra("deskripsi");
        Integer Gambar = e.getIntExtra("gambar", 0);

        a.setText(menu);
        b.setText(Deskripsi);
        d.setImageResource(Gambar);

        Battery();
    }

    //untuk mengurangi jumlah air
    public void minus(View view) {
        jumlah--;
        Battery();
    }
    //untu menambahkan jumlah air
    public void plus(View view) {
        jumlah++;
        Battery();
    }
    //untuk mengganti gambar baterai
    public void Battery(){
        if (jumlah <= 0) {
            // 20%
            Liter.setText("1L");
            Baterai.setImageResource(R.drawable.ic_battery_20_black_24dp);
            Toast.makeText(this, "Air sedikit", Toast.LENGTH_SHORT).show();
        } else if (jumlah == 1) {
            // 30%
            Liter.setText("2L");
            Baterai.setImageResource(R.drawable.ic_battery_30_black_24dp);
        } else if (jumlah == 2) {
            // 50%
            Liter.setText("3L");
            Baterai.setImageResource(R.drawable.ic_battery_50_black_24dp);
        } else if (jumlah == 3) {
            // 60%
            Liter.setText("4L");
            Baterai.setImageResource(R.drawable.ic_battery_60_black_24dp);
        } else if (jumlah == 4) {
            // 80%
            Liter.setText("5L");
            Baterai.setImageResource(R.drawable.ic_battery_80_black_24dp);
        } else if (jumlah == 5) {
            // 90%
            Liter.setText("6L");
            Baterai.setImageResource(R.drawable.ic_battery_90_black_24dp);
        } else {
            // 100%
            Liter.setText("7L");
            Baterai.setImageResource(R.drawable.ic_battery_full_black_24dp);
            Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_SHORT).show();
        }
    }
}

