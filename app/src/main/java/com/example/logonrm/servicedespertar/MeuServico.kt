package com.example.logonrm.servicedespertar

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class MeuServico : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {


        if (intent?.extras != null){
            Log.i("MEUSERVICO", intent?.getStringExtra("parametro1"))
        }
        val mp = MediaPlayer.create(this, R.raw.ps)
        mp!!.start()
        Toast.makeText(this, "Alarme...", Toast.LENGTH_LONG).show()
        return START_REDELIVER_INTENT
    }

    override fun onBind(intent: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}