package com.example.athaya.athayaputrislavia_1202150252_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    private RecyclerView Rview;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> menu;
    private ArrayList<String> Deskripsi;
    private ArrayList<Integer> gambar;
    private TextView x, y;

    //menu air mineral
    private String[] minuman = {"Ades", "Amidis", "Aqua", "Cleo", "Club", "Equil",
            "Evian", "Lemineral", "Nestle", "Pristine", "Vit"};
    //nama merk air mineral
    private String[] deskripsi = {"Ini adalah air minum merk Ades", "Ini adalah air minum merk Amidis",
            "Ini adalah air minum merk Aqua", "Ini adalah air minum merk Cleo", "Ini adalah air minum merk Club",
            "Ini adalah air minum merk Equil", "Ini adalah air minum merk Evian", "Ini adalah air minum merk Lemineral",
            "Ini adalah air minum merk Nestle","Ini adalah air minum merk Pristine", "Ini adalah air minum merk Vit"};
    //gambar
    private int[] Gambar = {R.drawable.ades, R.drawable.amidis, R.drawable.aqua,
            R.drawable.cleo, R.drawable.club, R.drawable.equil, R.drawable.evian, R.drawable.leminerale,
            R.drawable.nestle, R.drawable.pristine,R.drawable.vit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //untuk mengambil data
        menu = new ArrayList<>();
        Deskripsi = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        Rview = (RecyclerView) findViewById(R.id.recycler_view);
        Rview.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        Rview.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter(menu, Deskripsi, gambar);
        Rview.setAdapter(adapter);

        //untuk membuat grid layout
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        Rview.setLayoutManager(new GridLayoutManager(this, gridColumnCount));
    }


    private void DaftarItem() {
        for (int z = 0; z < minuman.length; z++) {
            menu.add(minuman[z]);
            Deskripsi.add(deskripsi[z]);
            gambar.add(Gambar[z]);
        }
    }
}
