package com.example.serverapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.serverapplication.R
import com.example.serverapplication.server.ServerInitializer
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var server: ServerInitializer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        server.initServerQuery(filesDir)
    }
}