package com.utm.course.web.service;

import com.utm.course.web.model.Song;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SongService {

    public List<Song> findAll() {
        return Arrays.asList(
                new Song("song1", 3),
                new Song("song2", 5)
        );
    }
}
