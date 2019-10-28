package com.utm.course.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import com.utm.course.web.student.Address;
import com.utm.course.web.student.Student;
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
  public void testSave() {
    student.save();
    verify(address, times(1)).save();
  }

  @Test
  public void testUpdateSuccess() {
    when(address.update()).thenReturn(true);
    assertThat(student.update()).isEqualTo(true);
  }
}
