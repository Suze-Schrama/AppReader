package be.vdab.appreader.todo;

import be.vdab.appreader.mens.Mens;
import be.vdab.appreader.mens.MensNietGevondenException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mensen")
public class ToDoController {
    private final ToDoClient toDoClient;

    public ToDoController(ToDoClient toDoClient) {
        this.toDoClient = toDoClient;
    }

    @GetMapping("{id}")
    Mens findById(@PathVariable long id) {
        return toDoClient.findById(id).orElseThrow(() -> new MensNietGevondenException("Mens niet gevonden " + id));
    }

    @GetMapping("{id}/todos")
    List<ToDo> findToDosByMensId(@PathVariable long id) {
        findById(id);
        return toDoClient.findToDosByMensId(id);
    }
}

