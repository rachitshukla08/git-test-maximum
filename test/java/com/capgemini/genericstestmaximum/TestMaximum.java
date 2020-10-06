package com.capgemini.genericstestmaximum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test for maximum
 */
public class TestMaximum 
{
	
    @Test
    public void givenMaxAtPositionOne_ShouldReturnSameNumber()
    {
        Float max = FindMaximum.findMaximum(5.5f, 3.2f, 1.8f);
        assertEquals(5.5, max, 0.0);
    }
    
    @Test
    public void givenMaxAtPositionTwo_ShouldReturnSameNumber()
    {
        Float max = FindMaximum.findMaximum(3.2f , 5.5f , 1.8f);
        assertEquals(5.5, max, 0.0);
    }
    
    @Test
    public void givenMaxAtPositionThree_ShouldReturnSameNumber()
    {
        Float max = FindMaximum.findMaximum(3.2f, 1.5f, 5.5f);
        assertEquals(5.5, max, 0.0);
    }
}
