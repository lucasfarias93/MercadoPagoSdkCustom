package com.mercadopago.px_tracking;

import com.mercadopago.px_tracking.model.AppInformation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vaserber on 7/13/17.
 */

public class AppInformationTest {

    public static final String MOCKED_PUBLIC_KEY_1 = "public key 1";
    public static final String MOCKED_CHECKOUT_VERSION_1 = "checkout version 1";
    public static final String MOCKED_PUBLIC_KEY_2 = "public key 2";
    public static final String MOCKED_CHECKOUT_VERSION_2 = "checkout version 2";
    public static final String MOCKED_PLATFORM = "native/android";

    @Test
    public void testAppInformationEquals() {
        AppInformation appInformation1 = new AppInformation.Builder()
                .setPublicKey(MOCKED_PUBLIC_KEY_1)
                .setCheckoutVersion(MOCKED_CHECKOUT_VERSION_1)
                .setPlatform(MOCKED_PLATFORM)
                .build();

        AppInformation appInformation2 = new AppInformation.Builder()
                .setPublicKey(MOCKED_PUBLIC_KEY_1)
                .setCheckoutVersion(MOCKED_CHECKOUT_VERSION_1)
                .setPlatform(MOCKED_PLATFORM)
                .build();

        assertEquals(appInformation1, appInformation2);
    }

    @Test
    public void testAppInformationNotEquals() {
        AppInformation appInformation1 = new AppInformation.Builder()
                .setPublicKey(MOCKED_PUBLIC_KEY_1)
                .setCheckoutVersion(MOCKED_CHECKOUT_VERSION_1)
                .setPlatform(MOCKED_PLATFORM)
                .build();

        AppInformation appInformation2 = new AppInformation.Builder()
                .setPublicKey(MOCKED_PUBLIC_KEY_2)
                .setCheckoutVersion(MOCKED_CHECKOUT_VERSION_2)
                .setPlatform(MOCKED_PLATFORM)
                .build();

        assertNotEquals(appInformation1, appInformation2);
    }
}
