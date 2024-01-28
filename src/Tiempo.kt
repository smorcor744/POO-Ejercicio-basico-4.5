/**Crear una clase Tiempo, que refleja las horas de un día, es decír, desde 00:00:00 hasta 23:59:59, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos, sólo hora y minuto o sólo la hora (si no se indica, el valor de minuto o segundo será 0).

Crear el método toString() para mostrar el tiempo en formato: XXh XXm XXs.

En el programa principal, debe solicitar por teclado hora, minuto y segundo de forma que se puedan omitir los segundos o los minutos (y segundos, claro) e instancie la clase Tiempo mostrando su valor.

A tener en cuenta:

Si segundos o minutos es mayor que 60, se tendrá que hacer las operaciones necesarios para incrementar la magnitud superior por el resultado del modulo de 60, quedándose en segundos o minutos con el resto. Es decir 65 segundos equivale a : 1 minuto y 5 segundos.
Hora siempre tendrá que ser menor que 24, si no, lanzará una excepción.
Añadir un nuevo método incrementar(t:Tiempo):Boolean, que incrementa en t, el total del tiempo que almacena el objeto que recibe el mensaje, devolviendo false si al incrementar se superan las 23:59:59, en cuyo caso no cambiaría nada del objeto que recibe el mensaje. En el programa principal, debe solicitar por teclado hora, minuto y segundo del objeto t. Mostrará por pantalla el resultado obtenido al incrementar en t el tiempo, mostrando un mensaje de error si devuelve false.

Añadir un nuevo método decrementar(t:Tiempo):Boolean, que decrementa en t, el total del tiempo que almacena el objeto que recibe el mensaje, devolviendo false si al decrementar se superan las 00:00:00, en cuyo caso no cambiaría nada del objeto que recibe el mensaje. En el programa principal, debe solicitar por teclado hora, minuto y segundo del objeto t. Mostrará por pantalla el resultado obtenido al decrementar en t el tiempo, mostrando un mensaje de error si devuelve false.

Añadir un nuevo método comparar(t:Tiempo):Int, que compara el tiempo que almacena el objeto que recibe el mensaje con el tiempo que almacena t, devolviendo -1 si el tiempo del objeto que recibe el mensaje es menor que t, 0 si son iguales y 1 si es mayor. En el programa principal, debe solicitar por teclado hora, minuto y segundo del objeto t. Mostrará por pantalla el resultado obtenido al comparar el tiempo del objeto que recibe el mensaje con el tiempo de t.

Añadir un nuevo método copiar():Tiempo, que devuelve un objeto Tiempo con el mismo tiempo que almacena el objeto que recibe el mensaje. En el programa principal, debe solicitar por teclado hora, minuto y segundo del objeto t. Mostrará por pantalla el resultado obtenido al copiar el tiempo del objeto que recibe el mensaje en un nuevo objeto Tiempo.

Añadir un nuevo método copiar(t:Tiempo):Tiempo, que copia el tiempo que almacena t en el objeto que recibe el mensaje. En el programa principal, debe solicitar por teclado hora, minuto y segundo del objeto t. Mostrará por pantalla el resultado obtenido al copiar el tiempo de t en el objeto que recibe el mensaje.

Añadir un nuevo método sumar(t:Tiempo):Tiempo?, que suma el tiempo que almacena el objeto que recibe el mensaje con el tiempo que almacena t, devolviendo un nuevo objeto Tiempo con el resultado o null si el resultado es mayor que 23:59:59. En el programa principal, debe solicitar por teclado hora, minuto y segundo del objeto t. Mostrará por pantalla el resultado obtenido al sumar el tiempo del objeto que recibe el mensaje con el tiempo de t.

Añadir un nuevo método restar(t:Tiempo):Tiempo?, que resta el tiempo que almacena el objeto que recibe el mensaje con el tiempo que almacena t, devolviendo un nuevo objeto Tiempo con el resultado o null si el resultado es menor que 00:00:00. En el programa principal, debe solicitar por teclado hora, minuto y segundo del objeto t. Mostrará por pantalla el resultado obtenido al restar el tiempo del objeto que recibe el mensaje con el tiempo de t.

Añadir un nuevo método esMayorQue(t:Tiempo):Boolean, que devuelve true si el tiempo que almacena el objeto que recibe el mensaje es mayor que el tiempo que almacena t. En el programa principal, debe solicitar por teclado hora, minuto y segundo del objeto t. Mostrará por pantalla el resultado obtenido al comparar si el tiempo del objeto que recibe el mensaje es mayor que el tiempo de t.

Añadir un nuevo método esMenorQue(t:Tiempo):Boolean, que devuelve true si el tiempo que almacena el objeto que recibe el mensaje es menor que el tiempo que almacena t. En el programa principal, debe solicitar por teclado hora, minuto y segundo del objeto t. Mostrará por pantalla el resultado obtenido al comparar si el tiempo del objeto que recibe el mensaje es menor que el tiempo de t.*/
class Tiempo( hora: Int,  minuto: Int= 0,  segundo: Int = 0) {
    var hora : Int = 0
        set(value) {
            require(value !in 0..23) {"La hora debe estar entre 0 y 23"}
        }
    var minuto : Int = 0
        set(value) {
            require(value !in 0..59) {"El minuto debe estar entre 0 y 59"}
        }
    var segundo : Int = 0
        set(value) {
            require(value !in 0..59) {"El segundo debe estar entre 0 y 59"}
        }

    override fun toString() = "${hora}h ${minuto}m ${segundo}s"
}