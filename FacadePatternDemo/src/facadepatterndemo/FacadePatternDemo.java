package facadepatterndemo;
class Amplifier {
    public void on() {
        System.out.println("Amplifier is on.");
    }
    public void off() {
        System.out.println("Amplifier is off.");
    }
}
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is on.");
    }
    public void play() {
        System.out.println("DVD Player is playing.");
    }
    public void off() {
        System.out.println("DVD Player is off.");
    }
}
class Projector {
    public void on() {
        System.out.println("Projector is on.");
    }
    public void off() {
        System.out.println("Projector is off.");
    }
}
class HomeTheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;
    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }
    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        dvd.on();
        dvd.play();
        projector.on();
    }
    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        projector.off();
        dvd.off();
        amp.off();
    }
}
public class FacadePatternDemo {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector);
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}

