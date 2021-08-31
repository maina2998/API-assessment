package com.example.apiassessment

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface APIInterface {
    @POST("/calculator/addition")
    suspend fun Addition(@Body EnterRequest: EnterRequest): Response<EnterResponse>


    @POST("calculator/minus")
    suspend fun Substraction(@Body minusrequest:minusrequest ): Response<minusresponse>

    @POST("/calculator/multiply")
    suspend fun Multiplication(@Body mulitplyRequest: mulitplyRequest): Response<multiplyResponse>


    @POST("calculator/prod")
    suspend fun Division(@Body prodRequest:prodRequest ):Response<prodResponse>


}