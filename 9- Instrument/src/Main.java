/*
9. Write a Java program to create an abstract class Instrument with abstract methods play() and tune().
Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective
methods to play and tune each instrument.
*/

public class Main {
    public static void main(String[] args) {

        Instrument violin = new Violin();
        Instrument xyloPhone = new XyloPhone();

        violin.play();
        violin.stop();

        System.out.println();
        xyloPhone.play();
        xyloPhone.stop();
    }
}