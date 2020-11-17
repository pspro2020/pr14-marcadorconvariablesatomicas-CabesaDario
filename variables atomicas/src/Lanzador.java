import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lanzador implements Runnable{
    private Marcador marcador;

    public Lanzador(Marcador marcador) {
        this.marcador = marcador;
    }

    @Override
    public void run() {
        Integer dice;
        Random random = new Random();
        for(int i=0;i < 10000; i++){
            dice=random.nextInt(6)+1;
            increment(dice);
        }

    }
    private  void increment(int dice){
        switch (dice) {
            case 1:
                marcador.counterOne.incrementAndGet();
                break;
            case 2:
                marcador.counterTwo.incrementAndGet();
                break;
            case 3:
                marcador.counterThree.incrementAndGet();;
                break;
            case 4:
                marcador.counterFour.incrementAndGet();;
                break;
            case 5:
                marcador.counterFive.incrementAndGet();;
                break;
            case 6:
                marcador.counterSix.incrementAndGet();;
                break;

        }

    }
}
