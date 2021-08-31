package com.example.apiassessment

import com.google.android.material.shape.ShapeAppearanceModel.builder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.stream.DoubleStream.builder

object APIClient {
    var retrofit = Retrofit.Builder()
        .baseUrl("<your base url goes here>")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun<T>buildApiClient(apiInterface: Class<T>): T{
        return retrofit.create(apiInterface)}}

