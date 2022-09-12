public class Radio {
    private int currentRadioStation = 0;
    private int currentVolume = 0;
    private int quantityStation = 10;
    private int minNumberStation = 0;
    private int maxNumberStation;
    private int minVolume;
    private int maxVolume;

    public Radio(int currentRadioStation, int currentVolume, int quantityStation, int minNumberStation, int maxNumberStation, int minVolume, int maxVolume) {
        this.maxNumberStation = this.quantityStation - 1;
        this.minVolume = 0;
        this.maxVolume = 100;
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
        this.quantityStation = quantityStation;
        this.minNumberStation = minNumberStation;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getQuantityStation() {
        return this.quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getMinNumberStation() {
        return this.minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getMaxNumberStation() {
        return this.maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public Radio() {
        this.maxNumberStation = this.quantityStation - 1;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCurrentRadioStation() != other.getCurrentRadioStation()) {
                return false;
            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
                return false;
            } else if (this.getQuantityStation() != other.getQuantityStation()) {
                return false;
            } else if (this.getMinNumberStation() != other.getMinNumberStation()) {
                return false;
            } else if (this.getMaxNumberStation() != other.getMaxNumberStation()) {
                return false;
            } else if (this.getMinVolume() != other.getMinVolume()) {
                return false;
            } else {
                return this.getMaxVolume() == other.getMaxVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + this.getCurrentRadioStation();
        result = result * 59 + this.getCurrentVolume();
        result = result * 59 + this.getQuantityStation();
        result = result * 59 + this.getMinNumberStation();
        result = result * 59 + this.getMaxNumberStation();
        result = result * 59 + this.getMinVolume();
        result = result * 59 + this.getMaxVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getCurrentRadioStation();
        return "Radio(currentRadioStation=" + var10000 + ", currentVolume=" + this.getCurrentVolume() + ", quantityStation=" + this.getQuantityStation() + ", minNumberStation=" + this.getMinNumberStation() + ", maxNumberStation=" + this.getMaxNumberStation() + ", minVolume=" + this.getMinVolume() + ", maxVolume=" + this.getMaxVolume() + ")";
    }
}
