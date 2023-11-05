package de.ithoc.training.owasptop10.broken_access_control;

public class UserDto {

    private String userId;
    private String data;

    public UserDto(String userId, String data) {
        this.userId = userId;
        this.data = data;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

}
