package be.vdab.appreader.todo;

import be.vdab.appreader.Requests;
import be.vdab.appreader.mens.Mens;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import java.util.*;

@Component
public class ToDoClient {
    private final Requests requests;
    ToDoClient(Requests requests){
        this.requests = requests;
    }

    public Optional<Mens> findById(long id){
        try{
            var mensResponse = requests.findById(id);
            var mens = new Mens(mensResponse.id());
            return Optional.of(mens);
        }catch (HttpClientErrorException.NotFound ex) {
            return Optional.empty();
        }
    }

    public List<ToDo> findToDosByMensId(long id){
        return Arrays.stream(requests.findToDosById(id))
                .map(toDoResponse -> new ToDo(toDoResponse.tekst(), toDoResponse.prioriteit(), toDoResponse.gemaakt()))
                .sorted(Comparator.comparing(ToDo::prioriteit)).toList();
    }
}
