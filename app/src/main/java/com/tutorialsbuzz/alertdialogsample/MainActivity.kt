package com.tutorialsbuzz.alertdialogsample

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showAlertDialog(view: View): Unit {

        val builder: AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)

        builder.setTitle("Title")
        builder.setMessage("Message")
        builder.setIcon(R.mipmap.ic_launcher)

        builder.setPositiveButton("ok", DialogInterface.OnClickListener { dialog, id ->
            dialog.dismiss()
        })
        builder.setNegativeButton("cancel", { dialog, id ->
            dialog.dismiss()
        })

        builder.setNeutralButton("Can't Say", { dialog, i ->
            dialog.dismiss()
        })

        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()

    }

}
