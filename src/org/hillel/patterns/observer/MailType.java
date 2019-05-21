package org.hillel.patterns.observer;

public class MailType {

    private String type;

    private String massage;

    private String title;


    public MailType(String type, String massage, String title) {
        this.type = type;
        this.massage = massage;
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public String getMassage() {
        return massage;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "MailType{" +
                "type='" + type + '\'' +
                ", massage='" + massage + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
