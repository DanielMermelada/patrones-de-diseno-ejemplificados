# patrones-de-diseno-ejemplificados

# Descripción del repositorio:

Repositorio dedicado a la aplicación de patrones de diseño ajenos a los vistos en clase. Con el fin de entender y argumentar su uso.

# Contexto:

Se tiene un parqueadero que necesita registrar el modelo del auto para su base de datos y que tipo de placa lleva el mismo para realizar descuentos en el saldo de parqueo. El dueño del parqueadero tiene un sistema actual que funciona por una clase modelo y placa en estructura monolítica que generan alta dependenscia y no son flexibles, lo que le esta molestando al meter un modelo Bmw a su sistema y una nueva placa comercial, el dueño quiere eliminar este problema y hacer que sus propiedades se puedan desarrollar por aparte además de aumentar su cohesión.

![image](https://user-images.githubusercontent.com/78450705/217807297-35bcdfd3-13ae-49b4-b268-6cca395dd955.png)

# Solución:

Según refactoring Guru;
"El patrón Bridge te permite dividir la clase monolítica en varias jerarquías de clase. Después, puedes cambiar las clases de cada jerarquía independientemente de las clases de las otras. Esta solución simplifica el mantenimiento del código y minimiza el riesgo de descomponer el código existente." (014-2023 Refactoring.Guru.)

Este patrón se ajusta al problema planteado por el dueño y presenta una solución a las varias dependencias que atormentan el programa.

Para esto se crea la clase Modelo como clase abstracta que tiene en sí una instancia de placa protegida, lo que le permite usarla y ser llamada por sus hijos (Modelos definidos como clases en entidades) de esta forma y comunicandose por una interfaz de placa que implementa el registro de la misma, se puede realizar un override en cada modelo (Facil de agregar) [hijos] y en cada tipo de placa [implementaciones] que luego es definido en el main para hacer un display de los carros del día, ayudando al dueño con su contabilidad.

![image](https://user-images.githubusercontent.com/78450705/217809658-126dc0f9-dd51-4923-9ae3-0086e36842cf.png)
