package com.ingenieriajhr.bombatomica

import android.content.Context
import android.widget.Toast

class BombaAtomica(val context: Context) {

    fun boom(){
        Toast.makeText(context, "EXPLOTO BOOOM", Toast.LENGTH_SHORT).show()
    }

}