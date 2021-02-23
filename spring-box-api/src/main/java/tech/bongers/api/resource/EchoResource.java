package tech.bongers.api.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.bongers.domain.model.User;

@RestController
public class EchoResource {

    @GetMapping
    public ResponseEntity<String> echoHello() {
        return ResponseEntity.ok("Hello API");
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUser() {
        final User user = new User("John", "Doe", "john.doe@mail.tech");
        return ResponseEntity.ok(user);
    }
}
