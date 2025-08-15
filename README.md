# TALLER DE NIVELACION PROGRAMACION II

## PARTE TEORICA
### GIT


1. ¿Que es un repositorio en git y como se diferencia de un proyecto "normal"?.

Lo que diferencia al repositorio en Git de un proyecto normal es que puedes llevar mas control de todo lo que hagas, git recuerda y vigila los cambios hechos dentro del proyecto, quien los hizo y cuando se hicieron, Mientras que un proyecto normal no incluye estas herramientas


2. ¿ Cuales son las 3 areas principales de Git ( Working directory, stating area/index y repository) y que papel cumple cada una?.

**Working Directory:** Carpeta de trabajo con los archivos y cambios aún no preparados para el historial.  

**Stating area/index:** Zona intermedia que almacena los cambios añadidos con git add antes de ser confirmados.  

**Repository:** Base de datos interna de Git ubicada en .git/ que guarda de forma permanente los commits y el historial del proyecto.


3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).

Representación interna de cambios en Git:

**Blob (Binary Large Object):** Objeto que almacena el contenido de un archivo de forma comprimida, sin información sobre su nombre ni ubicación.

**Tree:** Objeto que representa la estructura de directorios, asociando nombres de archivos y carpetas con sus respectivos objetos blob o tree.

**Commit:** Objeto que registra un punto específico en la historia del proyecto, enlazando a un objeto tree y guardando metadatos como autor, fecha y mensaje.

**Tag:** Objeto que marca un commit específico con un nombre o etiqueta legible, utilizado generalmente para versiones o hitos importantes.


4. ¿Cómo se crea un commit y qué información almacena un objeto commit?.

**Creación de un commit:**
Un commit se crea añadiendo primero los cambios al staging area con git add y luego ejecutando git commit -m "mensaje descriptivo".

**Información almacenada en un commit:**

- Referencia al objeto tree que representa el estado de los archivos en ese momento.

- Autor y fecha de creación.

- Mensaje descriptivo del cambio.

- Referencias a commits anteriores (padres), formando el historial del proyecto.


5. ¿Cuál es la diferencia entre git pull y git fetch?.

**Git fetch:** Descarga los cambios del repositorio remoto y los almacena en el repositorio local, sin fusionarlos automáticamente con la rama actual.

**Git pull:** Descarga los cambios del repositorio remoto y los fusiona automáticamente con la rama actual, combinando en un solo paso la acción de git fetch y git merge.


