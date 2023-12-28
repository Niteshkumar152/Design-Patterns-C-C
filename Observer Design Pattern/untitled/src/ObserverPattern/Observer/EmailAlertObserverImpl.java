package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    StocksObservable observable;
    String emailId;

    // constructor injection
    public EmailAlertObserverImpl(String emailId,StocksObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMail(emailId,"Product is back in stock hurry up!!");
    }

    private void sendMail(String emailId, String msg){
        System.out.println(msg);
        System.out.println("Mail sent to: " + emailId);
    }
}
