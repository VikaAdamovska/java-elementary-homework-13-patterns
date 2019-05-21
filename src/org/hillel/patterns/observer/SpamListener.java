package org.hillel.patterns.observer;

public class SpamListener extends MailListener {

    protected String type = "spam";

    public String getType() {
        return type;
    }

    @Override
    public MailListener update(MailType mailType) {
        System.out.println("We redirect the letter to the secretary");
        return super.update(mailType);
    }

    @Override
    public String toString() {
        return "SpamListener{" +
                "type='" + type + '\'' +
                '}';
    }
}
