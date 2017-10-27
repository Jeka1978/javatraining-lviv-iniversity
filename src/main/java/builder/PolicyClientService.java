package builder;

public class PolicyClientService {
    private final int numOfYears;
    private final int numOfAccidents;
    private final int age;
    private final int drivingAge;

    private PolicyClientService(int numOfYears, int numOfAccidents, int age, int drivingAge) {
        this.numOfYears = numOfYears;
        this.numOfAccidents = numOfAccidents;
        this.age = age;
        this.drivingAge = drivingAge;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int numOfYears;
        private int numOfAccidents;
        private int age;
        private int drivingAge;

        public Builder setNumOfYears(int numOfYears) {
            this.numOfYears = numOfYears;
            return this;
        }

        public Builder numOfAccidents(int numOfAccidents) {
            this.numOfAccidents = numOfAccidents;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder drivingAge(int drivingAge) {
            this.drivingAge = drivingAge;
            return this;
        }

        public PolicyClientService build() {
            validate();
            return new PolicyClientService(numOfYears, numOfAccidents, age, drivingAge);
        }

        private void validate() {

            if (age == 0) {
                throw new RuntimeException("age can't be 0");
            }
        }
    }

















    public double calcPriceForSomething1(){
        return 0;
    }
    public double calcPriceForSomething2(){
        return 0;
    }

}
