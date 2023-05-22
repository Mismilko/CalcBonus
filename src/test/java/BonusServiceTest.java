import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.BonusService;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredUnderLimit () {
        BonusService service= new BonusService();

        long amount = 1000;
        boolean registered = false ;
        long expected = 10;
        long actual = service.calculate(1000, false);
        Assertions.assertEquals( expected, actual);
    }
    @Test
    void sholdCalculateForNotRegisteredAndOverLimit () {
        BonusService service= new BonusService();

        long amount = 1_000_000;
        boolean registereg = false;
        long expected = 500;
        long actual = service.calculate(1_000_000, false);
        Assertions.assertEquals(expected, actual);
    }
}