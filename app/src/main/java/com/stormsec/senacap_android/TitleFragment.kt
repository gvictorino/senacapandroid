package com.stormsec.senacap_android

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_titles.*

class TitleFragment : Fragment(){
    private lateinit var buttonMine : Button
    private lateinit var buttonResults : Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_titles, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonMine = myTitles
        buttonResults = results

        buttonMine.setOnClickListener { activity?.let { it1 -> Navigation.goToMyTitles(it1) } }
        buttonResults.setOnClickListener { activity?.let { it1 -> Navigation.goToResults(it1) } }

    }
}