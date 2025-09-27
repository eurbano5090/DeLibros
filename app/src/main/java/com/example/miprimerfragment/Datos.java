package com.example.miprimerfragment;

import java.util.ArrayList;

public class Datos {

    public static ArrayList<Libro> cargarLibros(){
        ArrayList<Libro> libros = new ArrayList<>();
        
        libros.add(new Libro(
                "La Divina Comedia",
                "Dante Alighieri",
                "Alianza Editorial",
                "Español",
                "Cuenta el maravilloso peregrinaje del autor por el Infierno, el Purgatorio y el Paraíso, guiado por Virgilio y con la intermediación de una bella dama florentina, Beatriz, que se convierte así en mito de la poesía amorosa. Esta obra reúne la cosmovisión greco-romana y la cultura cristiana, exponiendo con elegancia las verdades de fe y recapitulando la historia del mundo.",
                432,
                1,
                18500,
                "9789585285354"
        ));

        libros.add(new Libro(
                "Don Quijote de la Mancha",
                "Miguel de Cervantes",
                "Cátedra",
                "Español",
                "Considerada la primera novela moderna y una de las cumbres de la literatura universal, narra las andanzas de un hidalgo que, enloquecido por la lectura de libros de caballerías, decide convertirse en caballero andante para defender a los débiles y enmendar los agravios del mundo.",
                1072,
                1,
                24900,
                "9788437604859"
        ));

        libros.add(new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez",
                "Sudamericana",
                "Español",
                "La historia mágica y trágica de la familia Buendía en el pueblo de Macondo, una obra maestra del realismo mágico que explora el tiempo, la soledad, el amor y el destino de América Latina.",
                432,
                1,
                16900,
                "9789588346035"
        ));

        libros.add(new Libro(
                "1984",
                "George Orwell",
                "Debolsillo",
                "Español",
                "Una distopía que retrata un futuro totalitario donde el Gran Hermano lo vigila todo. Explora temas como la vigilancia masiva, la manipulación del lenguaje y la pérdida de la libertad individual.",
                328,
                1,
                12500,
                "9788499890733"
        ));

        libros.add(new Libro(
                "Fahrenheit 451",
                "Ray Bradbury",
                "Minotauro",
                "Español",
                "En un futuro donde los libros están prohibidos y los bomberos queman cualquier ejemplar encontrado, un hombre comienza a cuestionar el sistema y descubre el poder transformador de la lectura.",
                256,
                1,
                11900,
                "9788445077130"
        ));

        libros.add(new Libro(
                "El Principito",
                "Antoine de Saint-Exupéry",
                "Salamandra",
                "Español",
                "Una fábula poética sobre la amistad, el amor y la pérdida, narrada por un piloto perdido en el desierto que conoce a un pequeño príncipe venido de otro planeta.",
                96,
                1,
                9500,
                "9788498385740"
        ));

        libros.add(new Libro(
                "Orgullo y prejuicio",
                "Jane Austen",
                "Alba Editorial",
                "Español",
                "Una sátira social y romántica ambientada en la Inglaterra rural del siglo XIX, que sigue a Elizabeth Bennet en su relación con el orgulloso señor Darcy.",
                416,
                1,
                14900,
                "9788490651017"
        ));

        libros.add(new Libro(
                "Matar un ruiseñor",
                "Harper Lee",
                "HarperCollins",
                "Español",
                "A través de los ojos de una niña, se narra la historia de un abogado que defiende a un hombre negro acusado injustamente en el sur racista de Estados Unidos durante los años 30.",
                384,
                1,
                15500,
                "9788491390307"
        ));

        libros.add(new Libro(
                "El Señor de los Anillos",
                "J.R.R. Tolkien",
                "Minotauro",
                "Español",
                "Una épica fantasía que sigue la lucha del hobbit Frodo para destruir el Anillo Único y derrotar al oscuro señor Sauron, en un mundo rico en mitología y lenguas inventadas.",
                1216,
                1,
                34900,
                "9788445001364"
        ));

