# Logic_developmente_Java

# 📚 Lógica de Programación en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

Un plan estructurado de **10 pasos** diseñado para afianzar los fundamentos de la lógica de programación y la resolución sistemática de problemas mediante la implementación de ejemplos en el mundo real y ejercicios prácticos en **Java**.

---

## 📑 Tabla de Contenidos

- [🎯 Objetivos del Proyecto](#-objetivos-del-proyecto)
- [🗺️ Hoja de Ruta (10 Pasos)](#️-hoja-de-ruta-10-pasos)
- [📁 Estructura del Proyecto](#-estructura-del-proyecto)
- [🛠️️ Requisitos e Instalación](#️-requisitos-e-instalación)
- [🚀 Ejecución del Código](#-ejecución-del-código)

---

## 🎯 Objetivos del Proyecto

* **Fomentar el pensamiento estructurado:** Pasar del planteamiento de un problema informal a una solución algorítmica lógica.
* **Dominar la sintaxis básica de Java:** Aplicar tipos de datos, estructuras de control, funciones y arreglos.
* **Aplicar lógica en casos reales:** Relacionar conceptos teóricos con situaciones cotidianas y proyectos funcionales.

---

## 🗺️ Hoja de Ruta (10 Pasos)

| Paso | Concepto | Ejemplo del Mundo Real | Actividad Práctica |
| :---: | :--- | :--- | :--- |
| **01** | **Introducción a la Lógica** | Receta de cocina / Armar un mueble | Instrucciones paso a paso para hacer un sándwich |
| **02** | **Algoritmos y Pseudocódigo** | Calcular gastos totales de compras | Pseudocódigo/Algoritmo para promediar 5 números |
| **03** | **Estructuras de Control** | Verificar elegibilidad de voto | Bucle de números 1–20 destacando los números pares |
| **04** | **Operadores Lógicos** | Sistema de control de acceso | Verificador de inicio de sesión (usuario y contraseña) |
| **05** | **Tipos de Datos y Variables** | Registrar temperaturas / Detalles de usuario | Variables personales e impresión de perfil formateado |
| **06** | **Operadores Aritméticos y Comparación** | Calcular descuentos en carritos | Programa para calcular y mostrar el área de un rectángulo |
| **07** | **Funciones y Métodos** | Calculadora de costo de envío | Función reutilizable para calcular el IMC |
| **08** | **Arreglos y Estructuras Simples** | Gestión de listas de tareas / Colas de atención | Programa basado en arreglos para una lista de compras |
| **09** | **Algoritmos y Búsquedas** | Buscar un contacto en la agenda | Implementación del algoritmo de ordenamiento por burbuja |
| **10** | **Mini-Proyectos Prácticos** | Sistema de notas, trivias, inventario | Desarrollo e integración funcional del proyecto práctico |

---

## 📁 Estructura del Proyecto

El código está organizado de manera modular por paquetes dentro del directorio de código fuente:

```text
Logic-Development-Java/
└── src/
    ├── paso01_introduction/
    │   └── Sandwich.java
    ├── paso02_PseudoCodigo/
    │   └── PromedioCincoNumeros.java
    ├── paso03_Estructuras_de_Control/
    │   └── NumerosPares.java
    ├── paso04_logic_operators/
    │   └── VerificadorLogin.java
    ├── paso05_Tipos_de_Datos/
    │   └── PerfilUsuario.java
    ├── paso06_aritmetics_operators/
    │   └── AreaRectangulo.java
    ├── paso07_funtions/
    │   └── CalculadoraIMC.java
    ├── paso08_Arrays/
    │   └── ListaCompras.java
    ├── paso09_Algoritms/
    │   └── OrdenamientoBurbuja.java
    └── paso10_mini_proyect/
        └── paso10_miniproyectos.java
```

---

## 🛠️ Requisitos e Instalación

### Prerrequisitos
* **Java Development Kit (JDK):** Versión 17 o superior.
* **IDE:** IntelliJ IDEA (Recomendado), Eclipse, VS Code o cualquier editor de texto.

### Clonar el Repositorio
```bash
git clone https://github.com/tu-usuario/Logic-Development-Java.git
cd Logic-Development-Java
```

---

## 🚀 Ejecución del Código

Puedes ejecutar cualquiera de las actividades prácticas compilando e iterando desde la terminal o utilizando la configuración del IDE.

### Ejemplo en Terminal:
```bash
# Compilar un archivo específico
javac src/paso01_introduction/Sandwich.java

# Ejecutar la clase compilada
java -cp src paso01_introduction.Sandwich
```