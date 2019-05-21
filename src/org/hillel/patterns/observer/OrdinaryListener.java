package org.hillel.patterns.observer;

public class OrdinaryListener extends MailListener{

    protected String type = "ordinary";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public MailListener update(MailType mailType) {
        System.out.println("We will check this latter by yourself");
        return super.update(mailType);
    }

    @Override
    public String toString() {
        return "OrdinaryListener{" +
                "type='" + type + '\'' +
                '}';
    }
}
