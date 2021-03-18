package app.appsoluut.android.cliv

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView

/**
 * TODO: document your custom view class.
 */
class CLIView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attributeSet, defStyleAttr) {

    private lateinit var animationView: LottieAnimationView
    private lateinit var imageView: SimpleDraweeView

    var mode: Type = Type.IMAGE

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.cliview, this)

        val a = context.obtainStyledAttributes(attributeSet, R.styleable.CLIView, defStyleAttr, 0)
        if (a.hasValue(R.styleable.CLIView_type)) {
            mode = Type.parse(a.getInt(R.styleable.CLIView_type, 0))
        }
        a.recycle()

        initImageView()
        initAnimationView()
    }

    fun setAsset(asset: String?) {
        Log.d("CLIView", "changing to asset = $asset // $mode")

        if (asset.isNullOrBlank()) {
            clearImageView()
            clearAnimationView()
        } else {
            when(mode) {
                Type.ANIMATION -> loadAnimation(asset)
                Type.IMAGE -> loadImage(asset)
            }
        }
    }

    private fun loadImage(asset: String) {
        clearAnimationView()

        imageView.setImageURI(asset)
        imageView.visibility = View.VISIBLE
    }

    private fun loadAnimation(asset: String) {
        clearImageView()

        animationView.setAnimation(asset)
        animationView.playAnimation()
        animationView.visibility = View.VISIBLE
    }

    private fun clearImageView() {
        imageView.setImageURI(null as String?)
        imageView.visibility = View.GONE
    }

    private fun clearAnimationView() {
        animationView.pauseAnimation()
        animationView.visibility = View.GONE
    }

    private fun initImageView() {
        imageView = findViewById(R.id.image_view)
    }

    private fun initAnimationView() {
        animationView = findViewById(R.id.animation_view)
        animationView.repeatCount = LottieDrawable.INFINITE
    }

    enum class Type(val type: Int) {
        IMAGE(0),
        ANIMATION(1);

        companion object {
            fun parse(type: Int): Type {
                values().forEach {
                    if (it.type == type) {
                        return it
                    }
                }
                return IMAGE
            }
        }
    }

    companion object {
        fun initialize(context: Context) {
            Fresco.initialize(context)
        }
    }
}