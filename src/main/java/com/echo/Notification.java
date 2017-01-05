/*
 *   Copyright (C) echo. - All Rights Reserved
 *   Unauthorized copying of this file, via any medium is strictly prohibited
 *   Proprietary and confidential
 */
package com.echo;

import java.util.List;
import java.util.UUID;

/**
 * @author Givanthak
 *
 */
public class Notification {

    private long uuid;

    private String message;

    private String subject;

    private List<NotificationRecipient> recipients;

    /**
     *
     */
    public Notification() {
        uuid = UUID.randomUUID().getMostSignificantBits();
    }

    public long getUuid() {
        return uuid;
    }

    public void setUuid(long uuid) {
        this.uuid = uuid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<NotificationRecipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<NotificationRecipient> recipients) {
        this.recipients = recipients;
    }
}
