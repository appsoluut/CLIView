package app.appsoluut.android.lottieimageexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DummyAdapter(items: List<DummyItem>) : RecyclerView.Adapter<CLIViewHolder>() {
    private val items = mutableListOf<DummyItem>()

    init {
        this.items.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CLIViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return CLIViewHolder(view)
    }

    override fun onBindViewHolder(holder: CLIViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size
}