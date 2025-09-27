package com.example.miprimerfragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miprimerfragment.databinding.ItemLibroBinding;

import java.util.List;

/**
 * Adaptador personalizado que conecta los datos de libros con el RecyclerView.
 * Extiende RecyclerView.Adapter y especifica que usará LibroViewHolder como ViewHolder.
 */
public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.LibroViewHolder> {

    // Lista de datos que se mostrará en el RecyclerView
    private final List<Libro> listaLibros;

    /**
     * Constructor: recibe la lista de libros que se van a mostrar
     *
     * @param listaLibros Lista con los datos a mostrar
     */
    public LibroAdapter(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * MÉTODO 1 de 3 OBLIGATORIOS: onCreateViewHolder
     * Se ejecuta cuando RecyclerView necesita crear una nueva vista (ViewHolder).
     * Solo se llama cuando necesita crear nuevos ViewHolders, no para cada elemento.
     *
     * @param parent   El ViewGroup padre (normalmente el RecyclerView)
     * @param viewType Tipo de vista (útil cuando tienes diferentes layouts)
     * @return Un nuevo ViewHolder con la vista inflada
     */
    @NonNull
    @Override
    public LibroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemLibroBinding binding = ItemLibroBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new LibroViewHolder(binding);
    }

    /**
     * MÉTODO 2 de 3 OBLIGATORIOS: onBindViewHolder
     * Se ejecuta cada vez que necesita mostrar datos en una vista existente.
     * Es donde "llenamos" la vista con los datos específicos de cada libro.
     *
     * @param holder   El ViewHolder que contiene las vistas a llenar
     * @param position La posición del elemento en la lista (índice)
     */
    @Override
    public void onBindViewHolder(@NonNull LibroViewHolder holder, int position) {
        // Obtener el libro específico de esta posición
        Libro libro = listaLibros.get(position);
        holder.bind(libro);
    }

    /**
     * MÉTODO 3 de 3 OBLIGATORIOS: getItemCount
     * Dice al RecyclerView cuántos elementos hay en total para mostrar.
     * RecyclerView usa esto para saber cuándo dejar de hacer scroll.
     *
     * @return El número total de elementos en la lista
     */
    @Override
    public int getItemCount() {
        return listaLibros.size();
    }

    /**
     * ViewHolder interno: una clase que "mantiene" las referencias a las vistas
     * del layout de cada item. Esto evita hacer findViewById repetidamente,
     * mejorando significativamente el rendimiento.
     */
    public static class LibroViewHolder extends RecyclerView.ViewHolder {
        private final ItemLibroBinding binding;

        /*
                // Referencias a las vistas del layout item_libro.xml
                ImageView ivLibro;
                TextView tvNombre, tvAutor, tvIdioma, tvDescripcion,
                        tvPaginas, tvEdicion, tvPrecio, tvIsbn;
                Button btnDetalles;

                /**
                 * Constructor del ViewHolder: aquí es donde se hace findViewById
                 * una sola vez por cada ViewHolder creado.
                 *
                 * @param itemView La vista completa del item (el LinearLayout completo)
                 */
        public LibroViewHolder(@NonNull ItemLibroBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Libro libro) {
            binding.tvTitulo.setText("Título: " + libro.getNombre());
            binding.tvAutor.setText("Autor: " + libro.getAutor());
            binding.tvIdioma.setText("Idioma: " + libro.getIdioma());
            binding.tvDescripcion.setText("Descripción: " + libro.getDescripcion());
            binding.tvPaginas.setText(libro.getPaginas() + " páginas");
            binding.tvEdicion.setText("Edición: " + libro.getEdicion());
            binding.tvPrecio.setText("Precio: $" + libro.getPrecio() + "-");
            binding.tvIsbn.setText("ISBN: " + libro.getIsbn());

            // Cargar imagen
            if (libro.getImagen() != null && !libro.getImagen().isEmpty()) {
                int resourceId = itemView.getContext().getResources()
                        .getIdentifier(libro.getImagen(), "drawable",
                                itemView.getContext().getPackageName());

                if (resourceId != 0) {
                    binding.ivLibro.setImageResource(resourceId);
                } else {
                    binding.ivLibro.setImageResource(R.drawable.libro_portada_default);
                }
            } else {
                binding.ivLibro.setImageResource(R.drawable.libro_portada_default);
            }

            // Configurar el botón para abrir el detalle
            binding.btnDetalles.setOnClickListener(v -> {
                Intent intent = new Intent(itemView.getContext(), DetalleActivity.class);

                // para enviarlo como objeto Libro, debe implementar Serializable
                intent.putExtra("libroDetallado", libro);

                itemView.getContext().startActivity(intent);
            });
        }
    }
}