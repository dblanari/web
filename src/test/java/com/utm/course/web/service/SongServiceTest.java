package com.utm.course.web.service;


import static org.mockito.Mockito.verify;

import com.utm.course.web.repository.SongRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SongServiceTest {

    @InjectMocks
    private SongService songService;

    @Mock
    private SongRepository songRepository;

    @Test
    public void testFindAll() {
        songService.findAll();
        verify(songRepository).findAll();
    }
}