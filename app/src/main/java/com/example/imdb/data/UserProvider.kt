package com.example.imdb.data

class UserProvider {
    companion object {
        val userList = listOf<UserLogin>(
            UserLogin(
                "Dago",
                "dago123"
            ),
            UserLogin(
                "Diego",
                "diego123"
            )
        )
    }
}