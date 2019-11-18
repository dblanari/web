package com.utm.course.web.repository;

import com.utm.course.web.model.Song;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer> {

  Optional<Song> findByName(String name);

}
