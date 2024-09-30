package be.vdab.appreader.mens;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MensNietGevondenException extends RuntimeException {
    public MensNietGevondenException(String message) {
        super();
    }
}
