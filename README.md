## 📚 DeLibros
#### Aplicación Android que permite visualizar una lista de libros, navegar entre diferentes secciones mediante un **Bottom Navigation** y explorar un **catálogo en formato galería**.  
#### El proyecto utiliza **Fragments**, **RecyclerView** y **Adapters** para mostrar información de manera dinámica.
---
### ⚙️ Funcionamiento

- **Inicio**: se listan los libros disponibles con portada, título, descripción y botones de acción:
  - Ver detalle del libro
  - Agregar al carrito
  - 
- **Galería**: muestra los libros en tarjetas simplificadas con su imagen, título y fecha de caducidad (de ejemplo).
- **Carrito**: sección donde se gestionan los libros seleccionados.
---
### 🚀 Futuras mejoras
- **Favoritos**: seccion donde se listaran favoritos en futuro desarrollo, agregar funcionalidad
- **Buscar**: seccion con menu para cliente, agregar funcionalidad
---
### 🛠️ Decisiones de desarrollo

-  Arquitectura: se usaron Fragments para separar las pantallas y facilitar la navegación sin recargar toda la actividad.
- RecyclerView + Adapter: para renderizar listas dinámicas y optimizadas de libros.
- Modularidad: se creó un LibroAdapter para la sección de inicio y un GaleriaAdapter específico para la galería, manteniendo responsabilidades claras.
- Diseño responsivo: uso de CardView y LinearLayout para mostrar la información en distintos dispositivos.
- Simplicidad: algunos datos (como la fecha de caducidad en galería) son estáticos a modo de ejemplo, dejando espacio para futura integración con una API o base de datos.
### ▶️ Cómo ejecutar el proyecto

1. Clona este repositorio:
   ```bash
   git clone https://github.com/eurbano5090/DeLibros.git

