package com.example.apiassessment

import com.google.gson.annotations.SerializedName

data class prodResponse(@SerializedName("number_one") var number_one:String ,
                        @SerializedName("number_two") var number_two:String)
