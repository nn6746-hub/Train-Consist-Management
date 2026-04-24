import java.util.LinkedHashSet;

public class usecase5trainconsistmgmnt {

    public static void main(String[] args) {

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");


        trainFormation.add("Sleeper");

        System.out.println("Final Train Formation:");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}