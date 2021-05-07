package com.stark.simbirsofttestapp.mvp.model

import java.sql.Timestamp


data class CalendarModel(
    var id: Int = 0,
    var dateStart: Timestamp? = null,
    var dateFinish: Timestamp? = null,
    var name: String = "New Task",
    var description: String = "New task description",
    )

