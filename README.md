## Escuela Colombiana de Ingeniería Julio Garavito

## Sensores, transformación hacia una movilidad inteligente ![smartmovility](https://img.icons8.com/external-tulpahn-outline-color-tulpahn/50/000000/external-smart-city-augmented-reality-tulpahn-outline-color-tulpahn.png)
El aumento del número de vehículos que transitan en las calles y la necesidad de un cambio que permita que una ciudad sea sostenible, ha generado un sin número de retos para
los gobiernos de las grandes ciudades.

Poder controlar y disciplinar el volumen de vehículos que circulan por las zonas urbanas, es el objetivo. Pensar en soluciones orientadas a mejorar la calidad de vida urbana es posible a través de sistemas de semaforización inteligente que permitan sincronizar el movimiento de la propia ciudad y gestionar el tiempo de espera en cada color, para así evitar el tráfico, dar mayor fluidez a la movilidad, mejorar el ambiente y la calidad del aire para los ciudadanos.

### Equipo de trabajo ![yarit](https://img.icons8.com/emoji/20/000000/man-curly-hair-medium-dark-skin-tone.png) ![angelica](https://img.icons8.com/emoji/20/000000/girl-light-skin-tone.png) ![cesar](https://img.icons8.com/emoji/20/000000/boy-light-skin-tone.png) ![laura](https://img.icons8.com/emoji/20/000000/woman-light-skin-tone.png)

> - Angélica Alfaro
> - Laura Izquierdo
> - César Ortiz
> - Yarit Villalobos

## Propuesta de solución ![smartsolve](https://img.icons8.com/color/48/000000/idea-sharing.png)
Se propone implementar un sistema avanzado de gestión del tráfico utilizando el internet de las cosas (IoT). Las funcionalidades del sistema incluyen el control del sistema de semaforización de una ciudad, y el monitoreo de la red de semáforos en un puesto de control centralizado. Esto por medio del intercambio de datos entre cámaras de video y servidores en la nube para tener un flujo en tiempo real del movimiento del tráfico en la ciudad; y en soporte a su densidad, para eficientemente brindar el servicio con estándares altos de calidad. Finalmente a través de sensores de proximidad en las calles para interacción con los vehículos en el radio de cada semáforo, recibir la información.

A continuación se expone la arquitectura propuesta,

<!DOCTYPE html>
<html>
    <head></head>
    <body>
        <img src="https://github.com/Smart-Traffic-Ligths/DataSimulator/blob/main/img/arquitectura_gen.png" alt="general" width="800"/>
    </body>
</html>

Esta propuesta está soportada por las soluciones encontradas, la investigación en artículos científicos afines a la semaforización y a las ciudades inteligentes.

## Diseño Prototipo ![prototipo](https://img.icons8.com/external-justicon-lineal-color-justicon/40/000000/external-traffic-lights-map-and-location-justicon-lineal-color-justicon.png)

<!DOCTYPE html>
<html>
    <head></head>
    <body>
        <img src="https://github.com/Smart-Traffic-Ligths/DataSimulator/blob/main/img/diagrama_prototipo.png" alt="prototipo" width="800"/>
    </body>
</html>

El prototipo propuesto tiene como objetivo evidenciar la gestión de la conexión y almacenamiento de metadata proveniente de la red de semáforos inteligentes, sus controladores y magnetómetros. Se simula los controladores y sensores de los semáforos, seguidamente se conectan a la plataforma IoT y almacena por 24 hrs; lo que permite gestionarla en tiempo real posteriormente para la toma de decisiones.
