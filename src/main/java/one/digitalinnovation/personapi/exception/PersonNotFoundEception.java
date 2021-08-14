package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundEception extends Exception{
    public PersonNotFoundEception(Long id) {
        super("Person not found with id"+id);
    }
}
