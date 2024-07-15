# Conversor de Monedas

<p>Este proyecto es una aplicación de consola en Java que permite realizar conversiones de moneda utilizando la API de ExchangeRate-API. El programa también mantiene un historial de las conversiones realizadas y ofrece un menú interactivo para seleccionar diferentes opciones de conversión. Esta aplicación es parte del Challenge 2 de la plataforma Alura.</p>

## Descripción del Proyecto
Este proyecto es una aplicación de conversión de monedas que permite a los usuarios convertir pesos colombianos (COP) a diferentes monedas extranjeras, incluyendo USD, EUR y JPY. La aplicación utiliza una API externa para obtener las tasas de cambio actuales y realiza los cálculos de conversión en tiempo real.

## Características

- Conversión de COP a USD
- Conversión de COP a EUR
- Conversión de COP a JPY
- Historial de conversiones realizadas

<h2>Funcionalidades</h2>
<li>
  Convertir de Peso Colombiano (COP) a otras monedas: USD, EUR, y JPY.

  <li>Mostrar un historial de todas las conversiones realizadas.</li>
<li>Menú interactivo para seleccionar la opción deseada. </li>
<h2>Requisitos</h2>
<li>Java 11 o superio</li>
<li>Biblioteca Gson para deserializar respuestas JSON de la API.</li>

## Estructura Del proyecto
 ```plaintext
.
├── models
│   ├── DetallesMoneda.java
│   └── Historial.java
├── principal
│   ├── Main.java
│   └── Principal.java
├── service
│   └── ConsumoApi.java
└── README.md

```

## Instalación

1. Clona el repositorio:
    ```sh
    git clone https://github.com/geralexcas/Conversor-de-monedas-allura-challenge2.git
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd Conversor-de-monedas-allura-challenge2
    ```
3. Ejecuta la aplicación:
    ```sh
    java -jar conversor-de-monedas.jar
    ```
    ## Uso

Al ejecutar la aplicación, se mostrará un menú en la consola donde puedes seleccionar la conversión deseada y la cantidad a convertir. La aplicación mostrará el resultado de la conversión y guardará la consulta en un historial.

## Ejemplo de Conversión

![Ejemplo de conversión]((https://github.com/geralexcas/challange2-alura-conversor-de-monedas/src/images
/img5.png)
 
<h2>Contribuciones</h2>
<p>Las contribuciones son bienvenidas. Por favor, crea un fork del repositorio y abre un pull request con tus cambios.</p>

<h2>Licencia</h2>
<p>Este proyecto está licenciado bajo la Licencia MIT. Ver el archivo LICENSE para más detalles.</p>
