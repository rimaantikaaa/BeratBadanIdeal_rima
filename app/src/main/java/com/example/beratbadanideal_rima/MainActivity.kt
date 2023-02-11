package com.example.beratbadanideal_rima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var inputNama : EditText
    private lateinit var inputTB : EditText
    private lateinit var jklakilaki : RadioButton
    private lateinit var jkperempuan : RadioButton
    private lateinit var hasil : TextView
    private lateinit var proses : Button

    private var tb: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputNama = findViewById(R.id.etNama)
        inputTB = findViewById(R.id.etTinggiBadan)
        jklakilaki = findViewById(R.id.rbLakilaki)
        jkperempuan = findViewById(R.id.rbPerempuan)
        hasil = findViewById(R.id.tvhasil)
        proses = findViewById(R.id.btnproses)

        proses.setOnClickListener {
            var tinggibadan = inputTB.text.toString().toInt()

            if (jklakilaki.isChecked){
                tb = (tinggibadan-100) - ((tinggibadan-100) * 10 / 100)
                hasil.setText(tb.toString() + "kg")
            } else {
                tb = (tinggibadan-100) - ((tinggibadan-100) * 15 / 100)
                hasil.setText(tb.toString() + "kg")
            }
        }
    }
}