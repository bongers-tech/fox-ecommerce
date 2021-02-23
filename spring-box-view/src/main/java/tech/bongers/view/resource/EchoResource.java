package tech.bongers.view.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EchoResource {

    @GetMapping
    public ResponseEntity<String> echoHello() {
        return ResponseEntity.ok("Hello view");
    }
}
