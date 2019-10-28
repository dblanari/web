package com.utm.course.web;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentTest {

  @InjectMocks
  private Student student;

  @Mock
  private Address address;

  @Test
  public void save() {
    student.save();
    verify(address, times(1)).save();
  }
}
