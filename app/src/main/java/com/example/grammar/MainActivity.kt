package com.example.grammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_variable.setOnClickListener { startActivity<VariableActivity>() }
        btn_array.setOnClickListener { startActivity<ArrayActivity>() }
    }
}
