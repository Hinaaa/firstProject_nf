public class JavaBasics {
    public void basics() {
        System.out.println("Java ist cool!");
        System.out.println("Ich lerne Java!");
        //Ganzzahlen
        byte ab =  127;
        short sb = 32767;
        int c = 2147483647;
        long l = 9223372036854775807L;
        System.out.println("int value: "+c);
        c = 5; //change value
        System.out.println("change value: "+c);
        //Fließkommazahlen
        float pi = 3.14159265358797f;
        double d = 3.1415926342432423432432;
        //Wahreitswert (Schalter)
        boolean bool = true;
        boolean bool2 = false;

        //Zeichen
        char c1 = 'r';
        String string1 = "test";
        System.out.println(string1);

        //Aufgabe2.1 :Namen einer Person zu speichern,
        String name = "Jana Jorden";
        System.out.println("Namen einer Person zu speichern: "+ name); //Namen
        int age = 28;
        System.out.println("Age: "+ age); //Alter
        double groesse = 1.75;
        System.out.println("Age: "+ groesse + " Meter"); //Körpergröße
        boolean student = true;
        System.out.println("Student? : "+ student); //Person ein Student ist

        //Mathemtische Operatoren
        int a1 = 5;
        int a2= 4;
        int sum = a1+a2;
        int diff = a1-a2;
        int prod = a1* a2;
        int quotient = a1/a2;
        System.out.println("Sum= "+sum+" , "+" quotient= "+quotient);
        String hello = "hello";
        String world = "world";
        System.out.println(hello+" "+world);

        //Vergleichoperatoren //comparison operators //Declare and Return Boolen
        boolean isEqual = a1 == a2; //or =2==3 but not used //gleichheit prufun(check equality)
        boolean isGreater = a1>a2;
        boolean isLess = a1<a2;
        boolean isGreaterOrEqual = a1 >= a2;
        System.out.println("Vergleichoperatoren: "+isEqual);
        System.out.println("Vergleichoperatoren isGreaterOrEqual: "+isGreaterOrEqual);

        //Logischen Operator &&
        boolean logischAnd = a1>a2 && a1>3;
        boolean logischOr = a1> a2 || a1>3;
        boolean isNOtequal = a1!=a2; //nicht
        System.out.println("Vergleichoperatoren: "+logischAnd); //false
        System.out.println("Vergleichoperatoren isNOtequal: "+logischAnd); //true

        //Aufgabe operatoren
        int a = 9;
        int b = 6;
        int Addition = a+b;
        System.out.println("Aufgabe Addition= "+Addition);
        int Subtraktion = a-b;
        System.out.println("Aufgabe Subtraktion= "+Subtraktion);
        int Multiplikation = a+b;
        System.out.println("Aufgabe Multiplikation= "+Multiplikation);
        int Division = a/b;
        System.out.println("Aufgabe Division= "+Division);

        //Double
        double ad = 9.9023;
        double bd = 6.2367;
        double Additiond = ad+bd;
        System.out.println("Aufgabe Addition= "+Additiond);
        double Subtraktiond = ad-bd;
        System.out.println("Aufgabe Subtraktion= "+Subtraktiond);
        double Multiplikationd = ad+bd;
        System.out.println("Aufgabe Multiplikation= "+Multiplikationd);
        double Divisiond = ad/bd;
        System.out.println("Aufgabe Division= "+Divisiond);

        //Aufgabe operatoren float
        float af = 9.233f;
        float bf = 6.453f;
        float Additionf = af+bf;
        System.out.println("Aufgabe Addition= "+Additionf);
        float Subtraktionf = af-bf;
        System.out.println("Aufgabe Subtraktion= "+Subtraktionf);
        float Multiplikationf = af+bf;
        System.out.println("Aufgabe Multiplikation= "+Multiplikationf);
        float Divisionf = af/bf;
        System.out.println("Aufgabe Division= "+Divisionf);

         /*       it does not correctly compare String values in Java.
        String hello1 = "wwe";
        String hello2 = "ew";
        System.out.println(hello1 == hello2);
        */
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("if Hello == World?: "+s1 == s2); //return true dalse
        System.out.println("Hello equals to World?: "+s1.equals(s2)); //compare actual values
        System.out.println("World Greater than ?: "+s1.compareTo(s2)); //for > and <. here s1 is greater
        System.out.println("World Greater than Hello?: "+ s2.compareTo(s1)); //if s2 is greater

        //Create two string variables with the values "A" and "B" and compare them using >, <, and ==.
        String str1 = "A";
        String str2 = "B";
        System.out.println("if A == B?: "+str1.equals(str2));
        System.out.println("if A is greater than B?: "+ str1.compareTo(str2));
        System.out.println("if B is greater than A?:"+str2.compareTo(str1)); //if str2 is greater

        //Create two string variables with the values "a" and "B" and compare them using >, <, and ==.
        String strC1 = "a";
        String strC2 = "B";
        System.out.println("if a == B?: "+strC1.equals(strC2));
        System.out.println("if a is greater B?: "+ strC1.compareTo(strC2));
        System.out.println("if B is greater a?:"+strC2.compareTo(strC1)); //if str2 is greater
        //true false answers
        System.out.println("if a == B?: "+strC1.equals(strC2));
        System.out.println("if a is greater B?: "+ (strC1.compareTo(strC2)>0));
        System.out.println("if B is greater a?:"+(strC2.compareTo(strC1)>0)); //if str2 is greater
    }
}
