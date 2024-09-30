package be.vdab.appreader.mens;

import be.vdab.appreader.todo.ToDo;

import java.util.Set;

public record MensResponse(long id, String voornaam, String familienaam, Set<ToDo> toDos) {
}
