package spielwiese.src.inheritance;

public class Teacher extends Person {
 //kann Person Methode überschreiben außer wenn final
    @Override
    public void doSomething() {
        System.out.println("I am a teacher");
    }
}
