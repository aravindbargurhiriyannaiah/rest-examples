package com.funkyganesha.greeting;

/**
 * Created by barga009 on 8/10/14 at 2:24 AM. Comment {"$EXPR$"}
 */

public class Greeting {
    private final long id;
    private final String greeting;

    private Greeting(GreetingBuilder greetingBuilder) {
        this.id = greetingBuilder.getId();
        this.greeting = greetingBuilder.getGreeting();
    }

    public static class GreetingBuilder {
        private long id;
        private String greeting;

        public GreetingBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public long getId() {
            return id;
        }

        public String getGreeting() {
            return greeting;
        }

        public GreetingBuilder setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }

        public Greeting build() {
            Greeting g = new Greeting(this);
            return g;
        }
    }

    public long getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
