package dev.ogabek.telegramappui.model;

public class Chat {

    private final int profile;
    private final String fullName, message;

    public Chat(int profile, String fullName, String message) {
        this.profile = profile;
        this.fullName = fullName;
        this.message = message;
    }

    public String getFullName() {
        return fullName;
    }

    public int getProfile() {
        return profile;
    }

    public String getMessage() {
        return message;
    }
}
