package org.example.todolistserverchapter3.api.v1.domain.user.dto

data class UserDto(
    val id: Long,
    val nickname: String,
    val email: String,
    val role: String,
)