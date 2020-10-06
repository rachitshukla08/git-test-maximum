package com.capgemini.genericstestmaximum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestMaximum 
{
	
    @Test
    public void givenMaxAtPositionOne_ShouldReturnSameNumber()
    {
        int max = FindMaximum.findMaximum(5, 3, 1);
        assertEquals(5, max);
    }
    
    @Test
    public void givenMaxAtPositionTwo_ShouldReturnSameNumber()
    {
        int max = FindMaximum.findMaximum(3, 5, 1);
        assertEquals(5, max);
    }
    
    @Test
    public void givenMaxAtPositionThree_ShouldReturnSameNumber()
    {
        int max = FindMaximum.findMaximum(3, 1, 5);
        assertEquals(5, max);
    }
}
