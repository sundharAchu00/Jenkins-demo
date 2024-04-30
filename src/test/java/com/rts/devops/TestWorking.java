package com.rts.devops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rts.devops.WorkLog;

public class TestWorking {
	
	WorkLog log = new WorkLog();
	
	@Test
	public void testAddlog() {
		assertEquals( "added log for : Romeo", log.addToLog("Romeo"));
	}
	
	@Test
	public void testAddlog2() {
		assertEquals( "added log for : Sundhar", log.addToLog("Sundhar"));
	}
	
	@Test
	public void testLogins() {
		assertEquals("Added login for : Remo", log.addLogins("Remo"));
	}
	
	
	@Test
	public void testLogins2() {
		assertEquals("Added login for : Monkey", log.addLogins("Monkey"));
	}

}
