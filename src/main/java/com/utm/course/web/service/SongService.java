package com.utm.course.web.service;

import com.utm.course.web.model.Song;
import com.utm.course.web.repository.SongRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> findAll() {
        return songRepository.findAll();
    }


    public int countByName(String name) {
        return songRepository.findByName(name).size();
    }
}
