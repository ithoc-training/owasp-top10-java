package de.ithoc.training.owasptop10.cryptographic_failures;

import de.ithoc.training.owasptop10.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


@RestController
public class CryptographicFailures {

    private final FileService fileService;

    public CryptographicFailures(FileService fileService) {
        this.fileService = fileService;
    }


    @GetMapping("/cryptographic-failures")
    public ResponseEntity<List<PasswordDto>> get() throws IOException {

        String content = fileService.readContent("passwords.txt");

        List<PasswordDto> passwordDtos = new ArrayList<>();
        String[] lines = content.split(System.lineSeparator());
        for (String line : lines) {
            passwordDtos.add(new PasswordDto(line));
        }

        return ResponseEntity.ok(passwordDtos);
    }


    public String encrypt(String decodedPassword) {

        return Base64.getEncoder().encodeToString(decodedPassword.getBytes());
    }

}
