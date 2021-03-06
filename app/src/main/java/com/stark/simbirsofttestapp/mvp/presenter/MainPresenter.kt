package com.stark.simbirsofttestapp.mvp.presenter

import com.github.terrakok.cicerone.Router
import com.stark.simbirsofttestapp.mvp.navigation.IScreens
import com.stark.simbirsofttestapp.mvp.view.MainView
import moxy.MvpPresenter

class MainPresenter(val router: Router, val screens: IScreens) : MvpPresenter<MainView>() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(screens.calendar())
    }

    fun backClicked() {
        router.exit()
    }
}