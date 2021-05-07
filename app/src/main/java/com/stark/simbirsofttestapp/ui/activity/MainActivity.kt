package com.stark.simbirsofttestapp.ui.activity

import android.os.Bundle
import android.view.View
import com.github.terrakok.cicerone.androidx.AppNavigator
import com.stark.simbirsofttestapp.R
import com.stark.simbirsofttestapp.databinding.ActivityMainBinding
import com.stark.simbirsofttestapp.mvp.presenter.MainPresenter
import com.stark.simbirsofttestapp.mvp.view.MainView
import com.stark.simbirsofttestapp.ui.App
import com.stark.simbirsofttestapp.ui.BackClickListener
import com.stark.simbirsofttestapp.ui.navigation.AndroidScreens
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    val navigator = AppNavigator(this, R.id.container)

    private var vb: ActivityMainBinding? = null

    private val presenter by moxyPresenter {
        MainPresenter(App.instance.router, AndroidScreens())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        App.instance.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        App.instance.navigatorHolder.removeNavigator()
    }

    override fun onBackPressed() {
        supportFragmentManager.fragments.forEach {
            if(it is BackClickListener && it.backPressed()) {
                return
            }
        }
        presenter.backClicked()
    }

}