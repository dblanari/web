package com.utm.course.web.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApiSongControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSongList() throws Exception {
        this.mockMvc.perform(get("/api/song")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("song1"))
                .andExpect(jsonPath("$[0].duration").value(3))
                .andExpect(jsonPath("$[1].name").value("song2"))
                .andExpect(jsonPath("$[1].duration").value(5));
    }
}
