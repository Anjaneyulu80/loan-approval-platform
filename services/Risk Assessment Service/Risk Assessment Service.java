public class RiskEngine {

    public String assessRisk(int score) {

        if(score > 700) {
            return "LOW";
        }

        return "HIGH";
    }
}
