package com.hedlabel.study.demo;

import org.springframework.context.annotation.Bean;
import reactor.Environment;
import reactor.bus.EventBus;
import reactor.bus.EventBus;

public class Config {

    @Bean
    Environment env() {
        return Environment.initializeIfEmpty().assignErrorJournal();
    }

    @Bean
    EventBus createEventBus(Environment env) {
        return EventBus.create(env, Environment.THREAD_POOL);
    }
}
