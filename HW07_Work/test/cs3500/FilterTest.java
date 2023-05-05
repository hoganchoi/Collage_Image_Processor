package cs3500.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the Filter Enumeration.
 */
public class FilterTest {
  @Test
  public void testGetRepresentation() {
    assertEquals(Filter.NORMAL.getRepresentation(), "normal");
    assertEquals(Filter.RED_COMPONENT.getRepresentation(), "red-component");
    assertEquals(Filter.BLUE_COMPONENT.getRepresentation(), "blue-component");
  }

  @Test
  public void testFindByAbbr() {
    assertEquals(Filter.findByAbbr("normal"), Filter.NORMAL);
    assertEquals(Filter.findByAbbr("darken-value"), Filter.DARKEN_VALUE);
    assertEquals(Filter.findByAbbr("red-component"), Filter.RED_COMPONENT);
  }
}