package org.hillel.patterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        /*2) Реализовать демо-пример использования паттерна Observer на примере классов:
        MailType
        MailListener - "слушатель" события по определенному MailType
        MailPublisher - может добавлять-удалять слушателей, нотифицировать определенных слушателей по определенному MailType*/

        SpamListener spamListener = new SpamListener();
        ImportantListener importantListener = new ImportantListener();
        OrdinaryListener ordinaryListener = new OrdinaryListener();

        MailPublisher publisher = new MailPublisher();
        publisher.registerMailListener(spamListener);
        publisher.registerMailListener(importantListener);
        publisher.registerMailListener(ordinaryListener);
        publisher.registerMailListener(spamListener);

        MailType important = new MailType("important", "Massage: We have a meeting about the bad weather",
                "meeting 12.00");
        MailType spam = new MailType("spam", "Massage: You win 1 million dollars", "you are lucky");
        MailType ordinary = new MailType("ordinary", "Massage: This is a letter about the conditions of cooperation with us!",
                "terms of cooperation");

        publisher.notifyMailListener(important);
        publisher.notifyMailListener(spam);
        publisher.notifyMailListener(ordinary);

        publisher.removeMailListener(spamListener);
        publisher.removeMailListener(ordinaryListener);

        publisher.notifyMailListener(spam);


    }
}
