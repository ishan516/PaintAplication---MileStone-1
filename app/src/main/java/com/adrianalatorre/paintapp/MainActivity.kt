package com.adrianalatorre.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.adrianalatorre.paintapp.PaintView.Companion.colorList
import com.adrianalatorre.paintapp.PaintView.Companion.currentBrush
import com.adrianalatorre.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        //Set of 3 colors and reset button on the top toolbar
        var redBtn = findViewById<ImageButton>(R.id.redColor) //red variable called in the activity main xml
        var blueBtn = findViewById<ImageButton>(R.id.blueColor)//blue variable called in the activity main xml
        var blackBtn = findViewById<ImageButton>(R.id.blackColor)//black variable called in the activity main xml
        var eraser = findViewById<ImageButton>(R.id.whiteColor)//reset variable to clean the canvas
        var rubberBtn = findViewById<ImageButton>(R.id.rubber)


        //Event listen to detect when the color red has been selected
        redBtn.setOnClickListener{
            Toast.makeText(this, "CLicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        //Event listen to detect when the color blue has been selected
        blueBtn.setOnClickListener{
            Toast.makeText(this, "CLicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        //Event listen to detect when the color black has been selected
        blackBtn.setOnClickListener{
            Toast.makeText(this, "CLicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }
        rubberBtn.setOnClickListener{
            Toast.makeText(this, "CLicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.WHITE
            currentColor(paintBrush.color)
        }
        //Event listen to reset the canvas
        eraser.setOnClickListener{
            Toast.makeText(this, "CLicked", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private fun currentColor(color:Int){
        currentBrush = color
        path = Path()
    }
}