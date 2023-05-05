package cs3500.misc;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Tests the JPGRead class.
 */
public class JPGReadTest {
  private FileRead test;

  @Before
  public void setUp() {
    this.test = new PNGRead("tako-blend.jpg");
  }

  @Test
  public void readFile() throws IOException {
    this.test.readFile();
    assertEquals(this.test.getArray()[0][0].toString(), "178 165 171");
    assertNotEquals(this.test.getArray()[0][0].getAlpha(), 255);
    FileRead testFail = new PNGRead("");
    try {
      testFail.readFile();
    } catch (IOException e) {
      // DO nothing, caught successfully.
    }
  }
}