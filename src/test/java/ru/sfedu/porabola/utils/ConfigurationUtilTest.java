package ru.sfedu.porabola.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.sfedu.porabola.Porabola;

import static ru.sfedu.porabola.Constants.PATH_TO_OPENCV_LIB;
import static ru.sfedu.porabola.ConfigurationUtil.*;

public class ConfigurationUtilTest {
    @Test
    public void testConfiguration() throws Exception {
        Porabola porabola = new Porabola();
        String pathValue = getConfigurationEntry(PATH_TO_OPENCV_LIB);
        Assertions.assertNotNull(pathValue);
    }
}