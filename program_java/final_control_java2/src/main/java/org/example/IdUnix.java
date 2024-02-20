package org.example;

import java.time.Instant;
import java.util.Date;
import java.util.Random;

public class IdUnix {
    public long date() {
        return Instant.now().getEpochSecond();
    }

    public String current(long instant) {
        return String.valueOf(Date.from(Instant.ofEpochSecond(instant)));
    }

    public long id() {
        return new Random().nextInt(1000, 9999);
    }
}
