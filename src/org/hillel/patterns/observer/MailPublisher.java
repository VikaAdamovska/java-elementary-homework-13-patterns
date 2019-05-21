package org.hillel.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MailPublisher implements IMailPublisher {

    private List<MailListener> mailListeners = new ArrayList<>();

    public MailPublisher() {
    }

    @Override
    public void registerMailListener(MailListener mailListener) {
        if (!mailListeners.contains(mailListener)) {
            mailListeners.add(mailListener);
        } else {
            System.out.println("This listener exists!");
        }
    }

    @Override
    public void removeMailListener(MailListener mailListener) {
        if (mailListeners.contains(mailListener)) {
            mailListeners.remove(mailListener);
            System.out.println("This " + mailListener.toString() + " mailListener has been removed!");
        } else {
            System.out.println("MailListener not found");
        }
    }

    @Override
    public void notifyMailListener(MailType mailType) {
        int count = 0;

        for (int i = 0; i < mailListeners.size(); i++) {
            MailListener listener = mailListeners.get(i);

            if (mailType.getType().equals(listener.getType())) {
                listener.update(mailType);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Listeners of " + mailType.toString() + " not found");
        }
    }
}
