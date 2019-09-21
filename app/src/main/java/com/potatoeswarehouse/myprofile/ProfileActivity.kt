package com.potatoeswarehouse.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.tv_alamat
import kotlinx.android.synthetic.main.activity_profile.tv_gender
import kotlinx.android.synthetic.main.activity_profile.tv_nama
import kotlinx.android.synthetic.main.activity_profile.tv_phone

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val intent = intent
        val nama = intent.getStringExtra("nama")
        val gender = intent.getStringExtra("gender")
        val phone = intent.getStringExtra("telepon")
        val alamat = intent.getStringExtra("alamat")

        tv_nama.text = nama
        tv_gender.text= gender
        tv_phone.text=phone
        tv_alamat.text=alamat
    }
}
