package ru.spb.speech.appSupport

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import ru.spb.speech.R

class ProgressHelper(ctx: Context, rootView: FrameLayout, subviews: List<View>) {

    private var root: FrameLayout = rootView
    private var progressView: View
    private var subviewList: List<View> = subviews

    init {
        progressView = View.inflate(ctx, R.layout.progress_view, null)
    }

    fun show() {
        for (v in subviewList) {
            v.visibility = View.INVISIBLE
        }
        root.addView(progressView)
    }

    fun hide() {
        for (v in subviewList) {
            v.visibility = View.VISIBLE
        }

        root.removeView(progressView)
    }
}