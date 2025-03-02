package com.journalbrand.todo

import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

/**
 * A simple service that echoes back provided strings
 *
 * This service fulfills Req.Android.1 by demonstrating input handling capability
 */
class EchoService {
    
    /**
     * Echo back the provided message
     * @param message The input message
     * @return The same message, echoed back
     */
    fun echo(message: String): String {
        return message
    }
    
    /**
     * Echo back the provided message with a timestamp
     * @param message The input message
     * @return The message with current timestamp appended
     */
    fun echoWithTimestamp(message: String): String {
        val formatter = DateTimeFormatter.ISO_INSTANT
        val timestamp = formatter.format(Instant.now())
        
        return "$message (timestamp: $timestamp)"
    }
} 