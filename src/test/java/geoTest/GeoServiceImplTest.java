package geoTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {

    @Test
    void  testByIpCity() {

        GeoService geoServiceImpl = new GeoServiceImpl();
        String ip = GeoServiceImpl.MOSCOW_IP;
        Location location = new Location("Moscow", Country.RUSSIA, "Lenina", 15);

        Location expected = geoServiceImpl.byIp(ip);

        Assertions.assertEquals(expected.toString(), location.toString());
    }

    @Test
    void  testByNumberIp() {

        GeoService geoServiceImpl = new GeoServiceImpl();
        String ip = "96.";
        Location location = new Location("New York", Country.USA, null,  0);

        Location expected = geoServiceImpl.byIp(ip);

        Assertions.assertEquals(expected.toString(), location.toString());
    }
}
