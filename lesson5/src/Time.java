//Создать класс и объекты, описывающие промежуток времени. +
//        Сам промежуток должен задаваться 3 свойствами: секундами, минутами, часами. +
//        Сделать методы
//        * для получения полного количества секунд в объекте, +
//        * сравнения двух объектов(метод должен работать аналогично compareTo в строках).+
//        Создать два конструктора:
//        *получающий общее количество секунд +
//        * часы, минуты и секунды по отдельности +
//        Сделать метод для вывода данных+

public class Time {


    private long sec;
    private int min;
    private int hours;


    public Time(long sec, int min, int hours){
        this.hours=hours;
        this.min=min;
        this.sec=sec;
    }

    public Time(long sec){
        this.hours = (int) (sec/3600);
        this.min = (int)((sec - this.hours*3600)/60);
        this.sec = sec - this.hours* 3600L -this.min*60L;
    }

    public long allsec(){
        return sec + min*60L + hours*3600L;
    }

    public long compare_time(Time t1){

        return  (this.allsec()-t1.allsec());

    }

    @Override
    public String toString() {
        return "Time{" +
                "sec=" + sec +
                ", min=" + min +
                ", hours=" + hours +
                '}';
    }
}
