package com.g191919.inferenceleaker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class UtilsTest {

    @Test
    void generateRandomName() {
        Utils.NUMBERED_NAMES = false;
        Utils.NAME_LENGTH = 3;
        Assertions.assertEquals("GrouseScabsShelley", Utils.generateRandomName(new Random(0)));
        Assertions.assertEquals("TashaMonroviaTimbers", Utils.generateRandomName(new Random(0)));
        Assertions.assertEquals("PurportedGranaryDogmatism", Utils.generateRandomName(new Random(1)));
        Assertions.assertEquals("DamnedShallowerZosma", Utils.generateRandomName(new Random(10)));
    }
}