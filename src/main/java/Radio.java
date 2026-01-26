public class Radio {

    private int currentVolume;
    private int currentStation;
    private int numberStation = 10;
    private int lastStation = numberStation - 1;

    public Radio(int numberStation) { // 1 конструктор с параметром - количеством станций
        this.numberStation = numberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int newLastStation) {
        lastStation = newLastStation - 1;
    }

    public Radio() { // 2 конструктор без параметров
        currentStation = numberStation;

    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        } else {
            currentVolume = 0;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        } else {
            currentVolume = 100;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 10) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < 10) {
            currentStation += 1;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation -= 1;
        } else {
            currentStation = 10;
        }
    }
}

