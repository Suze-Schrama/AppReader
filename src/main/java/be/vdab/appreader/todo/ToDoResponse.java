package be.vdab.appreader.todo;

import java.time.LocalDateTime;

public record ToDoResponse(long mensId, String tekst, int prioriteit, LocalDateTime gemaakt) {
}
