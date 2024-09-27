package be.vdab.appreader;

import java.time.LocalDateTime;

public record ToDo(String tekst, int prioriteit, LocalDateTime gemaakt) {
}
