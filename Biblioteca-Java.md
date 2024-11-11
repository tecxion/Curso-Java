# PRINCIPALES BIBLIOTECAS QUE SE USAN EN JAVA
<br>

###1. java.lang
- Esta biblioteca es el núcleo de Java y se importa automáticamente. Incluye clases esenciales como String, Math, Integer, y System.
Principales clases:
<br>
- String: Para trabajar con cadenas de texto.
- Math: Para realizar operaciones matemáticas (seno, coseno, raíz cuadrada, etc.).
- System: Contiene funcionalidades de entrada/salida y control del sistema.
<br>
### 2. java.util
- Descripción: Esta biblioteca incluye clases de utilidades y estructuras de datos. Proporciona colecciones como listas, conjuntos, y mapas, así como clases para la gestión de fechas y tiempos.
Principales clases:
<br>
- ArrayList, HashSet, HashMap: Estructuras de datos para almacenar y organizar datos.
- Date y Calendar: Para trabajar con fechas y horas.
- Scanner: Para leer entradas desde el teclado o archivos.
  <br>
### 3. java.io
- Descripción: La biblioteca java.io proporciona clases para manejar entrada y salida de datos, ya sea desde archivos, redes o flujos de datos.
Principales clases:
<br>
- File: Para manipular archivos y directorios.
- FileInputStream y FileOutputStream: Para leer y escribir bytes desde y hacia archivos.
- BufferedReader y PrintWriter: Para trabajar con archivos de texto.
<br>
### 4. java.nio
- Descripción: java.nio (New Input/Output) es una biblioteca mejorada para la entrada y salida de datos, especialmente diseñada para trabajar con grandes cantidades de datos de manera más eficiente.
Principales clases:
<br>
- Path y Files: Para trabajar con rutas y archivos de forma más moderna y sencilla.
- ByteBuffer: Para manipular datos binarios en la memoria.
- Channels: Permite la transferencia rápida de datos entre archivos y redes.
<br>
### 5. java.net
- Descripción: Incluye clases para crear aplicaciones de red y realizar operaciones de red. Es útil para conexiones HTTP, sockets, y comunicación cliente-servidor.
Principales clases:
<br>
- URL y URLConnection: Para acceder a recursos de la web.
- Socket y ServerSocket: Para implementar comunicación entre cliente y servidor mediante sockets.
<br>
### 6. javax.swing
- Descripción: javax.swing es una biblioteca para construir interfaces gráficas de usuario (GUI) en aplicaciones de escritorio. Proporciona componentes visuales como ventanas, botones, cuadros de diálogo y más.
Principales clases:
<br>
- JFrame: Para crear una ventana principal.
- JButton, JLabel, JTextField: Componentes visuales básicos para botones, etiquetas, y campos de texto.
- JPanel: Para organizar los componentes visuales en contenedores.
<br>
### 7. java.sql
- Descripción: java.sql es la biblioteca para interactuar con bases de datos relacionales, usando SQL. Permite conectar Java con bases de datos como MySQL, PostgreSQL, y SQLite.
Principales clases:
<br>
- Connection: Representa una conexión a la base de datos.
- Statement y PreparedStatement: Para ejecutar consultas SQL.
- ResultSet: Para manejar los resultados de una consulta.
<br>
### 8. java.time
- Descripción: Introducida en Java 8, java.time es una biblioteca moderna para manipular fechas, tiempos y zonas horarias. Resuelve las limitaciones de las clases Date y Calendar.
Principales clases:
<br>
- LocalDate, LocalTime, LocalDateTime: Representan fechas y horas sin zonas horarias.
- ZonedDateTime: Representa una fecha y hora con zona horaria.
- Duration y Period: Para trabajar con intervalos de tiempo.
<br>
### 9. java.math
- Descripción: java.math incluye clases para trabajar con operaciones matemáticas avanzadas, especialmente aritmética de alta precisión.
Principales clases:
<br>
- BigInteger: Para trabajar con números enteros de precisión arbitraria.
- BigDecimal: Para trabajar con decimales de alta precisión, útil en aplicaciones financieras.
<br>
### 10. java.util.concurrent
- Descripción: Esta biblioteca proporciona herramientas para trabajar con programación concurrente y multihilos, facilitando la ejecución de múltiples tareas al mismo tiempo.
Principales clases:
<br>
- ExecutorService: Para manejar y gestionar hilos en una aplicación.
- Future: Permite controlar tareas que se ejecutan en segundo plano y obtener sus resultados cuando están listos.
- CountDownLatch, Semaphore: Para coordinar y controlar el acceso a recursos compartidos.
