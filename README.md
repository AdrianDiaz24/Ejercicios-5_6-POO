# Ejercicio 6: Sistema de articulos

- Crear una clase Articulo con un nombre y un precio, que ambos se puedan modificar. También tendrá un id que se generará de forma automática mediante un contador (totalArticulos) y una función generarId(). Este id no podrá modificarse ni obtenerse fuera de Articulo.

- Crear un método promocionNavidad() que reciba el porcentaje de rebaja y lo aplique al precio.

- Sobreescribir el método toString() para que retorne el "{nombre} - {precio con dos decilames}€ (ID: {id})".

- Crear una clase que herede de Articulo y se llame Ordenador. Debe agregar a su constructor primario el tipo, que será de TipoOrdenador => (BASICO, OFIMATICA, TODOTERRENO, GAMING) y por defecto será BASICO.

- Sobreescribe el método promocionNavidad() para que solo aplique la promoción si el precio es superior a 500 euros.

- En el main crea dos artículos con precios 25 y 45 euros. También crea dos ordenadores, el primero GAMING de precio 1299.99 y el segundo un ordenador básico de 399.99 euros.

- Crear una variable para generar una lista con ellos y recorrerla aplicándoles la promoción e imprimiendo su contenido.

- Puedes declarar la variable de la siguiente forma:

// Lista de todos los artículos
val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)
## Responde a las siguientes preguntas:

- ¿De qué tipo genera en la lista por defecto el compilador?
  - De tipo Articulo
- ¿Qué está ocurriendo en este ejemplo con respecto a lo que hemos visto del polimorfismo de la herencia?
  - Que aunque sean clases diferentes al estar heredando una de Articulo se permite juntar en una misma lista sin tener que usar el Any que permitiria otro tipo de valores ademas de las clases padre e hijas
- ¿Qué pasaría si creáramos la lista con listOf<Ordenador>? ¿Y si la hiciéramos con listOf<Any>?
  - Que solo permitiria añadir los ordenadores
  - Que ademas de añadir ambas clases podria añadir String, Int, etc..., lo cual te obligaria a hacer un smart cast si o si, si quiero acceder a alguna de sus funciones, lo cual de la otra forma solo haria falta si se quisiera acceder a una funcion de ordenador que no comparta con Articulo  
