public class Principal {
    public static void main(String[] args) {
        Circulo circ = new Circulo(2);
        Quadrado quad = new Quadrado(2, 2);
        Triangulo tria = new Triangulo(5,2); 


        
        System.out.println(circ.calcularArea()); 
        System.out.println(quad.calcularArea()); 
        System.out.println(tria.calcularArea()); 
    }
}
