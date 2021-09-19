package com.example.recipepal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView




class MainActivity : AppCompatActivity() {

    lateinit var newNoteIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newNoteIcon = findViewById(R.id.addNoteIcon)
        newNoteIcon.setImageResource(R.drawable.profile_male)


    }
}