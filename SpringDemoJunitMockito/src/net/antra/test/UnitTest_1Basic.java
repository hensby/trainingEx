package net.antra.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest_1Basic {
	@Test
	public void testTrue(){
		assertTrue(1==1);
	}
	
	@Test
	public void testFalse(){
		assertFalse(1==1);
	}
	
	@Test
	public void testEquals(){
		assertEquals("A","A");
	}
}
