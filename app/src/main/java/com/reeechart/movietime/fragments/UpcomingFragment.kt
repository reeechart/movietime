package com.reeechart.movietime.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.reeechart.movietime.R

/**
 * Created by Richard on 08-Jun-18.
 */
class UpcomingFragment: Fragment() {
    private val DEBUG_LOG: String = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.fragment_upcoming, container, false)
        var text = rootView.findViewById<TextView>(R.id.text)
        text.setText(DEBUG_LOG)
        return rootView
    }
}