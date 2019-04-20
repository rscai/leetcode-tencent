package io.github.rscai.leetcode.tencent.dynamic;

public class Solution921C {

  public int climbStairs(int n) {
    final int FIBO_1 = 1;
    final int FIBO_2 = 2;
    int fiboMinusOne = FIBO_2;
    int fiboMinusTwo = FIBO_1;
    int fiboN = 0;
    if (1 == n) {
      fiboN = FIBO_1;
    }
    if (2 == n) {
      fiboN = FIBO_2;
    }
    for (int i = 3; i <= n; i++) {
      fiboN = fiboMinusOne + fiboMinusTwo;
      fiboMinusTwo = fiboMinusOne;
      fiboMinusOne = fiboN;
    }
    return fiboN;
  }
}
