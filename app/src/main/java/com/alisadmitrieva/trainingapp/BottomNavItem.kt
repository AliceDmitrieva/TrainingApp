package com.alisadmitrieva.trainingapp

sealed class BottomNavItem(
    var title: String,
    var icon: Int,
    var screen_route: String,
) {

    object Trainings : BottomNavItem(
        "Trainings",
        R.drawable.ic_sport,
        "my_trainings",
    )

    object Nutrition : BottomNavItem(
        "Nutrition",
        R.drawable.ic_food,
        "my_nutrition",
    )
}
