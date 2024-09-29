package homework8.task2;

public class BaseConverter {
    public static String convert(double initialValue, DegreesType initialType) {
        System.out.println("See the results (" + initialValue + " " + initialType + " were converted to):");

        switch (initialType) {

            case C -> {
                double degreeK = initialValue + 273.15;
                double degreeF = 1.8 * initialValue + 32;
                System.out.println(degreeF + " " + DegreesType.K + "\n" + degreeK + " " + DegreesType.F);
            }

            case F -> {
                double degreeC = (initialValue - 32)/1.8;
                double degreeK = degreeC + 273.15;
                System.out.println(degreeC + " " + DegreesType.C + "\n" + degreeK + " " + DegreesType.K);
            }

            case K -> {
                double degreeC = initialValue - 273.15;
                double degreeF = 1.8 * degreeC + 32;
                System.out.println(degreeC + " " + DegreesType.C + "\n" + degreeF + " " + DegreesType.F);
            }
        }
        return "Finish";
    }
}