package impl;

import interfaces.Publisher;
import interfaces.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Publisher {
    List<Subscriber> subscriberList = new ArrayList<>();

    String newTitle;
     @Override
    public void subscribe(Subscriber s) {
        subscriberList.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        subscriberList.remove(s);
    }


    @Override
    public void notifySubscriber() {
        for(Subscriber s : subscriberList){
            s.update(newTitle);
        }
    }

    public void setTitle(String newTitle){
         this.newTitle= newTitle;
         this.notifySubscriber();
    }
}
