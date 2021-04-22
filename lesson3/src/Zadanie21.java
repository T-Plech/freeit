//Напишите три цикла, выполняющих многократное сложение строк
//один с помощью оператора сложения String
//другой с помощью StringBuilder и метода append
//третий аналогично для StringBuffer.
//Сравните скорость их выполнения


public class Zadanie21 {
    public static void main(String[] args){


        String[] add = {"всё ", "получится. ", "Я ", "точно ", "знаю."};
        String result = "";

        long startInMillis =  System.currentTimeMillis();
        System.out.println("start простое сложение строк " + startInMillis);
        for (int i=0; i<add.length;i++){
            result+= add[i];

        }
        System.out.println(result);

        long endInMillis = System.currentTimeMillis();
        System.out.println("end простое сложение строк" + endInMillis);
        long x = endInMillis-startInMillis;

        System.out.println("время для прохождения цикла простого сложения строк: " + x + " ms" + "\n");


       // Цикл StringBuilder

        long startBuilder = System.currentTimeMillis();
        System.out.println("start StringBuilder: " + startBuilder);
       StringBuilder resultBuilder = new StringBuilder();

       for(int i=0;i< add.length;i++){
           resultBuilder.append(add[i]);
       }
      // System.out.println(resultBuilder);
       long endBuilder = System.currentTimeMillis();
        System.out.println("end StringBuilder: " + endBuilder);
       long xBuilder = endBuilder-startBuilder;
       System.out.println("время для прохождения цикла Builder строк: " + xBuilder +" ms"+ "\n");

       //Цикл StringBuffer

       long startBuffer = System.currentTimeMillis();
        System.out.println("start StringBuffer: " + startBuffer);
       StringBuffer resultBuffer = new StringBuffer();
       for (int i=0; i<add.length;i++){
           resultBuffer.append(add[i]);
       }
      // System.out.println(resultBuffer);

       long endBuffer = System.currentTimeMillis();
       System.out.println("end StringBuffer: "+endBuffer);
       long xBuffer = endBuffer-startBuffer;
        System.out.println("время для прохождения цикла Buffer строк: " + xBuffer + " ms");


    }

}
