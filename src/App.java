import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
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
    }
}
