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


6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

**Branch (rama) en Git:**
Una rama es un puntero móvil que señala a un commit específico dentro del historial del proyecto, permitiendo desarrollar nuevas funcionalidades o realizar cambios sin afectar la rama principal.

**Gestión de punteros a commits:**
Git administra las ramas como referencias que avanzan automáticamente al crear nuevos commits. Cada rama apunta al commit más reciente de su línea de desarrollo, y cada commit enlaza con sus commits padres, formando una secuencia o grafo de historial.


7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

**Merge en Git:**
La fusión (merge) combina los cambios de una rama con otra, integrando sus historiales. Se realiza ejecutando git merge nombre_rama desde la rama que recibirá los cambios.

**Conflictos posibles:**
Los conflictos surgen cuando un mismo archivo ha sido modificado en ambas ramas de forma incompatible, impidiendo que Git realice la fusión automática.

**Resolución de conflictos:**
Se editan manualmente los archivos en conflicto para decidir qué cambios conservar, se añaden nuevamente al staging area con git add y se completa la fusión con git commit.


8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

**Área de staging (git add):**
El área de staging almacena temporalmente los cambios seleccionados para el próximo commit. El comando git add mueve modificaciones desde el working directory hacia esta área, permitiendo preparar de forma precisa qué se incluirá en la confirmación.

**Que pasa si omito:**
Si se omite git add, los cambios permanecerán en el working directory y no se incluirán en el siguiente commit, manteniéndose fuera del historial del proyecto hasta ser añadidos explícitamente.


9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

**Archivo .gitignore:**
Archivo de texto que especifica patrones de nombres para que Git ignore determinados archivos o carpetas, evitando que se incluyan en el seguimiento y en los commits.


Los elementos listados en .gitignore no se añaden al staging area ni se registran en el repositorio, lo que permite excluir archivos temporales, configuraciones locales o dependencias generadas automáticamente.


10. ¿Cuál es la diferencia entre un "commit amend" (-amend) y un nuevo commit?

- **git commit --amend:** Modifica el commit más reciente, permitiendo cambiar su mensaje, añadir nuevos cambios o reemplazar su contenido, sobrescribiendo su referencia en el historial.

- **Nuevo commit:** Crea un registro adicional en el historial sin alterar commits previos, manteniendo intacta la secuencia existente.


11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

El comando git stash guarda temporalmente los cambios del working directory y del staging area sin confirmarlos, dejando el directorio limpio para realizar otras tareas. Es útil al cambiar de rama o actualizar el proyecto sin perder modificaciones en curso.


12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?

- **Git reset:** Mueve la referencia de la rama a un commit anterior, pudiendo descartar cambios del staging area o del working directory.

- **Git revert:** Crea un nuevo commit que revierte los cambios introducidos por un commit específico, preservando el historial.

- **Git checkout:** Restaura archivos individuales o cambia de rama, descartando modificaciones no confirmadas en los archivos seleccionados.


13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

- **origin:** Nombre por defecto para el repositorio remoto principal.

- **upstream:** Nombre usado habitualmente para el repositorio original del que se hizo un fork.

**Comandos clave:**

  - git remote add nombre URL → Añade un remoto.

  - git fetch nombre → Descarga cambios sin fusionar.

  - git pull nombre rama → Descarga y fusiona cambios de un remoto.


14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

- **git log:** Lista los commits con información como autor, fecha y mensaje.

- **it diff:** Muestra las diferencias entre commits, ramas o el estado actual y el último commit.

- **git show:** Despliega los detalles completos de un commit específico, incluyendo cambios de archivos.