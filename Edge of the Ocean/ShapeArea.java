class Solution {
    public static int solution(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            
            int area = solution (n -1);
            
            int additionalArea = (n -1) * 4;
            
            area += additionalArea;
            
            return area;
        }
    }

}




//Este código es una función llamada "solution" que toma un entero n como parámetro y devuelve un valor entero que representa el área total 
//de un cuadrado formado por n cuadrados más pequeños. Cada uno de estos cuadrados pequeños tiene un lado de longitud 1 unidad.

//El código utiliza una técnica de programación recursiva para calcular el área total. 
//La función se llama a sí misma de forma recursiva para calcular el área de un cuadrado de n-1 unidades de lado y luego suma el área adicional 
//del nuevo cuadrado para obtener el área total.

//El funcionamiento del código es el siguiente:

//Primero se verifica si el valor de n es menor o igual a cero. Si es así, la función devuelve 0, ya que no hay ningún cuadrado en este caso.

//Si n es igual a 1, la función devuelve 1, ya que el cuadrado de 1 unidad de lado tiene un área de 1 unidad cuadrada.

//Si n es mayor que 1, se calcula el área del cuadrado de n-1 unidades de lado llamando a la función de forma recursiva con n-1. 
//El valor devuelto por la llamada recursiva se almacena en una variable llamada area.

//A continuación, se calcula el área adicional del nuevo cuadrado. 
//Como el nuevo cuadrado tiene n-1 cuadrados pequeños en cada lado, su perímetro es de (n-1)*4. Por lo tanto, 
//el área adicional del nuevo cuadrado es igual a (n-1)*4.

//Finalmente, se agrega el área adicional al área del cuadrado de n-1 unidades de lado y se devuelve el resultado.

//En resumen, este código utiliza la recursión para calcular el área total de un cuadrado formado por n cuadrados más pequeños. 
//Se divide el problema en subproblemas más pequeños hasta que se llega a los casos base (cuando n es igual a 0 o 1), 
//y luego se combina la solución de cada subproblema para obtener la solución del problema original.