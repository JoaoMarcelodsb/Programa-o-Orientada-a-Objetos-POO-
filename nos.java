public class Amarrado {
    int valor;
    Amarrado seguido;

    public Amarrado(int valor) {
        this.valor = valor;
        this.seguido = null;
    }

    public static void main(String[] args) {
        Amarrado primeiro = new Amarrado(50);
        Amarrado segundo = new Amarrado(100);
        Amarrado terceiro = new Amarrado(150);
        Amarrado quarto = new Amarrado(200);

        primeiro.seguido = segundo;
        segundo.seguido = terceiro;
        terceiro.seguido = quarto;

        System.out.println("uma amarrada: " + primeiro.valor);
        System.out.println("duas amarrada: " + primeiro.seguido.valor);
        System.out.println("tres amarrada: " + primeiro.seguido.seguido.valor);
        System.out.println("quatro amarrada: " + primeiro.seguido.seguido.seguido.valor);
      
    }
}
