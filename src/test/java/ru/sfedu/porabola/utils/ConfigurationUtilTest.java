package ru.sfedu.porabola.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static ru.sfedu.porabola.Constants.PATH_TO_OPENCV_LIB;
import static ru.sfedu.porabola.utils.ConfigurationUtil.*;

public class ConfigurationUtilTest {
    @Test
    public void testConfiguration() throws IOException {
        String pathValue = getConfigurationEntry(PATH_TO_OPENCV_LIB);
        Assertions.assertNotNull(pathValue);
    }
}