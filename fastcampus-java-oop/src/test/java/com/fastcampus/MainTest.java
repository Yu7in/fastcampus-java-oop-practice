package com.fastcampus;

import com.fastcampus.javaoop.Main;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void main() {
        //given
        String[] args = {"3", " 1", "2"};

        //when & then
        Main.main(args);
    }
}