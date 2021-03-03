public class TimePrint {
    public static void main(String[] args){
        int s = 4500;
        int sec = s%60;
        int m=(s-sec)/60;
        int min=m%60;
        int h=(m-min)/60;
        int ho=h%24;
        int d=(h-ho)/24;
        int day=d%7;
        int w=(d-day)/7;
        System.out.println(m+" мин "+ sec+" секунд");
        System.out.println(h+" ч "+min+" мин "+sec+" сек");
        System.out.println(d+" дней "+ho+" ч "+min+" мин "+sec+" сек");
        System.out.println(w+" недель " + day +" дней "+ho+" ч "+min+" мин "+sec+" сек");
    }
}
