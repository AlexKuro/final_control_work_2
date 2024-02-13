package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;
import java.util.Random;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdUnix {
    private long unixTimestamp;

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
