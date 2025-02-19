//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fusca fusca = new Fusca();
        fusca.setMarca("Ford");
        Fusca fusca2 = new Fusca();
        fusca.setMarca("Ferrari");
        Fusca fusca3 = new Fusca("x", "z");

        System.out.println(fusca.marca +" Fusca\n" + fusca.marca + "Fusca 2");
        fusca.acelerar();
    }
}