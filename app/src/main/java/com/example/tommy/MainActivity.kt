package com.example.tommy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //layouts
        var tablica = findViewById<LinearLayout>(R.id.tablica);
        var header = findViewById<LinearLayout>(R.id.header_linear);
        var wers_jeden = findViewById<LinearLayout>(R.id.first_linear);
        var wers_dwa = findViewById<LinearLayout>(R.id.second_linear);
        var wers_trzy = findViewById<LinearLayout>(R.id.third_linear);
        var wers_cztery = findViewById<LinearLayout>(R.id.fourth_linear);
        var wers_piec = findViewById<LinearLayout>(R.id.fifth_linear);
        var wers_szesc = findViewById<LinearLayout>(R.id.sixth_linear);
        var wers_siedem = findViewById<LinearLayout>(R.id.seventh_linear);
        var wers_osiem = findViewById<LinearLayout>(R.id.eigth_linear);
        //Buttons
        var dodawwanie = findViewById<Button>(R.id.dodaj_btn);
        //zmienne
        var wypelnienie = 3;
        //textviews
        var x_test = findViewById<TextView>(R.id.x_4_txt)
        var id_map_x = mapOf<Int, Int>(Pair(1, R.id.x_1_txt), Pair(2, R.id.x_2_txt), Pair(3, R.id.x_3_txt), Pair(4, R.id.x_4_txt), Pair(5, R.id.x_5_txt), Pair(6, R.id.x_6_txt), Pair(7, R.id.x_7_txt), Pair(8, R.id.x_8_txt))
        var id_map_y = mapOf<Int, Int>(Pair(1, R.id.y_1_txt), Pair(2, R.id.y_2_txt), Pair(3, R.id.y_3_txt), Pair(4, R.id.y_4_txt), Pair(5, R.id.y_5_txt), Pair(6, R.id.y_6_txt), Pair(7, R.id.y_7_txt), Pair(8, R.id.y_8_txt))
        var id_map_nazwa = mapOf<Int, Int>(Pair(1, R.id.nazwa_1_txt), Pair(2, R.id.nazwa_2_txt), Pair(3, R.id.nazwa_3_txt), Pair(4, R.id.nazwa_4_txt), Pair(5, R.id.nazwa_5_txt), Pair(6, R.id.nazwa_6_txt), Pair(7, R.id.nazwa_7_txt), Pair(8, R.id.nazwa_8_txt))

        dodawwanie.setOnClickListener {
            if(wypelnienie<8){
                wypelnienie++;
                Log.d("1",wypelnienie.toString())
                var x = findViewById<TextView>(id_map_x.get(wypelnienie)!!)
                x.setText("dupa")
                var y = findViewById<TextView>(id_map_y.get(wypelnienie)!!)
                y.setText("dupa")
                var nazwa = findViewById<TextView>(id_map_nazwa.get(wypelnienie)!!)
                nazwa.setText("dupa")
            }
        }
    }
}