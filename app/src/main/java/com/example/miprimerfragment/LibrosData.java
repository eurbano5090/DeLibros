package com.example.miprimerfragment;
import java.util.ArrayList;
import java.util.List;

public class LibrosData {
    private static LibrosData instance;

    private List<Libro> libros;

    private LibrosData() {
        libros = crearLibrosDePrueba();
    }

    public static LibrosData getInstance() {
        if (instance == null) {
            instance = new LibrosData();
        }
        return instance;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public Libro getLibroById(int id) {
        for (Libro libro : libros) {
            if (libro.getIdTitulo() == id) {
                return libro;
            }
        }
        return null;
    }

    public static List<Libro> crearLibrosDePrueba() {
        List<Libro> libros = new ArrayList<>();

        libros.add(new Libro(1, "El Señor de los Anillos",
                "Una aventura épica de hobbits y héroes en la Tierra Media.",
                R.drawable.esdla, "Fantasía",
                "Frodo recibe el Anillo Único y debe destruirlo en Mordor. Acompañado por Sam, Merry y Pippin, inicia un viaje lleno de peligros y alianzas inesperadas. En el camino se suman Aragorn, Legolas y Gimli, quienes luchan juntos contra la sombra creciente de Sauron. La travesía no solo pondrá a prueba su valor, sino también su lealtad y la fuerza de la amistad.",
                16900
        ));

        libros.add(new Libro(2, "Cien Años de Soledad",
                "La historia mágica y trágica de la familia Buendía en Macondo.",
                R.drawable.cads, "Realismo Mágico",
                "La familia Buendía funda el mítico pueblo de Macondo, donde generaciones enteras viven entre amores imposibles, guerras civiles y hechos sobrenaturales. La soledad y la repetición del destino marcan a cada miembro, mientras Macondo florece y se marchita con el paso del tiempo. García Márquez construye un universo único donde lo real y lo fantástico conviven en perfecta armonía."
                ,24000
        ));

        libros.add(new Libro(3, "Dune",
                "Un imperio lucha por el control del planeta desértico Arrakis.",
                R.drawable.dune, "Ciencia Ficción",
                "Paul Atreides llega a Arrakis, un planeta desértico clave por la especia, fuente de poder en el universo. Tras una traición mortal, se convierte en líder de los Fremen, un pueblo que lo considera el mesías. Entre intrigas políticas, visiones proféticas y batallas épicas, Paul debe decidir si cumplirá con un destino que podría cambiar la galaxia para siempre."
               ,7800
        ));

        libros.add(new Libro(4, "1984",
                "Un futuro totalitario donde el Gran Hermano lo controla todo.",
                R.drawable.mnoc, "Distopía",
                "Winston Smith trabaja reescribiendo la historia bajo la estricta vigilancia del Partido. Vive en una sociedad sin libertad, donde los pensamientos son controlados y la verdad se manipula. Al enamorarse de Julia, empieza a cuestionar el sistema, pero pronto descubre que la rebelión tiene un precio. Orwell construye una advertencia inquietante sobre la opresión y la manipulación del poder."
                ,15000
        ));

        libros.add(new Libro(5, "Las Crónicas de Narnia",
                "Cuatro niños descubren un mundo mágico detrás de un armario.",
                R.drawable.elbyr, "Fantasía",
                "Los hermanos Pevensie encuentran una entrada secreta a Narnia, un reino sumido en un invierno eterno por la Bruja Blanca. Con la guía del león Aslan, emprenden una lucha para devolver la libertad y la esperanza al pueblo. Entre batallas épicas, criaturas mágicas y lecciones de valor, los niños aprenden que el coraje y la fe pueden cambiar el destino de un mundo entero."
                ,9900
        ));

        libros.add(new Libro(6, "Fahrenheit 451",
                "Bomberos que queman libros en un mundo sin pensamiento crítico.",
                R.drawable.fccu, "Ciencia Ficción",
                "Guy Montag es un bombero que en lugar de apagar incendios los provoca, destruyendo libros prohibidos por la sociedad. Sin embargo, comienza a cuestionarse su papel cuando conoce a Clarisse, una joven curiosa y diferente. El contacto con ideas olvidadas lo lleva a rebelarse contra un sistema que teme al conocimiento. Bradbury anticipa un futuro donde la censura amenaza la libertad individual."
                ,6800
        ));

        libros.add(new Libro(12, "Harry Potter",
                "Un niño descubre que es mago y debe enfrentar su destino.",
                R.drawable.hpypf, "Fantasía",
                "Harry Potter vive con sus crueles tíos hasta que recibe una carta que le revela su verdadera identidad como mago. Al llegar a Hogwarts, descubre la amistad, la magia y también el peligro. Junto a Ron y Hermione, se enfrenta a pruebas cada vez más difíciles, mientras aprende que su vida está ligada al oscuro mago Voldemort. La saga combina aventura, misterio y el poder de la amistad.",
                18000
        ));

        libros.add(new Libro(13, "Ilusiones",
                "La historia de un aviador que encuentra un maestro espiritual.",
                R.drawable.img3, "Novela Filosófica",
                "Richard Bach, aviador y escritor, conoce a Donald Shimoda, un hombre que parece tener respuestas a los misterios de la vida. A través de charlas, vuelos y experiencias extraordinarias, aprende que los límites solo existen en la mente. El libro combina anécdotas con reflexiones profundas, inspirando a cuestionar la realidad y a descubrir el poder de los sueños y la libertad personal."
                ,8210
        ));

        libros.add(new Libro(14, "El Buzón de las Impuras",
                "Relato histórico de la tragedia en Santiago en 1863.",
                R.drawable.img1, "Novela Histórica",
                "En medio de la sociedad chilena del siglo XIX, un incendio en la Iglesia de la Compañía de Jesús cobra la vida de miles de mujeres. A través de este relato, se revelan las tensiones sociales, religiosas y políticas que rodearon el suceso. La obra expone los silencios impuestos a las protagonistas y reconstruye una de las tragedias más impactantes de la historia nacional."
                ,25900
        ));

        libros.add(new Libro(15, "El Canto del Cuco",
                "Un detective busca a una modelo desaparecida en Londres.",
                R.drawable.img2, "Novela Policíaca",
                "Cormoran Strike, un veterano de guerra convertido en investigador privado, recibe el caso de una supermodelo que aparentemente se suicidó. Junto a su asistente Robin, descubre que el mundo de la moda esconde secretos oscuros y peligrosos. Entre intrigas, sospechosos y giros inesperados, la investigación lo lleva al borde del desastre. Un elegante misterio con el ambiente único de Londres.",
                25600
        ));

        return libros;
    }
}



