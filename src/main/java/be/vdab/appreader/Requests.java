package be.vdab.appreader;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface Requests {
    @GetExchange("{id}")
    ToDo findById(@PathVariable long id);
}
