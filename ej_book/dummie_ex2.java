public class dummie_ex2 {
    private static final int _1400 = 1400;

    public static void main(String[] args) {
        int weightOfPerson;
        int elevatorWeightLimit;
        int numberOfPeople;

        char myLittleChar = 'D';
        char myBigChar = Character.toLowerCase(myLittleChar);

        weightOfPerson = 150;
        elevatorWeightLimit = _1400;

        numberOfPeople = elevatorWeightLimit / weightOfPerson;


        System.out.println("you can fit though");
        System.out.println(numberOfPeople);
        System.out.println("people in the elevator");
        System.out.println(myBigChar);

    }
}
