package com.example.athaya.athayaputrislavia_1202150252_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Athaya on 2/24/2018.
 */

public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<String> rvData,rvHarga;
    private ArrayList<Integer> gambar;


    public RecyclerAdapter(ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gmbr) {
        rvData = inputData;
        rvHarga = dataHarga;
        gambar = gmbr;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String dan Integer untuk tiap item
        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView b;
        private RelativeLayout List;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();

            //melakukan inisiasi TextView, ImageView dan LinearLayoout
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            b = (ImageView) v.findViewById(R.id.icon);
            List = v.findViewById(R.id.list);

            //agar isi dari array nya dapat pindah layout dengan membawa data sesuai dibawah
            List.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,final int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = rvData.get(position);
        final String harga = rvHarga.get(position);
        final Integer test = gambar.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.b.setImageResource(test);

        holder.List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),Main4Activity.class);
                String ingredient ="";
                switch (position){
                    case 0 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;
                    case 1 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;

                    case 2 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;
                    case 3 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;
                    case 4 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;
                    case 5 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;
                    case 6 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;
                    case 7 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;
                    case 8 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;

                    case 9 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;

                    case 10 :
                        intent.putExtra("judul",rvData.get(position));
                        intent.putExtra("gambar",gambar.get(position));
                        ingredient = "Air mineral adalah air yang mengandung mineral atau bahan-bahan" +
                                " larut lain yang mengubah rasa atau memberi nilai-nilai terapi. " +
                                "Banyak kandungan Garam, sulfur, dan gas-gas yang larut di dalam air ini. " +
                                "Air mineral biasanya masih memiliki buih. Air mineral bersumber dari mata air yang berada di alam. " +
                                "Di Indonesia, bisnis air mineral dimulai pada tahun 1973 dengan merek Aqua, " +
                                "bisnis tersebut didirikan oleh Tirto Utomo dan Ibnu Sutowo. " +
                                "Institut Pertanian Bogor melalui Departemen Teknologi Industri Pertanian mendirikan Satuan Usaha " +
                                "Akademik BENING yang bertujuan untuk memproduksi air mineral dalam kemasan. " +
                                "Mineral juga merupakan sumber minuman kepada atlet. Mineral dapat menggantikan dan memulihkan sel-sel " +
                                "badan yang lama kepada sel yang baru. Namun hakikatnya air mineral adalah lebih mahal daripada " +
                                "air minuman.";
                        intent.putExtra("deskripsi",ingredient);
                        view.getContext().startActivity(intent);
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }

}
