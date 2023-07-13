/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete11;

import java.util.ArrayList;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        /*
        Usar el txt llamado usuarios.txt; por cada línea del archivo
        crer un API en función de su servicio; además el API ahora genera
        información estática (no cambia el API), se debe buscar la forma que el 
        API sea dinámico totalmente (usar alguna librería propia de JAVA, tipo 
        Random); la url final debe contener el tipo de servicio y el user
        Por cada objeto de tipo GeneradoPelicula presentar la información 
        a través de un toString
         */
        Random rand = new Random();
        int numeroAleatorio;

        String nombreArchivo = "usuarios.txt";
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        ArrayList<GeneradorPelicula> lista = new ArrayList<>();
        Aux au;
        for (int i = 0; i < lectura.obtenerLista().size(); i++) {
            au = lectura.obtenerLista().get(i);
            if (au.getServi().equals("Netflix")) {

                APINetflix net = new APINetflix();
                net.establecerUser(lectura.obtenerLista().get(i).getUsu());
                net.establecerApiKey("(88988");
                APIMovie apiMovi = net;
                GeneradorPelicula gen = new GeneradorPelicula();
                gen.establecerLlave(apiMovi);
                gen.establecerUrl("https://nesflis=");
                lista.add(gen);
            }
            if (au.getServi().equals("Disney")) {

                APIDisney dis = new APIDisney();
                dis.establecerUser(lectura.obtenerLista().get(i).getUsu());
                dis.establecerApiKey("211221");
                APIMovie apiMovi = dis;
                GeneradorPelicula gen = new GeneradorPelicula();
                gen.establecerLlave(apiMovi);
                gen.establecerUrl("https://disneyPlus=");
                lista.add(gen);
            }
            if (au.getServi().equals("Amazon")) {

                APIAmazonMovie ama = new APIAmazonMovie();
                ama.establecerUser(lectura.obtenerLista().get(i).getUsu());
                ama.establecerApiKey("455445");
                APIMovie apiMovi = ama;
                GeneradorPelicula gen = new GeneradorPelicula();
                gen.establecerLlave(apiMovi);
                gen.establecerUrl("https://amazonMovies=");
                lista.add(gen);
            }
            if (au.getServi().equals("Startplus")) {

                APIStartplus star = new APIStartplus();
                star.establecerUser(lectura.obtenerLista().get(i).getUsu());
                star.establecerApiKey("788778");
                APIMovie apiMovi = star;
                GeneradorPelicula gen = new GeneradorPelicula();
                gen.establecerLlave(apiMovi);
                gen.establecerUrl("https://moviesplus=");
                lista.add(gen);

            }
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
