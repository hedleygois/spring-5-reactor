package com.hedlabel.study.demo.consumer;

import com.hedlabel.study.demo.model.NotificationData;
import com.hedlabel.study.demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.bus.Event;
import reactor.fn.Consumer;

@Service
public class NotificationConsumer implements Consumer<Event<NotificationData>> {

    private NotificationService notificationService;

    @Autowired
    public NotificationConsumer(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    @Override
    public void accept(Event<NotificationData> notificationDataEvent) {
        NotificationData notificationData = notificationDataEvent.getData();

        // For god sake... a try-catch... :(
        try {
            this.notificationService.initiateNotification(notificationData);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}
