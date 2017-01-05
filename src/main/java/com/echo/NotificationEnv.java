/*
 *   Copyright (C) echo. - All Rights Reserved
 *   Unauthorized copying of this file, via any medium is strictly prohibited
 *   Proprietary and confidential
 */
package com.echo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Givanthak
 *
 */
public class NotificationEnv {

    Map<String, String> properties = new HashMap<String, String>();

    public void addProperty(String key, String value) {
        properties.put(key, value);
    }

    public String getProperty(String key) {
        return properties.get(key);
    }
}
