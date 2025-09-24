package com.ntg.network.sockets

sealed class SocketEvent {
    data object Open : SocketEvent()

    data class Message(
        val text: String,
    ) : SocketEvent()

    data class Closed(
        val code: Int,
        val reason: String,
    ) : SocketEvent()

    data class Error(
        val t: Throwable,
    ) : SocketEvent()
}