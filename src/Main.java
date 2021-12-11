public class Main implements Callable{

    public static void main(String[] args) {
	// write your code here
        //Creating new object for each high school, middle school, and elementary school
        Highschool cburgHigh = new Highschool();
        Highschool bburgHigh = new Highschool();
        Highschool aubHigh = new Highschool();
        Highschool eastHigh = new Highschool();
        Middleschool cburgMid = new Middleschool();
        Middleschool bburgMid = new Middleschool();
        Middleschool aubMid = new Middleschool();
        Middleschool shawMid = new Middleschool();
        Elementaryschool cburgElm = new Elementaryschool();
        Elementaryschool pricesF = new Elementaryschool();
        Elementaryschool aubElm = new Elementaryschool();
        Elementaryschool eastMelm = new Elementaryschool();
        Elementaryschool belv = new Elementaryschool();
        Elementaryschool fallb = new Elementaryschool();
        Elementaryschool gilb = new Elementaryschool();
        Elementaryschool hardave = new Elementaryschool();
        Elementaryschool kipps = new Elementaryschool();
        Elementaryschool margb = new Elementaryschool();


        //Setting names for each high school object
        cburgHigh.setName("Christiansburg High School");
        bburgHigh.setName("Blacksburg High School");
        aubHigh.setName("Auburn High School");
        eastHigh.setName("Eastern Montgomery High School");
        //Setting enrollment for each high school object
        cburgHigh.setEnrollment(1019);
        bburgHigh.setEnrollment(1199);
        aubHigh.setEnrollment(414);
        eastHigh.setEnrollment(289);
        //Setting names for each middle school obejct
        cburgMid.setName("Christiansburg Middle School");
        bburgMid.setName("Blacksburg Middle School");
        aubMid.setName("Auburn Middle School");
        shawMid.setName("Shawsville Middle School");
        //Setting enrollment for each middle school object
        cburgMid.setEnrollment(832);
        bburgMid.setEnrollment(959);
        aubMid.setEnrollment(574);
        shawMid.setEnrollment(218);
        //Setting names for each elementary school object
        cburgElm.setName("Christiansburg Elementary School");
        pricesF.setName("Prices Fork Elementary School");
        aubElm.setName("Auburn Elementary School");
        eastMelm.setName("Eastern Montgomery Elementary School");
        belv.setName("Belview Elementary School");
        gilb.setName("Gilbert Linkous Elementary School");
        margb.setName("Margaret Beeks Elementary School");
        fallb.setName("Falling Branch Elementary School");
        hardave.setName("Harding Avenue Elementary School");
        kipps.setName("Kipps Elementary School");
        //Setting enrollment for each elementary school object
        cburgElm.setEnrollment(388);
        pricesF.setEnrollment(459);
        aubElm.setEnrollment(552);
        eastMelm.setEnrollment(456);
        belv.setEnrollment(456);
        gilb.setEnrollment(456);
        margb.setEnrollment(456);
        fallb.setEnrollment(456);
        hardave.setEnrollment(456);
        kipps.setEnrollment(456);
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

        System.out.println(aubHigh.getName());
        System.out.println("Enrollment is " + aubHigh.getEnrollment());
        aubHigh.describeLevel();

        System.out.println(eastHigh.getName());
        System.out.println("Enrollment is " + eastHigh.getEnrollment());
        eastHigh.describeLevel();

        System.out.println(cburgMid.getName());
        System.out.println("Enrollment is " + cburgMid.getEnrollment());
        cburgMid.describeLevel();

        System.out.println(bburgMid.getName());
        System.out.println("Enrollment is " + bburgMid.getEnrollment());
        bburgMid.describeLevel();

        System.out.println(aubMid.getName());
        System.out.println("Enrollment is " + aubMid.getEnrollment());
        aubMid.describeLevel();

        System.out.println(shawMid.getName());
        System.out.println("Enrollment is " + shawMid.getEnrollment());
        shawMid.describeLevel();

        System.out.println(cburgElm.getName());
        System.out.println("Enrollment is " + cburgElm.getEnrollment());
        cburgElm.describeLevel();

        System.out.println(pricesF.getName());
        System.out.println("Enrollment is " + pricesF.getEnrollment());
        pricesF.describeLevel();

        System.out.println(aubElm.getName());
        System.out.println("Enrollment is " + aubElm.getEnrollment());
        aubElm.describeLevel();

        System.out.println(eastMelm.getName());
        System.out.println("Enrollment is " + eastMelm.getEnrollment());
        eastMelm.describeLevel();

        System.out.println(belv.getName());
        System.out.println("Enrollment is " + belv.getEnrollment());
        belv.describeLevel();

        System.out.println(gilb.getName());
        System.out.println("Enrollment is " + gilb.getEnrollment());
        gilb.describeLevel();

        System.out.println(kipps.getName());
        System.out.println("Enrollment is " + kipps.getEnrollment());
        kipps.describeLevel();

        System.out.println(fallb.getName());
        System.out.println("Enrollment is " + fallb.getEnrollment());
        fallb.describeLevel();

        System.out.println(margb.getName());
        System.out.println("Enrollment is " + margb.getEnrollment());
        margb.describeLevel();

        System.out.println(hardave.getName());
        System.out.println("Enrollment is " + hardave.getEnrollment());
        hardave.describeLevel();


    }
}
/* I need a display info method for every school class
* i need to add some dumb abstract method
* I might need to look up how interfaces work with abstract classes and if its different */