package org.hillel.patterns.observer;

public class ImportantListener extends MailListener {

    protected String type = "important";

    public String getType() {
        return type;
    }

    @Override
    public MailListener update(MailType mailType) {
        System.out.println("We redirect the letter to the director");
        return super.update(mailType);
    }

    @Override
    public String toString() {
        return "ImportantListener{" +
                "type='" + type + '\'' +
                '}';
    }
}
