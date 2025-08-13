package com.ems.events.controller;

import com.ems.events.entity.Notification;
import com.ems.events.service.NotificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private NotificationServiceImpl notificationService;

    @GetMapping("/all")
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @GetMapping("/usernotify/{userId}")
    public List<Notification> getNotificationsByUser(@PathVariable Long userId) {
        return notificationService.getNotificationsByUser(userId);
    }

   

    @PutMapping("/deletenotify/{notficationId}")
    public String deleteNotification(@PathVariable Long notificationId) {
        notificationService.deleteNotification(notificationId);
        return "Notification deleted successfully!";
    }
}
