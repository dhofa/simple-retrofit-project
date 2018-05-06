package id.ac.pens.student.it.ahmadmundhofa.retrofitsimpleapplication.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelBarang {
    @SerializedName("NoBarang")
    @Expose
    private String noBarang;
    @SerializedName("idBarang")
    @Expose
    private String idBarang;
    @SerializedName("namaBarang")
    @Expose
    private String namaBarang;
    @SerializedName("stok")
    @Expose
    private String stok;
    @SerializedName("hargaSatuan")
    @Expose
    private String hargaSatuan;
    @SerializedName("totalHarga")
    @Expose
    private String totalHarga;

    public String getNoBarang() {
        return noBarang;
    }

    public void setNoBarang(String noBarang) {
        this.noBarang = noBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(String hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public String getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }
}
