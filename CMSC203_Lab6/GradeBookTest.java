import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook a, b;
	
	@BeforeEach
	void setUp() throws Exception {
		a = new GradeBook(5);
		b = new GradeBook(5);
		a.addScore(5);
		a.addScore(10);
		a.addScore(20);
		a.addScore(40);
		
		b.addScore(5);
		b.addScore(10);
		b.addScore(15);
		b.addScore(20);


	}

	@AfterEach
	void tearDown() throws Exception {
		a = null;
		b = null;
	}

	@Test
	void testAddScore() {
		a.addScore(80);		
		b.addScore(25);
		assertTrue(a.toString().equals("5.0 10.0 20.0 40.0 80.0"));
		assertTrue(b.toString().equals("5.0 10.0 15.0 20.0 25.0"));
	}

	@Test
	void testSum() {
		a.addScore(80);		
		b.addScore(25);
		assertEquals( 155, a.sum() ,.001);
		assertEquals( 75, b.sum() ,.001);

	}

	@Test
	void testMinimum() {
		a.addScore(80);		
		b.addScore(25);
		assertEquals(5, a.minimum(), .001);
		assertEquals(5, b.minimum(), .001);

	}

	@Test
	void testFinalScore() {
		a.addScore(80);		
		b.addScore(25);
		assertEquals(150, a.finalScore(), .001);
		assertEquals(70, b.finalScore(), .001);

	}

	@Test
	void testGetScoreSize() {
		a.addScore(80);		
		b.addScore(25);
		assertEquals(5, a.getScoreSize(), .001 );
		assertEquals(5, b.getScoreSize(), .001 );
	}

	@Test
	void testToString() {
		a.addScore(80);		
		b.addScore(25);
		assertTrue(a.toString().equals("5.0 10.0 20.0 40.0 80.0"));
		assertTrue(b.toString().equals("5.0 10.0 15.0 20.0 25.0"));
	}

}
