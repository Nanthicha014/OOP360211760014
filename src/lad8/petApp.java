package lad8;

public class petApp {
    public static void main(String[] args){

        Dog d1 = new Dog();
        d1.setName("Safe");
        d1.setAge(5);

        System.out.println(d1.toString()+" "+d1.getClass().getSimpleName());

        cat d2 = new cat();
        d2.setName("DaDa");
        d2.setAge(3);
        System.out.println(d2.toString()+" "+d2.getClass().getSimpleName());




    }//main
}//class
