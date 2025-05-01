/*
9. Write a Java program to create an abstract class Instrument with abstract methods play() and tune().
Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective
methods to play and tune each instrument.
*/


public class XyloPhone extends Instrument {

    @Override
    public void play(){
        System.out.println(this.getClass().getSimpleName() + " is playing....");
    }

    @Override
    public void stop(){
        System.out.println(this.getClass().getSimpleName() + " is stopping....");
    }
}
