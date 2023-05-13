1. La principal utilidad de recycler view es que no carga directamente toda la informacion que se tiene, sino que unos cuantos elementos con informacion por lo que se optimiza el uso de memoria de la aplicacion.

2. El list item tiene como funcion definir el diseño grafico de cada elemento en la lista que muestra el recycler view.

El view holder es el componente que se utiliza para almacenar las referencias a las vistas de cada elemento de la lista(item list), para que el recycler view pueda reutilizar vistas de un elemento anterior para mostrar uno nuevo.

En el componente adapter se encarga de bindear los datos que provengan de una base de datos, API o dummy data con las vistas que se muestran en la pantalla.
