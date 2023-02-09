# patrones-de-diseno-ejemplificados

# Descripción del repositorio:

Repositorio dedicado a la aplicación de patrones de diseño ajenos a los vistos en clase. Con el fin de entender y argumentar su uso.

# Contexto:

Se tiene una barra de cereales en la cual se puede escojer ojuelas, cereal, yogurt y queso, los dueños quieren que los clientes puedan realizar pedidos por internet y
para esto necesitan una interfaz en la que puedan realizar pedidos pero inicialmente tienen muchos ifs y esto hace que sea mas dificil agregar mas sabores

![image](https://user-images.githubusercontent.com/40509764/217881739-27c61ce0-ef4f-44a4-bb02-e9d8c0c94cfd.png)

# Solución:

Según refactoring Guru;
"El patrón Bridge te permite dividir la clase monolítica en varias jerarquías de clase. Después, puedes cambiar las clases de cada jerarquía independientemente de las clases de las otras. Esta solución simplifica el mantenimiento del código y minimiza el riesgo de descomponer el código existente." (014-2023 Refactoring.Guru.)

Este patrón se ajusta al problema planteado por el dueño y facilita el crecimiento de la app.

  
  
