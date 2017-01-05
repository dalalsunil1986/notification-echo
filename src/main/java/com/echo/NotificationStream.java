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
public interface NotificationStream {

    void submit(Notification notification);

    void init() throws Exception;
}
