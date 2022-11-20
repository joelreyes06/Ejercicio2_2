package com.example.ejercicio2_2.Interfaces;

import com.example.ejercicio2_2.Models.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Interfaces {
    String rutaTotal = "/posts";
    String rutaSeleccionada = "/posts/{value}";

    @GET(rutaTotal)
    Call<List<Usuario>> getTotal();

    @GET(rutaSeleccionada)
    Call<Usuario> getUsuario(@Path("value") String value);

}
