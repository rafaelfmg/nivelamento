package com.gloriadiaszup.model.entity.mappers

import java.text.SimpleDateFormat

class Date {

    fun asString(date: Date): String{
        return SimpleDateFormat("dd/MM/yyyy").format(date)
    }
    fun asDate(date: String): java.util.Date{
        return SimpleDateFormat("dd/MM/yyyy").parse(date)
    }
}