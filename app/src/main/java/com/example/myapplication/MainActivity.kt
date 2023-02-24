package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var  zarResmi: ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zarButonu: Button = findViewById(R.id.zar_at_butonu)
        zarButonu.setOnClickListener {
//            Toast kodu basınca ekranda yazı çıkartıyor.
//            Toast.makeText(this, "Zar Atıldı", Toast.LENGTH_SHORT).show()
            ZarAt()
        }
        zarResmi= findViewById(R.id.zar_görseli)
    }

    private fun ZarAt() {
        val randomSayi = Random().nextInt(6) + 1
        val degiskenResim=when (randomSayi){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        zarResmi.setImageResource(degiskenResim)
//        val zar_numara:TextView=findViewById(R.id.zar_numara)
//        zar_numara.text=randomSayi.toString()


    }
}