package cs3500.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the HSL class.
 */
public class HSLTest {
  private HSL pix1;
  private HSL pix2;
  private HSL pix3;
  private HSL pix4;

  @Before
  public void setUp() {
    pix1 = new HSL(0, 0, 0);
    pix2 = new HSL(60, 0, 0.4);
    pix3 = new HSL(270, 0.5, 0);
    pix4 = new HSL(360, 1, 1);
  }

  @Test
  public void multiply() {
    pix2.multiply(pix1);
    assertEquals(pix2.toString(), "60.0 0.0 0.0");
    pix2 = new HSL(60, 0, 0.4);
    pix4.multiply(pix2);
    assertEquals(pix4.toString(), "360.0 1.0 0.4");
  }

  @Test
  public void screen() {
    pix1.screen(pix2);
    assertEquals(pix1.toString(), "0.0 0.0 0.4");
    pix4.screen(pix3);
    assertEquals(pix4.toString(), "360.0 1.0 1.0");
  }

  @Test
  public void convertHSLtoRGB() {
    assertEquals(pix1.convertHSLtoRGB(), new RGB(0, 0, 0));
    assertEquals(pix3.convertHSLtoRGB(), new RGB(34, 45, 56));
    assertEquals(pix4.convertHSLtoRGB(), new RGB(253, 134, 123));
  }
}