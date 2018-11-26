package com.hedlabel.study.demo.service;

import com.hedlabel.study.demo.model.NotificationData;

public interface NotificationService {
    // This should return a Try. Keep the ugly exception for now
   void initiateNotification(NotificationData notificationData) throws InterruptedException;
}
