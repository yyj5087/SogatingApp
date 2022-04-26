package com.example.sogatingapp.utils

import com.google.firebase.auth.FirebaseAuth

class FirebaseAutoUtils {

    companion object {

        private lateinit var auth : FirebaseAuth

        fun getUid() : String {

            auth = FirebaseAuth.getInstance()

            return auth.currentUser?.uid.toString()
        }
    }
}