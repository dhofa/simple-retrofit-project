package id.ac.pens.student.it.ahmadmundhofa.retrofitsimpleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.ac.pens.student.it.ahmadmundhofa.retrofitsimpleapplication.API.ApiClient;
import id.ac.pens.student.it.ahmadmundhofa.retrofitsimpleapplication.API.ApiServices;
import id.ac.pens.student.it.ahmadmundhofa.retrofitsimpleapplication.Models.ModelBarang;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.nama_barang)
    AppCompatEditText nama_barang;

    @BindView(R.id.stok_barang)
    AppCompatEditText stok_barang;

    @BindView(R.id.harga_satuan)
    AppCompatEditText harga_satuan;

    @BindView(R.id.sumbit)
    Button sumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ButterKnife.setDebug(true);

        sumbit.setOnClickListener(v -> saveData());
    }

    private void saveData() {
        String noBarang   = "13";
        String idBarang   = "12";
        String namaBarang = nama_barang.getText().toString();
        String stok       = stok_barang.getText().toString();
        String hargaSatuan= harga_satuan.getText().toString();
        String hargaTotal = "200000";

        ApiServices apiServices = ApiClient.getHttpClient().create(ApiServices.class);
        Call<ModelBarang> call  = apiServices.addBarang(noBarang, idBarang, namaBarang, stok, hargaSatuan, hargaTotal);
        call.enqueue(new Callback<ModelBarang>() {
            @Override
            public void onResponse(Call<ModelBarang> call, Response<ModelBarang> response) {
                //jika sukses simpan data didalam model, dan tampilkan kedalam adapter
            }

            @Override
            public void onFailure(Call<ModelBarang> call, Throwable t) {

            }
        });
    }


}
