public class construction {
    int ModelYear;
    String CarName;
    
public construction(int year, String car){
    ModelYear = year;
    CarName = car;
}
public static void main(String[] args) {
    construction myCar = new construction(1989,"mustang");
    System.out.println("The model year of your car is: " + myCar.ModelYear);
    System.out.println("The name of your car is: " + myCar.CarName);
}
}