package org.example.todolistserverchapter3.api.v1.exception.dto

data class ErrorDto(
    val message: String?,
    val errorCode: String
)