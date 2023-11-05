package de.ithoc.training.owasptop10.cryptographic_failures;

import de.ithoc.training.owasptop10.FileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CryptographicFailuresTest {

    @Autowired
    private FileService fileService;


    @Test
    void encrypt() {

        // given
        CryptographicFailures cryptographicFailures = new CryptographicFailures(fileService);

        // when
        String encryptedPassword1 = cryptographicFailures.encrypt("dog");
        System.out.println("user1;" + encryptedPassword1);

        String encryptedPassword2 = cryptographicFailures.encrypt("cat");
        System.out.println("user2;" + encryptedPassword2);

        String encryptedPassword3 = cryptographicFailures.encrypt("mouse");
        System.out.println("user3;" + encryptedPassword3);


        // then
        assertEquals("ZG9n", encryptedPassword1);
        assertEquals("Y2F0", encryptedPassword2);
        assertEquals("bW91c2U=", encryptedPassword3);
    }

}