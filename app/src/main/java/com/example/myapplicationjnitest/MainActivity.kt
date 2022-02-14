package com.example.myapplicationjnitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.gles.TestJni

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t:TestJni= TestJni();
        Toast.makeText(this,t.stringFromJNI(),Toast.LENGTH_SHORT).show();
    }
}