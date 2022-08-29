package com.example.masmasfoodapp.MasmasApi

import android.telecom.Call
import com.example.masmasfoodapp.model.Model_for_CreateProfile
import retrofit2.http.Body
import retrofit2.http.POST

interface Masmas_Api {
   @POST("register.php/")
   fun SendCreateProfileData(@Body modelForCreateprofile: Model_for_CreateProfile):retrofit2.Call<Model_for_CreateProfile>

}



