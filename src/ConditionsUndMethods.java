public class ConditionsUndMethods {
    public void coditions() {
        //Altersprüfung
        int person1Age = 19;
        if (person1Age >= 21) {
            System.out.println("du bist volljährig, in den USA");
        } else if (person1Age >= 18) {
            System.out.println("du bist volljährig, in den Deutschland");
        } else {
            System.out.println("du bist minderjährig");
        }

        //Überprüfe, ob der Name länger als 10 Zeichen
        String name = "Hina";
        int namensLaenge = name.length();
        if (name.length() > 10) {
            System.out.println("Der Name ist länger als 10 Zeichen. namensLänge: " + namensLaenge);
        } else {
            System.out.println("Der Name ist kürzer als 10 Zeichen. namensLänge: " + namensLaenge);
        }
    }

    public void greetStudent(String name) {
        System.out.println("Hallo Willkomen: " + name);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a * b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static int makePositiv(int number) {
        return Math.abs(number);
    }
    public void trySwitch() {
        //switch use
        int grade = 2;
        switch (grade) {
            case 1:
                System.out.println("Test Switch: sehr. gut");
                break;

            case 2:
                System.out.println("Test Switch: gut");
                break;

            default:
                System.out.println("Test Switch: ok");
        }
    }
}