import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio more = new Radio();

    @Test
    public void test() {

        Radio more = new Radio(20);
        more.setCurrentStation(15);

        int expected = 15;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        Radio more = new Radio();

        more.setCurrentStation(10);

        int expected = 0;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio more = new Radio();

        more.setCurrentStation(9);

        int expected = 9;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio more = new Radio();

        more.setCurrentStation(-1);

        int expected = 0;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio more = new Radio();

        more.setCurrentStation(1);

        int expected = 1;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldVolume() {

        more.setCurrentVolume(100);

        int expected = 100;
        int actual = more.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldVolume1() {

        more.setCurrentVolume(99);

        int expected = 99;
        int actual = more.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolume2() {

        more.setCurrentVolume(101);

        int expected = 0;
        int actual = more.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolume3() {

        more.setCurrentVolume(-1);

        int expected = 0;
        int actual = more.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationMore() {

        more.setCurrentStation(8);

        more.next();

        int expected = 9;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
//
//
    @Test
    public void shouldStationMore1() {

        more.setCurrentStation(10);

        more.next();

        int expected = 1;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationMore2() {

        more.setCurrentStation(9);

        more.next();

        int expected = 0;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationLess() {

        more.setCurrentStation(1);

        more.prev();

        int expected = 0;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationLess1() {

        more.setCurrentStation(0);

        more.prev();

        int expected = 9;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationExceed1() {

        more.setCurrentStation(-1);

        int expected = 0;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}
