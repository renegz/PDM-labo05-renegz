1. Las ventajas principales de LiveData es que evita memory leaks y que al trabajar por medio de suscripciones mantiene los datos actualizados

2. El patron de diseño que utiliza LiveData es Observer

3. Para implementar DataBinding, en los gradle files del modulo de la app se deben de agregar las siguientes lineas de codigo dentro de android:
dataBinding{
	enabled true
} 

4. La ventaja principal de DataBinding es que se escribe menos codigo por lo que es mas sencillo enlazar los elementos de la ui directamente con la aplicacion, y que se pueden inyectar variables y funciones anonimas.
