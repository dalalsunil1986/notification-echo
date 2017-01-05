/*
 *   Copyright (C) echo - All Rights Reserved
 *   Unauthorized copying of this file, via any medium is strictly prohibited
 *   Proprietary and confidential
 */
package com.echo;

import reactor.Environment;
import reactor.fn.Consumer;
import reactor.rx.broadcast.Broadcaster;

/**
 * @author Givanthak
 *
 */
public class AsyncNotificationStream implements NotificationStream {

    Broadcaster<Notification> sink;

    /**
     *
     */
    public AsyncNotificationStream(final NotificationListener listener) {
        Environment.initialize();
        sink = Broadcaster.create(Environment.get());
        sink.consume(new Consumer<Notification>() {
            @Override
            public void accept(Notification notification) {
                listener.onEvent(notification);
            }
        });
    }

    @Override
    public void submit(Notification notification) {
        sink.onNext(notification);
    }



    public void destroy() throws Exception {
        Environment.get().shutdown();
    }

    public void init() throws Exception {

    }
}
