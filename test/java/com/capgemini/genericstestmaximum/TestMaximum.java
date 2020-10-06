package com.capgemini.genericstestmaximum;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test for maximum among three 
 */
public class TestMaximum 
{
	
    @Test
    public void givenMaxAtPositionOne_ShouldReturnSameString()
    {
    	String max = FindMaximum.findMaximum("Peach","Apple","Banana");
        assertEquals("Peach", max);
    }
    
    @Test
    public void givenMaxAtPositionTwo_ShouldReturnSameString()
    {
    	String max = FindMaximum.findMaximum("Apple", "Peach","Banana");
    	assertEquals("Peach", max);
    }
    
    @Test
    public void givenMaxAtPositionThree_ShouldReturnSameString()
    {
    	String max = FindMaximum.findMaximum("Apple","Banana", "Peach");
    	assertEquals("Peach", max);
    }
}