        libros.add(new Libro(
                "Crónicas de Narnia",
                "C.S. Lewis",
                "RBA",
                "Español",
                "Siete hermanos entran en un armario mágico que los transporta al mundo de Narnia, donde viven aventuras épicas junto a leones parlantes, brujas y batallas entre el bien y el mal.",
                768,
                1,
                22900,
                "9788490333487"
        ));

        libros.add(new Libro(
                "Frankenstein",
                "Mary Shelley",
                "Alianza Editorial",
                "Español",
                "La historia del científico Victor Frankenstein y su criatura, una reflexión profunda sobre la ambición humana, la responsabilidad científica y la soledad.",
                288,
                1,
                11500,
                "9788420672530"
        ));

        libros.add(new Libro(
                "Drácula",
                "Bram Stoker",
                "Valdemar",
                "Español",
                "Epistolario gótico que narra la llegada del conde Drácula a Inglaterra y la lucha de un grupo de personas por detener su reinado de terror vampírico.",
                512,
                1,
                13900,
                "9788477021300"
        ));

        libros.add(new Libro(
                "El retrato de Dorian Gray",
                "Oscar Wilde",
                "Cátedra",
                "Español",
                "Un joven cuya belleza permanece intacta mientras su retrato envejece y refleja sus pecados, explorando temas como la estética, la moral y la decadencia.",
                256,
                1,
                12900,
                "9788437604965"
        ));

        libros.add(new Libro(
                "Los miserables",
                "Victor Hugo",
                "Debolsillo",
                "Español",
                "La épica historia de Jean Valjean, un exconvicto que busca redención en la Francia del siglo XIX, entrelazada con temas de justicia, amor y revolución.",
                1488,
                1,
                28900,
                "9788499890740"
        ));

        libros.add(new Libro(
                "La Odisea",
                "Homero",
                "Alianza Editorial",
                "Español",
                "El viaje de regreso a casa del héroe griego Odiseo tras la guerra de Troya, lleno de peligros, dioses, monstruos y lecciones sobre la astucia humana.",
                496,
                1,
                14500,
                "9788420645114"
        ));

        libros.add(new Libro(
                "Hamlet",
                "William Shakespeare",
                "Alba Editorial",
                "Español",
                "Tragedia sobre un príncipe danés que lucha con la duda, la venganza y la locura tras la muerte de su padre y el matrimonio de su madre con su tío.",
                224,
                1,
                10900,
                "9788490651024"
        ));

        libros.add(new Libro(
                "El nombre de la rosa",
                "Umberto Eco",
                "Lumen",
                "Español",
                "Un monje franciscano investiga una serie de misteriosos asesinatos en una abadía medieval, combinando teología, filosofía y una trama detectivesca.",
                608,
                1,
                19900,
                "9788426412016"
        ));

        libros.add(new Libro(
                "Rayuela",
                "Julio Cortázar",
                "Sudamericana",
                "Español",
                "Novela experimental que puede leerse de forma lineal o saltando capítulos según una 'rayuela', explorando el existencialismo, el amor y la búsqueda de sentido.",
                632,
                1,
                21500,
                "9789500703186"
        ));

        libros.add(new Libro(
                "Pedro Páramo",
                "Juan Rulfo",
                "Fondo de Cultura Económica",
                "Español",
                "Breve pero intensa novela que narra el viaje de Juan Preciado al pueblo de Comala, donde los muertos hablan y el tiempo se desdibuja en un paisaje de soledad y memoria.",
                128,
                1,
                8900,
                "9789681600723"
        ));

        libros.add(new Libro(
                "El amor en los tiempos del cólera",
                "Gabriel García Márquez",
                "Sudamericana",
                "Español",
                "Una historia de amor que dura más de medio siglo, retratando la pasión, la espera y la fidelidad en un Caribe mágico y realista.",
                448,
                1,
                17500,
                "9789588346042"
        ));

        return libros;
    }
}
