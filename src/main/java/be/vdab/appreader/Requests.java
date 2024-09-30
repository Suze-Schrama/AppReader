package be.vdab.appreader;

import be.vdab.appreader.mens.MensResponse;
import be.vdab.appreader.todo.ToDoResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface Requests {

    @GetExchange("mensen/{id}")
    MensResponse findById(@PathVariable long id);

    @GetExchange("mensen/{id}/todos")
    ToDoResponse[] findToDosById(@PathVariable long id);
}
