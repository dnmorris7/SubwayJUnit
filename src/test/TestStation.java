package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import com.codecrunchcorner.subway.Station;

import com.codecrunchcorner.*;


public class TestStation {

	private Station testStation;
	
	@Before
	public void setup(){
		testStation = new Station("test");
		
	}
	
	@After
	public void tearDown(){
		testStation = null;
		
	}
	
	@Test
	public void testGetName(){
		assertEquals(testStation.getName(), "test");
		
	}
	@Test
	public void testHashcode(){
		String test = "test";
		int hash= test.hashCode();
		
		assertEquals(testStation.hashCode(), hash);
	}
	
	@Test
	public void testEqualsTrue(){
		Station otherStation = new Station("tEsT");
		assertEquals(testStation.equals(otherStation), true);
	}
	
	@Test
	public void testEqualsFalse(){
		Station otherStation = new Station("test2");
		assertEquals(testStation.equals(otherStation), false);
	}
}