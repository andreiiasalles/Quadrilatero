class Main {
  public static void main(String[] args) {
    
    Quadrilatero q = new Quadrado(4f);
    Quadrilatero r = new Retangulo(8f, 4f);
    
   System.out.println("A area do quadrado é: " + q.calcularArea());

  System.out.println("A area do retangulo é: " + r.calcularArea());
    
    
  }
}