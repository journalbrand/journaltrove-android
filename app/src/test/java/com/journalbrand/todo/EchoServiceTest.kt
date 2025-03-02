package com.journalbrand.todo

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

/**
 * Tests for the EchoService
 * 
 * These tests verify requirements in Req.Android.1 for input handling
 */
class EchoServiceTest {
    
    private lateinit var echoService: EchoService
    
    @Before
    fun setUp() {
        echoService = EchoService()
    }
    
    /**
     * Test that the echo method returns the same string that was provided
     */
    @Test
    fun testEcho() {
        // Given
        val input = "Hello, World!"
        
        // When
        val output = echoService.echo(input)
        
        // Then
        assertEquals("Echo should return the same string that was input", input, output)
    }
    
    /**
     * Test that the echoWithTimestamp method includes both the original message and a timestamp
     */
    @Test
    fun testEchoWithTimestamp() {
        // Given
        val input = "Hello, World!"
        
        // When
        val output = echoService.echoWithTimestamp(input)
        
        // Then
        assertTrue("Output should contain the original input", output.contains(input))
        assertTrue("Output should contain a timestamp", output.contains("timestamp:"))
    }
    
    /**
     * Test that the echo method works with empty strings
     */
    @Test
    fun testEchoWithEmptyString() {
        // Given
        val input = ""
        
        // When
        val output = echoService.echo(input)
        
        // Then
        assertEquals("Echo should work with empty strings", input, output)
    }
} 