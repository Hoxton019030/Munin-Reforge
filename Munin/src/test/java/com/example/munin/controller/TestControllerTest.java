package com.example.munin.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Hoxton on 2022/12/12
 * @since 1.2.0
 */
@ExtendWith(MockitoExtension.class)
class TestControllerTest {

    @InjectMocks
    TestController testController;

    @Test
    void returnTest(){
        String hello=testController.getHello();
        assertThat(hello).isEqualTo("hello");

    }

}