package com.example.studyapp

import android.os.Parcel
import android.os.Parcelable
import android.telecom.Call

data class Cards ( var cardTitle:String, var cardDetails: String) {

    companion object {

        fun funAndroid(): ArrayList<Cards> {
            val list = ArrayList<Cards>()
            list.add(
                Cards(
                    "Project Setup", "Setting up an Android Studio Project."
                )
            )
            list.add(
                Cards(
                    "Console", "Printing to the console."
                )
            )

            list.add(
                Cards(
                    "Resource Files", "Identifying, editing, and using resource files."
                )
            )
            list.add(
                Cards(
                    "UI Elements", "Creating, modifying, and initializing UI Elements."
                )
            )
            return list
        }

        fun funKotlin(): ArrayList<Cards> {
            val list = ArrayList<Cards>()
            list.add(
                Cards(
                    "var and val", "Declaring variables."
                )
            )
            list.add(
                Cards(
                    "User Input", "Getting user input."
                )
            )

            list.add(
                Cards(
                    "Strings", "String concatenations, interpolation, and methods."
                )
            )
            list.add(
                Cards(
                    "Data Types", "Understanding data types."
                )
            )
            list.add(
                Cards(
                    "Basic Operations", "Performing math operations in Kotlin."
                )
            )
            list.add(
                Cards(
                    "If Statements",
                    "Understanding when and how to use if, else if, and else statements."
                )
            )
            list.add(
                Cards(
                    "Error Handling", "Using try blocks to avoid runtime errors."
                )
            )
            list.add(
                Cards(
                    "For Loops", "Using for loops to automate code."
                )
            )
            list.add(
                Cards(
                    "While Loops", "Using while loops to automate code."
                )
            )
            return list
        }
    }
}