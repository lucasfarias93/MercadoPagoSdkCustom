package com.mercadopago.px_tracking.model;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vaserber on 6/5/17.
 */

public class ScreenViewEvent extends Event {

    private String screenId;
    private String screenName;

    protected ScreenViewEvent() {

    }

    private ScreenViewEvent(Builder builder) {
        super();
        setType(TYPE_SCREEN_VIEW);
        setTimestamp(System.currentTimeMillis());
        setMetadata(builder.metadata);
        this.screenId = builder.screenId;
        this.screenName = builder.screenName;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getScreenId() {
        return screenId;
    }

    public static class Builder {

        private String screenId;
        private String screenName;
        private Map<String, String> metadata = new HashMap<>();

        public Builder setScreenId(String screenId) {
            this.screenId = screenId;
            return this;
        }

        public Builder setScreenName(String screenName) {
            this.screenName = screenName;
            return this;
        }

        public Builder addMetaData(String key, String value) {
            metadata.put(key, value);
            return this;
        }

        public ScreenViewEvent build() {
            return new ScreenViewEvent(this);
        }
    }
}
