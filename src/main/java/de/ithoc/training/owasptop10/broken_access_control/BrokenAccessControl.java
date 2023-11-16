package de.ithoc.training.owasptop10.broken_access_control;

import de.ithoc.training.owasptop10.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


@RestController
public class BrokenAccessControl {

    private final FileService fileService;

    public BrokenAccessControl(FileService fileService) {
        this.fileService = fileService;
    }


    @GetMapping("/broken-access-control")
    public ResponseEntity<String> get(@RequestParam String userId) throws IOException {

        String fileContent = fileService.readContent(userId + ".txt");
        if(fileContent.isEmpty()) {
            fileContent = "User not found.";
        }

        return ResponseEntity.ok(fileContent);
    }


    @PostMapping("/broken-access-control")
    public ResponseEntity<String> post(@RequestBody UserDto userDto) throws IOException {

        File userFile = fileService.readFile(userDto.getUserId());
        FileOutputStream fileOutputStream = new FileOutputStream(userFile + ".txt", false);
        fileOutputStream.write(userDto.getData().getBytes());
        fileOutputStream.close();

        return ResponseEntity.ok("Data updated successfully for user: " + userDto.getUserId());
    }


}
