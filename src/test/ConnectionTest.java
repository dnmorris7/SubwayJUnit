package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.codecrunchcorner.*;
import com.codecrunchcorner.subway.*;

public class ConnectionTest {
	public Connection connection;
	public Station station1, station2;
	public String lineName;

	@Before
	public void setUp() throws Exception {
		station1 = new Station("station1");
		station2 = new Station("station2");
		lineName = "testLine";

		connection = new Connection(station1, station2, lineName);

	}

	@After
	public void tearDown() throws Exception {
		connection = null;
		station1 = null;
		station2 = null;
		lineName = null;
	}

	@Test
	public void testGetStation1() {

		Station testStation = connection.getStation1();
		boolean sameStation = testStation.equals(connection.getStation1());
		assertTrue(sameStation);
	}

	@Test
	public void testGetStation2() {

		Station testStation = connection.getStation2();
		boolean sameStation = testStation.equals(connection.getStation2());
		assertTrue(sameStation);
	}

	@Test
	public void testGetLineName() {

		String testString = connection.getLineName();
		assertEquals(testString, "testLine");
	}

}
