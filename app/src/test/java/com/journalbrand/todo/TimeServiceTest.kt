package com.journalbrand.todo

import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test
import java.time.Duration
import java.time.LocalDateTime
import java.time.Year

/**
 * Tests for the TimeService
 * These tests verify requirement System.4.Android.1
 */
class TimeServiceTest {
    
    /**
     * Test that the currentTime function returns a time close to now
     */
    @Test
    fun testCurrentTime() {
        // Given the timeService is initialized
        val timeService = TimeService()
        
        // When we get the current time
        val result = timeService.currentTime()
        val now = LocalDateTime.now()
        
        // Then the time should be within 1 second of now
        val duration = Duration.between(result, now).abs()
        assertTrue("Current time should be within 1 second of system time", duration.seconds < 1)
    }
    
    /**
     * Test that the currentTimeString function returns a non-empty string
     */
    @Test
    fun testCurrentTimeString() {
        // Given the timeService is initialized
        val timeService = TimeService()
        
        // When we get the current time as a string
        val result = timeService.currentTimeString()
        
        // Then the result should be a non-empty string
        assertFalse("Current time string should not be empty", result.isEmpty())
        
        // And should contain the current year
        val year = Year.now().value.toString()
        assertTrue("Current time string should contain the current year", result.contains(year))
    }
} 