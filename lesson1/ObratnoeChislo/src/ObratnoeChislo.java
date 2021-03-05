public class ObratnoeChislo {
    public static void main(String[] args){

        int x=4359;

        int a=x/1000;
        int b=(x-a*1000)/100;
        int c=(x-a*1000-b*100)/10;
        int d=x-a*1000-b*100-c*10;

        System.out.println("Искомое число= " + d+c+b+a);

    }
}
