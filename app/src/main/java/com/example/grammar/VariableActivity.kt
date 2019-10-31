package com.example.grammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_variable.*

class VariableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variable)

        val origin:Float=65.0f
        tv_origin.text=origin.toString() //控件显示数值
        //声明整型变量
        var int:Int
        //点击事件，显示内容
        btn_int.setOnClickListener { int=origin.toInt();tv_convert.text=int.toString() }

        //声明长整型变量
        var long:Long
        btn_long.setOnClickListener { long=origin.toLong();tv_convert.text=long.toString() }

        //声明浮点型变量
        var float:Float
        btn_float.setOnClickListener { float=origin.toFloat();tv_convert.text=float.toString() }

        //声明双精度型变量
        var double:Double
        btn_double.setOnClickListener { double=origin.toDouble();tv_convert.text=double.toString() }

        //声明布尔型变量
        var boolean:Boolean
        btn_boolean.setOnClickListener { boolean=origin.isNaN();tv_convert.text=boolean.toString() }

        //声明字符型变量
        var char:Char
        btn_char.setOnClickListener { char=origin.toChar();tv_convert.text=char.toString() }

    }
}
