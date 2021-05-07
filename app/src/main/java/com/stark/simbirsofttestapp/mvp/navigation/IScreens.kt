package com.stark.simbirsofttestapp.mvp.navigation

import com.github.terrakok.cicerone.Screen

interface IScreens {
    fun calendar(): Screen
    fun detailTask(id: Int): Screen
    fun newTask(): Screen
}