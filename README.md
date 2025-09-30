## 📚 DeLibros
#### Aplicación Android que permite visualizar una lista de libros, navegar entre diferentes secciones mediante un **Bottom Navigation** y explorar un **catálogo en formato galería**.  
#### El proyecto utiliza **Fragments**, **RecyclerView** y **Adapters** para mostrar información de manera dinámica.
---
### ⚙️ Funcionamiento

- **Inicio**: se listan los libros disponibles con portada, título, descripción y botones de acción:
  - Ver detalle del libro
  - Agregar al carrito
  - <img width="108" height="195" alt="image" src="https://github.com/user-attachments/assets/f43a6dec-ded7-4305-aca8-a8230d9801ca" /> <img width="108" height="195" alt="image" src="https://github.com/user-attachments/assets/517e5dc2-7dbd-46aa-8a5c-dc1502093b4c" />  <img width="108" height="195" alt="image" src="https://github.com/user-attachments/assets/ba84a16f-6677-4189-8888-cb168fa7cd50" /> <img width="108" height="195" alt="image" src="https://github.com/user-attachments/assets/f8762590-8671-4941-a16f-c1f09185b542" /><img width="108" height="195" alt="image" src="https://github.com/user-attachments/assets/46742a4d-c530-4f0c-8a44-26774cff4e05" /> <img width="108" height="195" alt="image" src="https://github.com/user-attachments/assets/a763bdcc-d0e3-460e-ac64-f0379a22f173" />



- **Galería**: muestra los libros en tarjetas simplificadas con su imagen, título y fecha de salida.
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

