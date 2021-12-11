public class Main implements Callable{

    public static void main(String[] args) {
	// write your code here
        //Creating new object for each high school
        Highschool cburgHigh = new Highschool();
        Highschool bburgHigh = new Highschool();
        Highschool aubHigh = new Highschool();
        Highschool eastHigh = new Highschool();

        //Setting names for each high school
        cburgHigh.setName("Christiansburg High School");
        bburgHigh.setName("Blacksburg High School");
        aubHigh.setName("Auburn High School");
        eastHigh.setName("Eastern Montgomery High School");
        //Setting enrollment for each high school
        cburgHigh.setEnrollment(1019);
        bburgHigh.setEnrollment(1199);
        aubHigh.setEnrollment(414);
        eastHigh.setEnrollment(289);
        //Setting names for each middle school
        //Main Output
        System.out.println("School System: " + SYSTEMNAME); //outputs string constants from Callable interface
        System.out.println("Superintendent: " + SUPERI);
        System.out.printf("Phone Number - " + PHONENUM);
        System.out.println(cburgHigh.getName());
        System.out.println("Enrollment is " + cburgHigh.getEnrollment());
        cburgHigh.describeLevel();
        System.out.println(bburgHigh.getName());
        System.out.println("Enrollment is " + bburgHigh.getEnrollment());
        bburgHigh.describeLevel();
    }
}
/* I need a display info method for every school class
* i need to add some dumb abstract method
* I might need to look up how interfaces work with abstract classes and if its different */