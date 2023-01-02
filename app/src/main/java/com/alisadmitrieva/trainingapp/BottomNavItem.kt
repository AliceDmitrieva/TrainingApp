package com.alisadmitrieva.trainingapp

sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String) {

    object Trainings : BottomNavItem(
        "Trainings",
        R.drawable.ic_launcher_foreground,
        "trainings",
    )

    object MyNotes: BottomNavItem(
        "My Notes",
        R.drawable.ic_launcher_foreground,
        "my_notes",
    )
}

