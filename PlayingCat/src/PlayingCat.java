public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int temperatureLimit = summer ? 45 : 35;

        if (temperature >= 25 && temperature <= temperatureLimit)
            return true;

        return false;
    }
}
