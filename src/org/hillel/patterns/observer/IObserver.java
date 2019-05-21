package org.hillel.patterns.observer;

import org.hillel.patterns.observer.MailListener;

public interface IObserver{

     MailListener update(MailType mailType);
}
