package app.appsoluut.android.lottieimageexample

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.appsoluut.android.cliv.CLIView

class CLIViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val nameView: TextView = itemView.findViewById(R.id.name)
    private val cliView: CLIView = itemView.findViewById(R.id.cli_view)

    fun bindItem(item: DummyItem) {
        Log.d("CLIView", "binding $item")
        nameView.text = item.name
        cliView.mode = item.type
        cliView.setAsset(item.asset)
    }
}