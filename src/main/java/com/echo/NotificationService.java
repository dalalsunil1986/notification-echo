/*
 *   Copyright (C) echo. - All Rights Reserved
 *   Unauthorized copying of this file, via any medium is strictly prohibited
 *   Proprietary and confidential
 */
package com.echo;


/**
 * @author Givanthak
 *
 */
public class NotificationService {

    NotificationStream notificationStream;

    /**
     * @throws Exception
     *
     */
    public NotificationService() throws Exception {

        NotificationEnv env = new NotificationEnv();

        notificationStream = new AsyncNotificationStream(new NotificationListenerImpl(env));
        notificationStream.init();
    }

    public void sendEmailNotification() {

    }
}
