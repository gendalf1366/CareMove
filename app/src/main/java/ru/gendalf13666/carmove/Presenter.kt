package ru.gendalf13666.carmove

import android.view.animation.Animation
import android.widget.ImageView

class Presenter : Contract.Presenter {
    override fun animation(animation: Animation?, img: ImageView?) {
        with(animation) {
            this?.setDuration(2000)
        }
        with(img) { this?.startAnimation(animation) }
    }
}
