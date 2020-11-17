public class Main {


    public static void main(String[] args) throws InterruptedException{
        Marcador count = new Marcador();
        int sum;
        for(int i = 0; i < 3; i++){
            Thread hilo = new Thread(new Lanzador(count), "hilo "+i);
            hilo.start();
            hilo.join();
        }
        sum = count.counterOne.get() + count.counterTwo.get() + count.counterThree.get() +
                count.counterFour.get() + count.counterFive.get() + count.counterSix.get();
        System.out.printf("Número 1: %d veces.%nNúmero 2: %d veces.%nNúmero 3: %d veces.%n" +
                        "Número 4: %d veces.%nNúmero 5: %d veces.%nNúmero 6: %d veces.%nTotal de veces:" +
                        " %d + %d + %d + %d + %d + %d = %d"
                ,count.counterOne.get(), count.counterTwo.get(), count.counterThree.get(),
                count.counterFour.get(), count.counterFive.get(), count.counterSix.get(), count.counterOne.get(),
                count.counterTwo.get(), count.counterThree.get(),
                count.counterFour.get(), count.counterFive.get(), count.counterSix.get(), sum);

    }

}
