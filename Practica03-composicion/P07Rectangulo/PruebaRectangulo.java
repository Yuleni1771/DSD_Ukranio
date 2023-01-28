public class PruebaRectangulo {

    public static void main (String[] args) {
        //Rectangulo rect1 = new Rectangulo(2,3,5,1);
        Coordenada c1 = new Coordenada(5,10);
        Coordenada c2 = new Coordenada(7,4);
    	Rectangulo rect1 = new Rectangulo(c1,c2);
        double ancho, alto;        

        System.out.println("Calculando el area de un rectangulo dadas sus coordenadas en un plano cartesiano:");
        System.out.println(rect1);
        alto = rect1.superiorIzquierda().ordenada() - rect1.inferiorDerecha().ordenada();
        ancho = rect1.inferiorDerecha().abcisa() - rect1.superiorIzquierda().abcisa();
        System.out.println("El area del rectangulo es = " + ancho*alto);
    }
}