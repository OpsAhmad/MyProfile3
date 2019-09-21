package com.potatoeswarehouse.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn_simpan
import kotlinx.android.synthetic.main.activity_main.btn_simpan
import kotlinx.android.synthetic.main.activity_main.editText_alamat
import kotlinx.android.synthetic.main.activity_main.editText_email
import kotlinx.android.synthetic.main.activity_main.editText_nama
import kotlinx.android.synthetic.main.activity_main.editText_phone
import kotlinx.android.synthetic.main.activity_main.spinner_gender

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_simpan.setOnClickListener {

            val nama = editText_nama.text.toString()
            val gender = spinner_gender.selectedItem.toString()
            val telepon = editText_phone.text.toString()
            val email = editText_email.text.toString()
            val alamat = editText_alamat.text.toString()

            val intent = Intent(
                this
                , ProfileActivity::class.java
            )

            intent.putExtra("nama", nama)
            intent.putExtra("gender", gender)
            intent.putExtra("telepon", telepon)
            intent.putExtra("email", email)
            intent.putExtra("alamat", alamat)

            startActivity(intent)
        }
    }
}
