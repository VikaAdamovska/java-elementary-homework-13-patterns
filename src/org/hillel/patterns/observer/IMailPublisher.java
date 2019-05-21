package org.hillel.patterns.observer;

public interface IMailPublisher {

    public void registerMailListener(MailListener mailListener);

    public void removeMailListener(MailListener mailListener);

    public void notifyMailListener(MailType mailType);
}
