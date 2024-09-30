package be.vdab.appreader.todo;

import java.time.LocalDateTime;

public record ToDo(String tekst, int prioriteit, LocalDateTime gemaakt) {
}
