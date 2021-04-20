package jp.techacademy.masahiro.kohmatsu.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button3 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
                if (2<=hour && hour<=9){
                    textView.text = "おはよう"

                }else if(10<=hour && hour<=17){
                    textView.text ="こんにちは"
                }else{
                    textView.text="こんばんは"
                }

            },
            13, 0, true)
        timePickerDialog.show()
    }

}