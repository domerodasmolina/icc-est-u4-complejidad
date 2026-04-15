import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        int cantidadEstudiantes = 60_000_000;
        int cantidadConsultas = 40_000;

        System.out.println("Generando estudiantes ...");
        
        List<Estudiante> estudiantes = Generador.generarEstudiantes(cantidadEstudiantes);
        //for (Estudiante est : estudiantes){
        //    System.out.println(est.nombre);
        //}
        ///Buscar si existe el USR
        /// CON CI 1_999_993
        String cedulaBuscar = "51999993";
        for (Estudiante est : estudiantes){
            if(est.cedula.equals(cedulaBuscar)){
                System.out.println("EXISTE");
                break;
            }
        }
        // int inicio = 0;
        // int fin = estudiantes.size()-1;

        // while(inicio<= fin){
        //     int medio = (inicio+fin)/2;
        //     Estudiante actual = estudiantes.get(medio);

        //     int comparacion = actual.cedula.compareTo(cedulaBuscar);

        //     if (comparacion ==0){
        //         System.out.println("EXISTE");
        //         break;
        
        //     } else if (comparacion <0){
        //         inicio = medio+1;
        //     }else{
        //         fin = medio-1;
        //     }
        // }
=======
        System.out.println("Hello, World!");

        int num=10;
        int [] array = new int[]{ 1, 2, 3, 4, 5 };
        System.out.println(num);
        System.out.println(array);
        for(int i= 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i : array) {
            System.out.println(i);
        }
>>>>>>> 339469d5545a6836c9a9806c39c33804f86de7a6
    }
}
