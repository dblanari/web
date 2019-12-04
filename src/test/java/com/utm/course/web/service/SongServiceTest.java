package com.utm.course.web.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.utm.course.web.model.Song;
import com.utm.course.web.repository.SongRepository;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class SongServiceTest {

  @Autowired
  private SongRepository songRepository;

  @BeforeEach
  public void setUp() {
    Song song1 = new Song(null, "test1", 1);
    Song song2 = new Song(null, "test2", 2);
    songRepository.saveAll(Arrays.asList(song1, song2));
  }

  @Test
  public void testFindAll() {
    assertThat(songRepository.findAll()).hasSize(2);
  }

  @Test
  public void testFindByNameCount() {
    Song song = new Song(null, "test1", 4);
    songRepository.save(song);

    assertThat(songRepository.findByName("test1")).hasSize(2);
    assertThat(songRepository.findByName("test2")).hasSize(1);
  }
}
