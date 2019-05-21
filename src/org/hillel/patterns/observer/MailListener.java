package org.hillel.patterns.observer;

public class MailListener implements IObserver{

    protected String type;

    public String getType() {
        return type;
    }

    @Override
    public MailListener update(MailType mailType) {
        return this;
    }

    @Override
    public String toString() {
        return "MailListener{" +
                "type='" + type + '\'' +
                '}';
    }
}
