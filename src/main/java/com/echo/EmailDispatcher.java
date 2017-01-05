/*
 *   Copyright (C) echo. - All Rights Reserved
 *   Unauthorized copying of this file, via any medium is strictly prohibited
 *   Proprietary and confidential
 */
package com.echo;

import java.util.List;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 * @author Givanthak
 *
 */
public class EmailDispatcher implements NotificationDispatcher<EmailNotification> {

    private String host;

    private String hostUser;

    private String hostPassword;

    public EmailDispatcher() {

    }

    @Override
    public void dispatchNotification(EmailNotification notification) {
        List<NotificationRecipient> recipients = notification.getRecipients();
        for (NotificationRecipient recipient : recipients) {
            EmailRecipient emailRecipient = (EmailRecipient) recipient;

            try {
                HtmlEmail email = new HtmlEmail();
                email.setHostName(host);
                if (hostUser != null) {
                    email.setAuthentication(hostUser, hostPassword);
                }
                email.addTo(emailRecipient.getEmailAddress(), emailRecipient.getDisplayName());
                email.setFrom("me@apache.org", "Me");
                email.setSubject(notification.getSubject());
                if (notification.getTemplate() == null && notification.getMessage() != null) {
                    email.setMsg(notification.getMessage());
                } else if (notification.getTemplate() != null) {
                    email.setHtmlMsg("");// TODO
                }

            } catch (EmailException e) {
                // FIXME handle exception
            }
        }

    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getHostUser() {
        return hostUser;
    }

    public void setHostUser(String hostUser) {
        this.hostUser = hostUser;
    }

    public String getHostPassword() {
        return hostPassword;
    }

    public void setHostPassword(String hostPassword) {
        this.hostPassword = hostPassword;
    }
}
