package de.ithoc.training.owasptop10.cryptographic_failures;

@SuppressWarnings("unused")
public class PasswordDto {

    private final String userId;
    private final String password;

    public PasswordDto(String line) {
        String[] split = line.split(";");
        this.userId = split[0];
        this.password = split[1];
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

}
