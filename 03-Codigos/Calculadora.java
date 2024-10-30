public class Calculadora {
public int sumar(int a, int b) {
return a + b;
}
public int restar(int a, int b) {
return a - b;
}
public int calcularOperacion(String operacion, int a, int b) {
int resultado = 0;
if (operacion.equals("suma")) {
resultado = sumar(a, b);
} else if (operacion.equals("resta")) {
resultado = restar(a, b);
} else if (operacion.equals("multiplicacion")) {
resultado = a * b;
} else if (operacion.equals("division") && b != 0) {
resultado = a / b;
} else {
System.out.println("Operación no soportada.");
}
return resultado;
}
}
