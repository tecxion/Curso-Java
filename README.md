# <center> CURSO DE JAVA Básico. </center>
![curso java](./Media_Java/CURSO.png)
<br>
##Bienvenidos a todos a este curso básico de Java, iré subiendo apuntes poco a poco según vayamos avanzando.
### Primero empezaremos con las variables que hay en java.

####1. Tipos de Datos Primitivos

Java tiene 8 tipos de datos primitivos. Estos tipos almacenan valores simples directamente y no son objetos.<br>
- byte: Representa un número entero de 8 bits. Rango: -128 a 127. 
```
byte b = 10;
```
- short: Número entero de 16 bits. Rango: -32,768 a 32,767.
```
short s = 1000;
```
- int: Número entero de 32 bits. Rango: -2^31 a 2^31 - 1.
```
int i = 100000;
```
- long: Número entero de 64 bits. Rango: -2^63 a 2^63 - 1. Se puede añadir una L al final para indicar un valor largo.
```
long l = 1000000000L;
```
- float: Número de punto flotante de precisión simple (32 bits). Se usa para números decimales. Añade f o F al final.
```
float f = 5.75f;
```
- double: Número de punto flotante de doble precisión (64 bits). Es el tipo predeterminado para decimales en Java.
```
double d = 19.99;
```
- boolean: Representa un valor lógico: true o false
```
boolean isJavaFun = true;
```
- char: Representa un solo carácter en formato Unicode (16 bits). Su rango es de 0 a 65,535.
```
char c = 'A';
```

####2. Tipos de Datos por Referencia

Los tipos de datos por referencia son objetos y pueden almacenar direcciones de memoria. Al contrario de los tipos primitivos, estos tipos pueden almacenar datos más complejos.

- String: Representa una secuencia de caracteres. Aunque no es un tipo de datos primitivo, es un tipo de referencia comúnmente utilizado.
```
String greeting = "Hello, World!";
```
- Arrays (Arreglos): Una colección de elementos del mismo tipo de datos. Se puede definir para cualquier tipo de datos primitivo o referencia.
```
int[] numbers = {1, 2, 3, 4, 5};
```
- Clases y Objetos: Puedes crear tus propios tipos de referencia al definir clases. Estos se instancian como objetos.
```
Persona persona1 = new Persona("Ana", 30);
```

####3. Modificadores de Variables

Además del tipo de datos, las variables pueden tener diferentes modificadores que afectan cómo se pueden usar:

- final: Define una constante (un valor inmutable).
```
final int MAX_AGE = 100;
```
- static: Define una variable compartida por todas las instancias de una clase.
```
static int contador;
```



----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## Aquí podremos aprender java con ejercicios y soluciones.




#EJERCICIOS y sus soluciones

###EL FAMOSO FIZZBUZZ<br>
```
/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
```

### SUCESCIÓN DE FIBONACCI
```
/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
```

  Las Soluciones la tenéis en la carpeta soluciones[SOLUCIONES](https://github.com/tecxion/Curso-Java/tree/main/Soluciones).
