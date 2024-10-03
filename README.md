# Aprobación de Alumnos

Este es un proyecto Java con interfaz gráfica que permite ingresar las notas de alumnos, calcular su promedio y evaluar si están aprobados. También permite guardar estos datos en una base de datos MySQL.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- **Ventana**: Controla la interfaz gráfica donde se ingresan los datos del alumno.
- **Alumno**: Representa al alumno, con sus atributos `nombre` y `edad`.
- **Notas**: Calcula el promedio de las cuatro notas del alumno y evalúa si está aprobado o si tiene derecho a recuperación.
- **Database**: Maneja la conexión con la base de datos y permite guardar los datos del alumno.

## Funcionalidades Principales

1. **Ingreso de Datos**: El usuario puede ingresar el nombre, edad y las cuatro notas del alumno.
2. **Cálculo del Promedio**: El sistema calcula el promedio de las notas ingresadas.
3. **Evaluación del Alumno**: Dependiendo del promedio, el sistema indica si el alumno está aprobado, si tiene derecho a recuperación, o si ha reprobado.
4. **Guardar Datos**: Los datos del alumno se guardan en una base de datos MySQL.
5. **Limpieza de Datos**: El usuario puede limpiar los campos de entrada para realizar nuevos cálculos.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- MySQL (con una base de datos configurada y accesible).
- Conexión con un servidor MySQL donde se pueda almacenar la información de los alumnos.

## Instalación

1. Clona el repositorio en tu máquina local:
    ```bash
    git clone https://github.com/usuario/proyecto-aprobacion-alumnos.git
    ```

2. Configura la base de datos:
    - Crea una base de datos en MySQL llamada `proyecto2`.
    - Crea una tabla llamada `alumnos` con la siguiente estructura:
      ```sql
      CREATE TABLE alumnos (
          id INT AUTO_INCREMENT PRIMARY KEY,
          nombre VARCHAR(100),
          edad INT,
          nota1 INT,
          nota2 INT,
          nota3 INT,
          nota4 INT,
          promedio DOUBLE
      );
      ```

3. Actualiza los parámetros de conexión a la base de datos en la clase `Database` si es necesario:
    ```java
    private String host = "localhost";
    private String port = "3306";
    private String dbName = "proyecto2";
    private String userName = "root";
    private String password = "Shadowdz1234";
    ```

4. Compila y ejecuta el programa:
    ```bash
    javac -d bin src/Ventana/Ventana.java
    java -cp bin Ventana.Ventana
    ```

## Uso del Programa

1. **Inicio**: Al ejecutar el programa, se abrirá una ventana donde puedes ingresar el nombre, edad y las cuatro notas del alumno.
2. **Cálculo del Promedio**: Haz clic en "Calcular Promedio" para calcular el promedio de las notas ingresadas.
3. **Evaluación del Alumno**: El sistema indicará si el alumno está aprobado, tiene derecho a recuperación o ha reprobado.
4. **Guardar Datos**: Para almacenar los datos en la base de datos, haz clic en "Guardar Datos".
5. **Limpiar Datos**: Haz clic en "Limpiar Datos" para vaciar todos los campos de entrada y realizar nuevos cálculos.

## Clases Principales

### Ventana
- Controla la interfaz gráfica y los eventos de los botones.
- Métodos clave:
  - `iniciarComponentes()`: Inicializa los componentes de la ventana.
  - `colocarBotones()`: Define la funcionalidad de los botones, como calcular el promedio y guardar los datos.

### Alumno
- Representa al alumno, permitiendo almacenar y recuperar su nombre y edad.

### Notas
- Calcula el promedio de cuatro notas.
- Evalúa si un alumno está aprobado o si tiene derecho a recuperación.
- Métodos clave:
  - `calcularPromedio()`: Retorna el promedio de las cuatro notas.
  - `evaluarAlumno()`: Evalúa si el alumno aprueba, puede recuperar, o reprueba.

### Database
- Conecta con una base de datos MySQL y guarda los datos del alumno.
- Métodos clave:
  - `guardarDatos()`: Inserta los datos del alumno en la base de datos.
