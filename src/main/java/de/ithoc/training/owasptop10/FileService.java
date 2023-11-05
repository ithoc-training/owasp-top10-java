package de.ithoc.training.owasptop10;


import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Service
public class FileService {

    public File readFile(String fileName) {

        String currentPath = System.getProperty("user.dir");

        return new File(currentPath + File.separator + "data" + File.separator + fileName);
    }


    public String readContent(String fileName) throws IOException {

        File userFile = readFile(fileName);

        StringBuilder fileContent = new StringBuilder();
        if (userFile.exists()) {
            FileInputStream fileInputStream = new FileInputStream(userFile);
            int byteContent;
            while ((byteContent = fileInputStream.read()) != -1) {
                fileContent.append((char) byteContent);
            }
            fileInputStream.close();
        }

        return fileContent.toString();
    }

}