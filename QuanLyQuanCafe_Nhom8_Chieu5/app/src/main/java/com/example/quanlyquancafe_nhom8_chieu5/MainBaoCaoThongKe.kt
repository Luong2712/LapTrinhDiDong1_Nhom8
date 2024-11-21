package com.example.quanlyquancafe_nhom8_chieu5

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainBaoCaoThongKe : AppCompatActivity() {
    private lateinit var imgBack: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_bao_cao_thong_ke)
        setControl()
        setEvent()
    }
    fun setControl(){
        imgBack = findViewById(R.id.imgBack)
    }
    fun setEvent(){
        imgBack.setOnClickListener{
            finish()
        }
    }
}