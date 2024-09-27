package be.vdab.appreader;

import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Component
public class ToDoClient {
    private final Requests requests;
    ToDoClient(Requests requests){
        this.requests = requests;
    }

    Optional<ToDo> findById(long id){
        try{
            var response = requests.findById(id);
            var toDo = new ToDo(response.tekst(), response.prioriteit(), response.gemaakt());
            return Optional.of(toDo);
        } catch (HttpClientErrorException.NotFound ex){
            return Optional.empty();
        }
    }
}
