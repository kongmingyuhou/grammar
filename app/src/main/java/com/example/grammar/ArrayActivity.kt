package com.example.grammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_array.*

class ArrayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)

        //声明整型数组：方法1
        //var int_array:IntArray= intArrayOf(1,2,3)
        //声明整型数组：方法2
        var int_array:Array<Int> = arrayOf(1,2,3)
        btn_int.setOnClickListener { setArrayStr<Int>(int_array) }

        //声明长整数型数组：方法1
        //var long_array:LongArray= longArrayOf(1,2,3)
        //声明长整数型数组：方法1
        var long_array:Array<Long> = arrayOf(1,2,3)
        btn_long.setOnClickListener { setArrayStr<Long>(long_array) }

        //声明长浮点型数组：方法1
        //var float_array:FloatArray= floatArrayOf(1.0f,2.0f,3.0f)
        var float_array:Array<Float> = arrayOf(1.0f,2.0f,3.0f)
        btn_float.setOnClickListener { setArrayStr<Float>(float_array) }

        //声明双精度型数组：方法1
        //var double_array:DoubleArray= doubleArrayOf(1.0,2.0,3.0)
        var double_array:Array<Double> = arrayOf(1.0,2.0,3.0)
        btn_double.setOnClickListener { setArrayStr<Double>(double_array) }

        //声明布尔型数组：方法1
        //var boolean_array:BooleanArray= booleanArrayOf(true, false, true)
        var boolean_array:Array<Boolean> = arrayOf(true, false, true)
        btn_boolean.setOnClickListener {
            var str:String=""
            for (item in boolean_array){
                str=str+item.toString()+","
            }
            tv_item_list.text=str
        }

        //声明字符型数组：方法1
        //var char_array:CharArray= charArrayOf('a', 'b', 'c')
        var char_array:Array<Char> = arrayOf('a', 'b', 'c')
        btn_char.setOnClickListener {
            var str:String=""
            for (item in char_array){
                str=str+item.toString()+","
            }
            tv_item_list.text=str
        }

        //声明字符串型数组
        var string_array:Array<String> = arrayOf("How", "Are", "You")
        btn_string.setOnClickListener {
            var str:String=""
            var i:Int = 0
            while (i<string_array.size){
                str=str+string_array[i]+","
                //数组元素可以通过下标访问，也可通过get方法访问
                //str=str+string_array.get(i)
                i++
            }
//            for (item in string_array) {
//                str = str + item + ", "
//            }
            tv_item_list.text=str
        }
    }

    inline fun <reified T:Number> setArrayStr(array: Array<T>){
        var str:String=""
        for (item in array){
            str=str+item.toString()+","
        }
        tv_item_list.text=str
    }
}
