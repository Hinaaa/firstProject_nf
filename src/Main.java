public class Main {
    public static void main(String[] args) {
        JavaBasics basicObj = new JavaBasics();
        //    basicObj.basics();
        ConditionsUndMethods cUmObj = new ConditionsUndMethods();
        cUmObj.coditions();
        String name1 = "Hina";
        String name2 = "Jawaid";
        cUmObj.greetStudent(name1);
        //isEven
        System.out.println(("Number is Even: "+cUmObj.isEven(20)));
        System.out.println(("Number is Even: "+cUmObj.isEven(20)));//testing updates
        System.out.println("multiple value: "+cUmObj.multiply(2,3));
        System.out.println("Subtracted value: "+cUmObj.add(10.343f,7.7828f));
        System.out.println("Subtracted value: "+cUmObj.subtract(10,7));
        //makePositvnumber
        System.out.println("Positive als positiv: "+cUmObj.makePositiv(10));
        System.out.println("Negativ als positiv: "+cUmObj.makePositiv(-9));

        //test Switch
        cUmObj.trySwitch();
    }

}
