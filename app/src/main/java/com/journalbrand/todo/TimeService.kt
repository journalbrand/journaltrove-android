package com.journalbrand.todo

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Provides current system time
 * Implements requirement System.4.Android.1
 */
class TimeService {
    /**
     * Returns the current system time
     * @return Current date and time
     */
    fun currentTime(): LocalDateTime {
        return LocalDateTime.now()
    }
    
    /**
     * Returns the current time as formatted string
     * @return String representation of current time
     */
    fun currentTimeString(): String {
        val formatter = DateTimeFormatter.ofPattern("MMM d, yyyy HH:mm:ss")
        return currentTime().format(formatter)
    }
} 