package com.funkyganesha;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by barga009 on 8/10/14 at 2:32 AM.
 *
 * This is based on
 */
@RestController
public class GreetingController {
    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greet")
    public Greeting greet(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        Greeting.GreetingBuilder builder = new Greeting.GreetingBuilder();
        builder.setId(counter.incrementAndGet());
        builder.setGreeting(String.format(template, name));
        return builder.build();
    }
}
