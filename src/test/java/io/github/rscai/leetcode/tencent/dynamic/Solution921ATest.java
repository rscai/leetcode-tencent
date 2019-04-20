package io.github.rscai.leetcode.tencent.dynamic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Solution921ATest {

  @Parameters(name = "{index}: climb {0} stairs in {1} ways")
  public static Iterable<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {2, 2},
        {3, 3},
        {44,1134903170}
    });
  }

  private Solution921A testObject;
  private int n;
  private int way;

  public Solution921ATest(int n, int way) {
    this.n = n;
    this.way = way;
  }

  @Before
  public void setUp() throws Exception {
    testObject = new Solution921A();
  }

  @Test
  public void testClimbStairs() throws Exception {
    assertThat(testObject.climbStairs(n), is(way));
  }
}