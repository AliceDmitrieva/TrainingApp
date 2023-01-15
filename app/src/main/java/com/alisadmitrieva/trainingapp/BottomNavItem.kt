package com.alisadmitrieva.trainingapp

sealed class BottomNavItem(
    var title: String,
    var icon: Int,
    var screen_route: String,
) {

    object Trainings : BottomNavItem(
        "Trainings",
        R.drawable.ic_sport,
        "trainings",
    )

    object Calendar : BottomNavItem(
        "Calendar",
        R.drawable.ic_calendar,
        "calendar",
    )

    object Nutrition : BottomNavItem(
        "Nutrition",
        R.drawable.ic_food,
        "nutrition",
    )

    object Profile : BottomNavItem(
        "Profile",
        R.drawable.ic_person,
        "profile",
    )
}
