# Congruencial-Multiplicativo
Por: Ángel Ricardo Capa Medina
Curso: Sexto A
Congruencial Multiplicativo  

Un algoritmo que se utiliza para generar números pseudo aleatorios, es el algoritmo congruencia multiplicativo. Tiene como base al algoritmo congruencia lineal pero conlleva una operación menos.
La operación principal es la siguiente:  
Xi+1 =(aXio) % (m)  
Es decir, se toma una semilla a la que llamaremosX0. Se multiplica por un número a y al resultado de la multiplicación se divide por m recuperando solo el residuo o módulo de la división. Este valor será X1, y así sucesivamente.  

El primer congruencial multiplicativo que veremos a continuación sera cuando se trabaja en decimal  

Decimal  
Para ello se deben respetar los siguiente criterios para elegir bien los valores.  
1. El valor de la semilla puede ser cualquier entero impar no divisible para 5.  
![imagen](https://github.com/RicardoCapa/Congruencial-Multiplicativo/blob/master/img/1.png)  



2. El valor seleccionado de a debe ser obtenido de-acuerdo a la siguiente identidad, donde t es cualquier entero y p es cualquiera de los siguientes valores {3, 11, 13, 19, 21, 27, 29, 37, 53, 59, 61, 67, 69, 77, 83, 91}.  
 a = (200 * t) + p;  
![imagen](https://github.com/RicardoCapa/Congruencial-Multiplicativo/blob/master/img/2.png)  

3. El valor de m puede ser 10^d. Si m = 10 y d >= 5 el periodo del generador es 5 * 10^d-2.  
 

Luego de aplicar estos criterio tenemos nuestro programa implementado en java.  
![imagen](https://github.com/RicardoCapa/Congruencial-Multiplicativo/blob/master/img/3.png) 
Aqui podemos observar los resultados con los valores ingresados de.  
Xo = 13;  
t = 2;  
p = 3;  
m = 64;  
![imagen](https://github.com/RicardoCapa/Congruencial-Multiplicativo/blob/master/img/4.png)  
Binario  
En caso de trabajar con binario se debe elegir los siguientes criterios.  
1. El valor de la semilla puede ser cualquier entero impar.  
![imagen](https://github.com/RicardoCapa/Congruencial-Multiplicativo/blob/master/img/1.png)  
2. El valor seleccionado de a debe ser obtenido de-acuerdo a la siguiente expresión,  
![imagen](https://github.com/RicardoCapa/Congruencial-Multiplicativo/blob/master/img/5.png)  
3. El valor de m puede ser 2^d, d puede ser cualquier entero.  
![imagen](https://github.com/RicardoCapa/Congruencial-Multiplicativo/blob/master/img/6.png)  
Luego de aplicar estos criterio tenemos nuestro programa implementado en java.  
![imagen](https://github.com/RicardoCapa/Congruencial-Multiplicativo/blob/master/img/7.png)  
Aqui podemos observar los resultados con los valores ingresados de.  
Xo = 15  
t = 4  
m = 64  
![imagen](https://github.com/RicardoCapa/Congruencial-Multiplicativo/blob/master/img/8.png)  
