package i18nTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {

    @Test
    void  testLocale_country_Russia() {

        LocalizationService localizationServiceImpl = new LocalizationServiceImpl();
        Country country = Country.RUSSIA;
        String message = "Добро пожаловать";

        String expected = localizationServiceImpl.locale(country);

        Assertions.assertEquals(expected, message);
    }

    @Test
    void  testLocale_country_not_Russia() {

        LocalizationService localizationServiceImpl = new LocalizationServiceImpl();
        Country country = Country.USA;
        String message = "Welcome";

        String expected = localizationServiceImpl.locale(country);

        Assertions.assertEquals(expected, message);
    }
}
