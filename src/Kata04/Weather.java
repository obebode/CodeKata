package Kata04;

public class Weather extends WeatherReader {

    private int Dy;
    private int MxT;
    private int MnT;

    public Weather() {
    }

    public Weather(int Dy, int MxT, int MnT) {
        this.Dy = Dy;
        this.MxT = MxT;
        this.MnT = MnT;
    }

    public void setN(int Dy, int MxT, int MnT) {
        this.Dy = Dy;
        this.MxT = MxT;
        this.MnT = MnT;
    }

    public int getTempSpread() {
        return MxT - MnT;
    }

    @Override
    public String toString() {
        return "WeatherPoint{" +
                "dayNumber=" + Dy +
                ", minimumTemp=" + MnT +
                ", maximumTemp=" + MxT +
                '}';

    }

}
