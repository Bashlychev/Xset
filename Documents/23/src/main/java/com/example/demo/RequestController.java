package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/app/v1")
public class RequestController {

    @GetMapping("/getRequest")
    public ResponseEntity<String> getRequest(@RequestParam int id, @RequestParam String name) throws IOException, InterruptedException {
        if (id <= 10) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Неверный параметр: id должен быть больше 10");
        }

        if (name.length() <= 5) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Неверный параметр: Длина имени должна быть больше 5");
        }

        if (id > 10 && id < 50) {
            Thread.sleep(1000);
        } else {
            Thread.sleep(500);
        }

        String response = new String(Files.readAllBytes(Paths.get("src/main/resources/getAnswer.txt")));
        response = response.replace("{id}", String.valueOf(id))
                .replace("{name}", name);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/postRequest")
    public ResponseEntity<String> postRequest(@Valid @RequestBody PostRequestBody requestBody) throws IOException {
        if (requestBody.getName().isEmpty() || requestBody.getSurname().isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Internal Server Error: Имя или фамилия не могут быть пустыми");
        }

        String response = new String(Files.readAllBytes(Paths.get("src/main/resources/postAnswer.txt")));
        Integer age = requestBody.getAge() == null ? 123 : requestBody.getAge();
        response = response.replace("{name}", requestBody.getName())
                .replace("{surname}", requestBody.getSurname())
                .replace("{age}", String.valueOf(age));

        if (requestBody.getAge() != null) {
            response = response.replace("2age", String.valueOf(requestBody.getAge() * 2));
        } else {
            response = response.replace("2age", "246"); // 123 * 2
        }

        return ResponseEntity.ok(response);
    }
}
