public class Radio {

    private int currentVolume;
    private int currentStation;
    private int maxStation;


    public Radio(int numberStation) { // 1 конструктор с параметром - количеством станций
        this.maxStation = numberStation - 1;
    }

    public Radio() { // 2 конструктор без параметров
        this.maxStation = 9;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation ++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation --;
        } else {
            currentStation = maxStation;
        }
    }
}

