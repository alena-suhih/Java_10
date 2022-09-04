import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMore9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationLess0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfter9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationBefore0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpper10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeLess0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

