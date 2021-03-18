package app.appsoluut.android.lottieimageexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import app.appsoluut.android.cliv.CLIView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CLIView.initialize(this)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        recyclerView.adapter = DummyAdapter(listOf(
            DummyItem("Image 1", CLIView.Type.IMAGE, "https://placekitten.com/128/48"),
            DummyItem("Animation 2 (loader)", CLIView.Type.ANIMATION, "52840-percentage-loader.json"),
            DummyItem("Image 3", CLIView.Type.IMAGE, "https://placekitten.com/120/48"),
            DummyItem("Animation 4 (none)", CLIView.Type.ANIMATION),
            DummyItem("Image 5", CLIView.Type.IMAGE, "https://placekitten.com/118/48"),
            DummyItem("Animation 6 (fire)", CLIView.Type.ANIMATION, "52717-fire.json"),
            DummyItem("Image 7", CLIView.Type.IMAGE, "https://placekitten.com/148/48"),
            DummyItem("Animation 8 (download)", CLIView.Type.ANIMATION, "52971-download-button.json"),
            DummyItem("Image 9//animation", CLIView.Type.ANIMATION, "52840-percentage-loader.json"),
            DummyItem("Animation 10 (success)", CLIView.Type.ANIMATION, "53122-success-burst-line.json"),
            DummyItem("Image 11", CLIView.Type.IMAGE),
            DummyItem("Animation 12 (dots)", CLIView.Type.ANIMATION, "53152-loading-dots.json"),
            DummyItem("Image 14", CLIView.Type.IMAGE),
            DummyItem("Animation 15", CLIView.Type.ANIMATION),
            DummyItem("Image 16", CLIView.Type.IMAGE),
            DummyItem("Animation 17", CLIView.Type.ANIMATION),
            DummyItem("Image 18", CLIView.Type.IMAGE, "https://placekitten.com/149/48"),
            DummyItem("Animation 19", CLIView.Type.ANIMATION),
            DummyItem("Image 20", CLIView.Type.IMAGE),
            DummyItem("Animation 21", CLIView.Type.ANIMATION),
            DummyItem("Image 22", CLIView.Type.IMAGE),
            DummyItem("Animation 23", CLIView.Type.ANIMATION),
            DummyItem("Image 24", CLIView.Type.IMAGE),
            DummyItem("Animation 25", CLIView.Type.ANIMATION),
            DummyItem("Image 26", CLIView.Type.IMAGE),
            DummyItem("Animation 27 (success)", CLIView.Type.ANIMATION, "53122-success-burst-line.json"),
            DummyItem("Image 28", CLIView.Type.IMAGE),
            DummyItem("Animation 29", CLIView.Type.ANIMATION),
            DummyItem("Image 30", CLIView.Type.IMAGE),
        ))
    }
}