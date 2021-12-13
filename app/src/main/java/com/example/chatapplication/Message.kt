package com.example.chatapplication

class Message {
    var message: String? =  null
    var senrId: String? = null

    constructor() {}

    constructor(message: String?, senderId: String?) {
        this.message = message
        this.senrId = senderId
    }

}