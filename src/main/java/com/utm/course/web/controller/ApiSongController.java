package com.utm.course.web.controller;

import com.utm.course.web.model.Song;
import com.utm.course.web.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiSongController {

  @Autowired
  private SongService songService;

  @GetMapping("/song")
  @ResponseBody
  public List<Song> songs() {
    return songService.findAll();
  }

}
