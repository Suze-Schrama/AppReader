package be.vdab.appreader;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mensen")
public class ToDoController {
    private final ToDoClient toDoClient;

    public ToDoController(ToDoClient toDoClient) {
        this.toDoClient = toDoClient;
    }

    @GetMapping("{id}/todos")
    ToDo findById(@PathVariable long id){
        return toDoClient.findById(id).orElseThrow(MensNietGevondenException::new);
    }
}
