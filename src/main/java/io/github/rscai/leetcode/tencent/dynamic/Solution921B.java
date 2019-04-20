package io.github.rscai.leetcode.tencent.dynamic;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Solution921B {

  public int climbStairs(int n) {
    Function<Integer, Integer> climbStairsFun = new Function<Integer, Integer>() {
      private Map<Integer, Integer> cache = new HashMap<>();

      @Override
      public Integer apply(Integer n) {
        if (cache.containsKey(n)) {
          return cache.get(n);
        }
        Integer result = doApply(n);
        cache.put(n, result);
        return result;
      }

      private Integer doApply(Integer n) {
        if (1 == n) {
          return 1;
        }
        if (2 == n) {
          return 2;
        }
        return apply(n - 1) + apply(n - 2);
      }
    };
    return climbStairsFun.apply(n);
  }
}
