package com.utm.course.web.utils;

import java.util.List;

public class Utils {

  public static int sum(List<Integer> numbers) {
    int sum = 0;
    for (Integer number : numbers) {
      sum = sum + number;
    }
    return sum;
  }
}