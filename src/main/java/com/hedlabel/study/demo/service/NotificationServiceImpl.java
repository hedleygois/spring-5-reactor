package com.hedlabel.study.demo.service;

import com.hedlabel.study.demo.model.NotificationData;
import org.springframework.expression.spel.InternalParseException;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void initiateNotification(NotificationData notificationData) throws InterruptedException {
        System.out.println("Notification service started for "
                + "Notification ID: " + notificationData.getId());

        Thread.sleep(5000);

        System.out.println("Notification service ended for "
                + "Notification ID: " + notificationData.getId());
    }
}
