package id.ac.pens.student.it.ahmadmundhofa.retrofitsimpleapplication.API;

import id.ac.pens.student.it.ahmadmundhofa.retrofitsimpleapplication.Models.ModelBarang;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiServices {
    @FormUrlEncoded
    @POST("auth/login")
    Call<ModelBarang> login(@Field("email") String email,
                            @Field("password") String password);

    @FormUrlEncoded
    @POST("auth/logout")
    Call<ModelBarang> logout(@Field("token") String token);

    @FormUrlEncoded
    @POST("auth/register")
    Call<ModelBarang> register(@Field("name") String name,
                                    @Field("email") String email,
                                    @Field("password") String password,
                                    @Field("address")String address,
                                    @Field("birth_date")String birth_date);

    //GET DATA
    @GET("category")
    Call<ModelBarang> getBarang(@Query("token") String token);
    
    //ADD DATA
    @FormUrlEncoded
    @POST("category")
    Call<ModelBarang> addBarang(@Field("NoBarang") String NoBarang,
                                @Field("idBarang") String idBarang,
                                @Field("namaBarang") String namaBarang,
                                @Field("stok") String stok,
                                @Field("hargaSatuan") String hargaSatuan,
                                @Field("totalHarga") String totalHarga);
    //UPDATE DATA
    @FormUrlEncoded
    @POST("category/{update_id}")
    Call<ModelBarang> updateBarang(@Path("update_id") String update_id,
                                   @Query("token") String token,
                                   @Field("NoBarang") String NoBarang,
                                   @Field("idBarang") String idBarang,
                                   @Field("namaBarang") String namaBarang,
                                   @Field("stok") String stok,
                                   @Field("hargaSatuan") String hargaSatuan,
                                   @Field("totalHarga") String totalHarga);
}
