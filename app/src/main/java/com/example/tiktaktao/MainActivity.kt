package com.example.tiktaktao

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

var turn = 1
    var steps = 0

    lateinit var tv1: TextView
    lateinit var tv2: TextView
    lateinit var tv3: TextView

    lateinit var tv4: TextView
    lateinit var tv5: TextView
    lateinit var tv6: TextView

    lateinit var tv7: TextView
    lateinit var tv8: TextView
    lateinit var tv9: TextView

    lateinit var tvResult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tvResult = findViewById<TextView>(R.id.tvResult)
        val tvRestart = findViewById<TextView>(R.id.tvRestart)

        tvRestart.setOnClickListener {
            recreateActivity()
        }

        tv1 = findViewById<TextView>(R.id.tv1)
        tv2 = findViewById<TextView>(R.id.tv2)
        tv3 = findViewById<TextView>(R.id.tv3)

        tv4 = findViewById<TextView>(R.id.tv4)
        tv5 = findViewById<TextView>(R.id.tv5)
        tv6 = findViewById<TextView>(R.id.tv6)

        tv7 = findViewById<TextView>(R.id.tv7)
        tv8 = findViewById<TextView>(R.id.tv8)
        tv9 = findViewById<TextView>(R.id.tv9)

//change background color and gravity of textview
for (i in 1..9) {
    val textViewId = resources.getIdentifier("tv$i", "id", packageName)
    val textView = findViewById<TextView>(textViewId)
    textView.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
    textView.gravity = Gravity.CENTER
}


//set 1 start
        tv1.setOnClickListener {

            if (turn == 1) {
                tv1.text = "X"
                turn = 2
                tv1.isClickable = false

            } else {
                tv1.text = "O"
                turn = 1
                tv1.isClickable = false

            }
checkMe()

        }


        tv2.setOnClickListener {

            if (turn == 1) {
                tv2.text = "X"
                turn = 2
                tv2.isClickable = false

            } else {
                tv2.text = "O"
                turn = 1
                tv2.isClickable = false

            }
            checkMe()

        }


        tv3.setOnClickListener {

            if (turn == 1) {
                tv3.text = "X"
                turn = 2
                tv3.isClickable = false

            } else {
                tv3.text = "O"
                turn = 1
                tv3.isClickable = false

            }
            checkMe()

        }
//set 1 end


        //set 2 start
        tv4.setOnClickListener {

            if (turn == 1) {
                tv4.text = "X"
                turn = 2
                tv4.isClickable = false

            } else {
                tv4.text = "O"
                turn = 1
                tv4.isClickable = false

            }
            checkMe()

        }


        tv5.setOnClickListener {

            if (turn == 1) {
                tv5.text = "X"
                turn = 2
                tv5.isClickable = false

            } else {
                tv5.text = "O"
                turn = 1
                tv5.isClickable = false

            }
            checkMe()

        }


        tv6.setOnClickListener {

            if (turn == 1) {
                tv6.text = "X"
                turn = 2
                tv6.isClickable = false

            } else {
                tv6.text = "O"
                turn = 1
                tv6.isClickable = false

            }
            checkMe()

        }
//set 2 end


        //set 3 start
        tv7.setOnClickListener {

            if (turn == 1) {
                tv7.text = "X"
                turn = 2
                tv7.isClickable = false

            } else {
                tv7.text = "O"
                turn = 1
                tv7.isClickable = false

            }
            checkMe()

        }


        tv8.setOnClickListener {

            if (turn == 1) {
                tv8.text = "X"
                turn = 2
                tv8.isClickable = false

            } else {
                tv8.text = "O"
                turn = 1
                tv8.isClickable = false

            }
            checkMe()

        }


        tv9.setOnClickListener {

            if (turn == 1) {
                tv9.text = "X"
                turn = 2
                tv9.isClickable = false

            } else {
                tv9.text = "O"
                turn = 1
                tv9.isClickable = false

            }
            checkMe()

        }
        //set 3 end
    }

//checkMe function for logic of game
    private fun checkMe(){

steps++

//1
    if (tv1.text == tv2.text && tv2.text == tv3.text) {

        tv1.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv2.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv3.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

        winner("1 to 3")
    }

//2
    if (tv1.text == tv4.text && tv4.text == tv7.text) {

        tv1.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv4.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv7.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

        winner("1 to 7")
    }

//3
    if (tv1.text == tv5.text && tv5.text == tv9.text) {

        tv1.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv5.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv9.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

        winner("1 to 9")
    }

//4
    if (tv2.text == tv5.text && tv5.text == tv8.text) {

        tv2.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv5.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv8.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

        winner("2 to 8")
    }

//5
    if (tv3.text == tv5.text && tv5.text == tv7.text) {

        tv3.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv5.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv7.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

        winner("3 to 7")
    }

//6
    if (tv3.text == tv6.text && tv6.text == tv9.text) {

        tv3.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv6.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv9.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

        winner("3 to 9")
    }

//7
    if (tv4.text == tv5.text && tv5.text == tv6.text) {

        tv4.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv5.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv6.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

        winner("4 to 6")
    }

//8
    if (tv7.text == tv8.text && tv8.text == tv9.text) {

        tv7.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv8.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
        tv9.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

        winner("7 to 9")
    }

if(steps == 9) {
    draw()

}

}
//checkMe function ended

//winner function
private fun winner(w: String){
    if(turn == 2){
        tvResult.text = "X is winner "

        for (i in 1..9) {
            val textViewId = resources.getIdentifier("tv$i", "id", packageName)
            val textView = findViewById<TextView>(textViewId)
            textView.isClickable = false

        }

    }
    else {
        tvResult.text = "O is winner"

        for (i in 1..9) {
            val textViewId = resources.getIdentifier("tv$i", "id", packageName)
            val textView = findViewById<TextView>(textViewId)
            textView.isClickable = false
        }

    }
}

    //draw function
    private fun draw(){

 tvResult.text = "Match Draw no winner"

    }


    private fun recreateActivity() {
        // Recreate the activity
        recreate()


    }

}
