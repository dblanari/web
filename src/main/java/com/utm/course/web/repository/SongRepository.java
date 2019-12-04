package com.utm.course.web.repository;

import com.utm.course.web.model.Song;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer> {

  List<Song> findByName(String name);

}
