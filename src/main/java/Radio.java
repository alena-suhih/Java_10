public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int quantityStation;
    private int minNumberStation = 0;
    private int maxNumberStation = quantityStation - 1;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
        this.minNumberStation = 0;
        this.maxNumberStation = quantityStation - 1;
    }

    public Radio() {
        this.quantityStation = 10;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minNumberStation) {
            return;
        }
        if (newCurrentRadioStation > maxNumberStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentRadioStation < maxNumberStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = maxNumberStation;
        }
    }

    public void prevStation() {
        if (currentRadioStation > minNumberStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = minNumberStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}