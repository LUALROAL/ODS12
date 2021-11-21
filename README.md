# BioCamellus Api Rest

Proyecto API Rest que permite xxxxxxxxxxxxxxxxxxxxx

## Consideraciones Técnicas

1. Java11
2. Mysql
3. Spring-boot  
   * JPA
   * Patron Repository
   * MVC
   
4. Ionic



## Base de Datos Mysql

Es importante tener en cuenta que se debe tener una base de datos Mysql instalada localmente y configurada
de la siguiente manera:

1. debe correr en localhost 
2. debe correr por el puerto por defecto de mysql 3306
3. debe tener usuario y contraseña con permisos de lectura y escritura (se recomienda dejar el usuario root que tiene todos los privilegios solicitados)
4. crear una base de datos llamada DB_Tienda



## Preparacion de la base de datos en el proyecto


En este apartado vamos a enlazar la base de datos con nuestro proyecto , para esto requerimos tener presente los siguietes datos:

* servidor: localhost
* puerto: 3306
* Base de datos: BiocamelusDB
* UsuarioMysql : root
* ContraseñaMysql: <la que definio>

ahora si procedamos a realizar el ajuste en el archivo de configuracion reemplazado por los datos apropiados para la conexion.


1. en el proyecto ubiquese en la ruta  tienda\src\main\resources y abra el archivo application.properties
2. modifique la cadena de conexion cambiando los datos necesarios para la comunicacion, como son:



~~~
  spring.datasource.url=jdbc:mysql://localhost:3306/BiocamelusDB
  spring.datasource.username=root
  spring.datasource.password=
~~~

## correr el proyecto en desarrollo

Antes de correr el proyecto verifique que la base de datos este conectada y el proyecto este apuntando correctamente con la cadena de conexion.

1. verifique que tenga java11 instalado
1. ubiquese en la raiz del proyecto
2. abra una terminal de acuerdo a su sistema operativo y corra el siguiente comando

linux o Mac

~~~
  ./mvnw spring-boot:run
~~~


Windows

~~~
  mvnw spring-boot:run
~~~




### visualizar el proyecto

1. abra un navegador y coloque la ruta http://localhost:8082


### crear .war

~~~
  ./mvnw package -Dmaven.test.skip
~~~

