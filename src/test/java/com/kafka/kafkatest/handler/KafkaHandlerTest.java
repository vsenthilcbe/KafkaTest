package com.kafka.kafkatest.handler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KafkaHandlerTest {

    private KafkaHandler handler;
    @BeforeEach
    void setUp() {
    }

    @Test
    void listen() {
        handler.listen("Payload");
    }
}