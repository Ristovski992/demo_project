public class CustomMethods {
    void compareMethod(String p1, String p2){
        p1 = p1.replace("$", "");
        p2 = p2.replace("$", "");
        float price1 = Float.parseFloat(p1);
        float price4 = Float.parseFloat(p2);
        if (price1==price4){
            System.out.println("The Products have same prices"+price1+" "+price4);
        }else {
            System.out.println("The Products have different prices "+price1+" and "+price4);
        }
    }
}
