package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable observable;

    // constructor injection
    public MobileAlertObserverImpl(String userName, StocksObservable observable){
        this.observable = observable;
        this.userName = userName;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is back in stock hurry up!!");
    }

    private void sendMsgOnMobile(String userName,String msg){
        System.out.println(msg);
        System.out.println("Message sent to: "+userName);
    }
}
