package ru.gendalf13666.carmove

import android.view.animation.Animation
import android.widget.ImageView

interface Contract {
    interface Presenter {
        fun animation(animation: Animation?, img: ImageView?)
    }
}
