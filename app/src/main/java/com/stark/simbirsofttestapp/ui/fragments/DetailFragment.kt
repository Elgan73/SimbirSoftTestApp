package com.stark.simbirsofttestapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stark.simbirsofttestapp.R
import com.stark.simbirsofttestapp.mvp.view.DetailView
import com.stark.simbirsofttestapp.ui.BackClickListener
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

class DetailFragment() : MvpAppCompatFragment(), DetailView, BackClickListener {

    companion object {
        fun newInstance() = DetailFragment()
    }

//    private val presenter by moxyPresenter {
//
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun getDetails() {
        TODO("Not yet implemented")
    }

    override fun backPressed(): Boolean {
        TODO("Not yet implemented")
    }


}