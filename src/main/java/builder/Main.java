package builder;

public class Main {
    public static void main(String[] args) {

        PolicyClientService.Builder builder = PolicyClientService.builder();
        PolicyClientService policyClientService = builder.numOfAccidents(3).drivingAge(20).build();


    }
}
