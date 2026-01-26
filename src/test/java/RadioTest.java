import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio more = new Radio();

    @Test
    public void test() {
        more.setLastStation(35);

        int expected = 34;
        int actual = more.getLastStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio more = new Radio(10);

        Assertions.assertEquals(10, more.getNumberStation());
    }


    @Test
    public void shouldVolumeMore() {

        more.setCurrentVolume(95);

        more.increaseVolume();

        int expected = 96;
        int actual = more.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMore1() {

        more.setCurrentVolume(100);

        more.increaseVolume();

        int expected = 0;
        int actual = more.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeLess() {

        more.setCurrentVolume(95);

        more.decreaseVolume();

        int expected = 94;
        int actual = more.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeLess1() {

        more.setCurrentVolume(0);

        more.decreaseVolume();

        int expected = 100;
        int actual = more.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeExceed() {

        more.setCurrentVolume(101);

        int expected = 0;
        int actual = more.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeExceed1() {

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


    @Test
    public void shouldStationMore1() {

        more.setCurrentStation(10);

        more.next();

        int expected = 0;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationLess() {

        more.setCurrentStation(2);

        more.prev();

        int expected = 1;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationLess1() {

        more.setCurrentStation(0);

        more.prev();

        int expected = 10;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationExceed() {

        more.setCurrentStation(10);

        int expected = 10;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationExceed1() {

        more.setCurrentStation(-1);

        int expected = 10;
        int actual = more.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}
