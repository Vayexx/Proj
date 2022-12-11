package Docs_Prj3;

public class Prj1 {
    public static void main(String[] args) {
        Passport passp1 = new Passport(111,222, "Ivan","Strelkov","Vldmrch",21);
        //passp1.printInfo();
        System.out.println(passp1);
    }

}






class Passport {
    int seria;
    int number;
    String name;
    String surname;
    String patr;
    int age;

    public Passport(int seria, int number, String name, String surname, String patr, int age) {

        this.seria = seria;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.patr = patr;
        this.age = age;
    }
    /*public void printInfo() {
        System.out.println(this);
        System.out.println(seria + " " + number + " " +name+" "+surname+" "+patr+" "+age +" ");
    }*/
    @Override
    public String toString() {
        return seria + " " + number + " " +name+" "+surname+" "+patr+" "+age +" ";
    }
}

