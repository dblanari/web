package com.utm.course.web;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import com.utm.course.web.utils.Utils;
import org.junit.jupiter.api.Test;

public class UtilTest {

  @Test
  public void testSumPositive() {
    List<Integer> list = Arrays.asList(1, 2, 3);
    final Integer sum = Utils.sum(list);
    assertThat(sum).isEqualTo(6);
  }
}
