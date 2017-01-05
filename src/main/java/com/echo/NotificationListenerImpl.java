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
public class NotificationListenerImpl implements NotificationListener {

    EmailDispatcher emailDispatcher;

    public NotificationListenerImpl(NotificationEnv env) {
        emailDispatcher = new EmailDispatcher();
        emailDispatcher.setHost(env.getProperty(EmailProperties.HOST));
        emailDispatcher.setHostUser(env.getProperty(EmailProperties.HOST_USER));
        emailDispatcher.setHostPassword(env.getProperty(EmailProperties.HOST_PASSWORD));
    }

    @Override
    public void onEvent(Notification notification) {
        if (notification instanceof EmailNotification) {
            emailDispatcher.dispatchNotification((EmailNotification) notification);
        }
    }
}
