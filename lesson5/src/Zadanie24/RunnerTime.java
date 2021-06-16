package Zadanie24;

public class RunnerTime {
    public static void main(String[] args) {
        Time t1 = new Time(5,10,2);
        Time t2 = new Time(635890);


        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t1.allsec());
        System.out.println(t2.allsec());
        System.out.println(t1.compare_time(t2));


    }

}
