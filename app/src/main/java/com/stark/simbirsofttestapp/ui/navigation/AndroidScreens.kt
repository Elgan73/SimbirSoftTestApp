package com.stark.simbirsofttestapp.ui.navigation

import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.stark.simbirsofttestapp.mvp.navigation.IScreens
import com.stark.simbirsofttestapp.ui.fragments.CalendarFragment
import com.stark.simbirsofttestapp.ui.fragments.DetailFragment
import com.stark.simbirsofttestapp.ui.fragments.NewTaskFragment

class AndroidScreens: IScreens {
    override fun calendar(): Screen = FragmentScreen { CalendarFragment.newInstance() }
    override fun detailTask(id: Int): Screen = FragmentScreen { DetailFragment.newInstance() }
    override fun newTask(): Screen = FragmentScreen { NewTaskFragment.newInstance() }


}