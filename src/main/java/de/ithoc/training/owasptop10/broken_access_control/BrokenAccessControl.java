package de.ithoc.training.owasptop10.broken_access_control;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


@RestController
public class BrokenAccessControl {


    @GetMapping("/broken-access-control")
    public ResponseEntity<String> get(@RequestParam String userId) throws IOException {

        File userFile = readFile(userId);

        StringBuilder fileContent = new StringBuilder();
        if (userFile.exists()) {
            FileInputStream fileInputStream = new FileInputStream(userFile);
            int byteContent;
            while ((byteContent = fileInputStream.read()) != -1) {
                fileContent.append((char) byteContent);
            }
            fileInputStream.close();
        } else {
            fileContent.append("User not found.");
        }

        return ResponseEntity.ok(fileContent.toString());
    }


    @PostMapping("/broken-access-control")
    public ResponseEntity<String> post(@RequestBody UserDto userDto) throws IOException {

        File userFile = readFile(userDto.getUserId());
        FileOutputStream fileOutputStream = new FileOutputStream(userFile, false);
        fileOutputStream.write(userDto.getData().getBytes());
        fileOutputStream.close();

        return ResponseEntity.ok("Data updated successfully for user: " + userDto.getUserId());
    }


    private static File readFile(String userId) {

        String currentPath = System.getProperty("user.dir");

        return new File(currentPath + File.separator + "data" + File.separator + userId + ".txt");
    }

}
