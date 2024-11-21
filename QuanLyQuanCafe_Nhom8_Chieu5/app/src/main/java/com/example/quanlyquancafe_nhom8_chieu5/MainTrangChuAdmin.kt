package com.example.quanlyquancafe_nhom8_chieu5

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainTrangChuAdmin : AppCompatActivity() {
    private lateinit var imgSanPham:ImageView
    private lateinit var imgLoaiSanPham:ImageView
    private lateinit var imgBaoCao:ImageView
    private lateinit var imgTaiKhoan:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_trang_chu_admin)
        setControl();
        setEvent()
    }
    fun setControl(){
        imgSanPham = findViewById(R.id.imgSanPham)
        imgLoaiSanPham = findViewById(R.id.imgLoaiSanPham)
        imgBaoCao = findViewById(R.id.imgBaoCao)
        imgTaiKhoan = findViewById(R.id.imgTaiKhoan)
    }
    fun setEvent(){
        imgBaoCao.setOnClickListener {
            var intent = Intent(this, MainBaoCaoThongKe::class.java)
            startActivity(intent)

        }
    }

}