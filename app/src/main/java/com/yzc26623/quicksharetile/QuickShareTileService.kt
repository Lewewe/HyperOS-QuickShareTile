package com.yzc26623.quicksharetile

import android.app.PendingIntent
import android.content.ComponentName
import android.content.Intent
import android.graphics.drawable.Icon
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

class QuickShareTileService : TileService() {

    override fun onStartListening() {
        super.onStartListening()

        qsTile?.apply {
            label = getString(R.string.quick_share)

            icon = Icon.createWithResource(
                this@QuickShareTileService,
                R.drawable.ic_quick_share_tile
            )

            state = Tile.STATE_ACTIVE

            updateTile()
        }
    }

    override fun onClick() {
        super.onClick()

        val intent = Intent().apply {
            component = ComponentName(
                "com.google.android.gms",
                "com.google.android.gms.nearby.sharing.main.MainActivity"
            )
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }

        val pendingIntent = PendingIntent.getActivity(
            this,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or
                    PendingIntent.FLAG_IMMUTABLE
        )

        startActivityAndCollapse(pendingIntent)
    }
}