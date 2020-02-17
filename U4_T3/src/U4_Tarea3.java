
public class U4_Tarea3 {
    
    //CONSTANTES
    public static final String [] DIAS_SEMANA = {
                                                 "Lunes",
                                                 "Martes",
                                                 "Miércoles",
                                                 "Jueves",
                                                 "Viernes",
                                                 "Sabado",
                                                 "Domingo"};
    public static final int MAX_TRIANGULO = 5;
    //FIN CONSTANTES
   
    public static void main(String[] args) {
        
        //Creamos el objeto y apuntamos al metodo inicio
        U4_Tarea3 programa = new U4_Tarea3();
        programa.inicio();
    }
    
    //Metodo de ejecución
    public static void inicio()
    {
        //Ejeción del programa               
        mostrarDiesDeLaSetmana();
        System.out.println("-----------");
        dibuixTriangle();
    }
    
    //Muestras los días de la semana (String)
    public static void mostrarDiesDeLaSetmana()
    {
        for(int i = 0; i < DIAS_SEMANA.length; i++)
        {
            System.out.println("- " + DIAS_SEMANA[i]);
        }
    }
    
    //Dibuja un triángulo
    public static void dibuixTriangle()
    {
        for(int i = 0; i < MAX_TRIANGULO; i++)
        {
            for(int b = 0; b < i+1; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
