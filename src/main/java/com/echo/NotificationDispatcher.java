/*
 *   Copyright (C) 2015 echo. - All Rights Reserved
 *   Unauthorized copying of this file, via any medium is strictly prohibited
 *   Proprietary and confidential
 */
package com.echo;

/**
 * @author Givanthak
 *
 */
public interface NotificationDispatcher<T extends Notification> {

    void dispatchNotification(T notification) throws NotificationException;
}
