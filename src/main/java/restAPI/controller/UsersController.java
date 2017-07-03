package restAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import restAPI.data.User;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Vojtech on 3.7.2017.
 */
@RestController
public class UsersController {

    private static final String template = "Name: %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public User greeting(@RequestParam(value="name", defaultValue="Vojtěch") String name) {
        return new User(counter.incrementAndGet(),
                String.format(template, name));
    }
}
