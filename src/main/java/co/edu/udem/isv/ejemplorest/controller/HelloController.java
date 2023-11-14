package co.edu.udem.isv.ejemplorest.controller;

import co.edu.udem.isv.ejemplorest.entities.NameAndLastName;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/greeting")
    public String sayHi(@RequestParam(required = false) String name) {
        if (name != null) {
            return "Hi, " + name + "!";
        }
        return "Hi";
    }

    @GetMapping("/greeting/{name}")
    public String sayHiToMe(@PathVariable String name) {
        return "Hi " + name;
    }

    @GetMapping("/greeting/withFullName")
    public String sayHiWithFullName(@RequestParam("name") String name) {
        return "Hi, " + name + "!";
    }

    @PostMapping("/greeting/withFullNameObject")
    public String sayHiWithFullNameObject(@RequestBody NameAndLastName fullName) {
        return "Hi, " + fullName.getFirstName() + " " + fullName.getLastName() + "!";
    }
}
