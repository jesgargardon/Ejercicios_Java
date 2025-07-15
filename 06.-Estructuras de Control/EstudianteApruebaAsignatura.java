public class EstudianteApruebaAsignatura {
    public static void main(String args [ ] ){
        double notaExamen, notaTrabajoGrupo;
        boolean ratioAsistencia;
        notaExamen = 7.0;
        notaTrabajoGrupo = 4.6;
        ratioAsistencia = true;
        double notaFinal = notaExamen *0.6 + notaTrabajoGrupo *0.4;
        if (notaFinal >=5.0 && ratioAsistencia){
            System.out.println ("Enhorabuena, has aprobado la asignatura");
        }
        else {
            System.out.println ("Lo siento, no has aprobado la asignatura. Tienes que trabajar más");
        }
    }
}
