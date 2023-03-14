package com.example.thirtydaysapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydaysapp.R

data class Day(@StringRes val title: Int, @StringRes val description: Int, @DrawableRes val imageRes: Int, val day: Int)


val days = listOf(
    Day(R.string.day_title_1, R.string.day_description_1, R.drawable.badge_1, 1),
    Day(R.string.day_title_2, R.string.day_description_2, R.drawable.badge_2, 2),
    Day(R.string.day_title_3, R.string.day_description_3, R.drawable.badge_3, 3),
    Day(R.string.day_title_4, R.string.day_description_4, R.drawable.badge_4, 4),
)