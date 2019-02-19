import java.util.Scanner;

public class libreriaJuegos {
    static int parametro; 
    static Scanner miScaner= new Scanner(System.in);
    
    static int discos;
    static int movDisco;
    static String movTorre;
    static int contador=0;
    static int numero;
    static int turnos;
    public static void main(String[] args) {
        System.out.println("escriba un parametro para entrar directamente a un juego");
        System.out.println("escriba otro numeo para entrar al menu");
        parametro = Integer.valueOf(miScaner.nextLine());
        
        switch (parametro){
            case 1:
                System.out.println("1");
                Ahorcado();
                break;
            case 2:
                System.out.println("2");
                Basketball();
                break;
            case 3:
                System.out.println("3");
                Cartas();
                break;
            case 4:
                System.out.println("4");
                hanoi();
                break;
            default:
                menu();
        }
    
    }
    public static void menu(){
        
        System.out.println(" BIENVENIDO A TU PAQUETE DE JUEGOS");
        System.out.println("elija una opcion");
        System.out.println("1 para jugar ahorcado");
        System.out.println("2 para jugar Basquetball");
        System.out.println("3 para jugar Cartas");
        System.out.println("4 para jugar Hanoi");
        System.out.println("5 para salir del juego");

        Scanner Scaner = new Scanner(System.in);
        int opcion = Integer.valueOf(Scaner.next()); 

        switch (opcion){
            case 1:
                System.out.println("Ahorcado");
                Ahorcado();
            case 2:
                System.out.println("basquetball");
                Basketball();
                break;
            case 3:
                System.out.println("Cartas");
                Cartas();
                break;
            case 4:
                System.out.println("Hanoi");
                hanoi();
                break;
            case 5:
                System.out.println("salir");
                System.exit(0);
                break;
            default:
                System.out.println("ingrese un numero valido por favor");
        }
    }
    //***********************************************
    //Juego Ahorcado
    public static void Ahorcado() {
        int VIDAS = 7;
        String palabraUsuario;
        int correctas = 0; //para contar las letras correctas
        int tamaño; //magnitud  de la palabra ingresada
        String letra;
        int contador = 0;
        char[]palabra; //letras de la palabra a adivinar
        Scanner Scaner1 = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("");
        System.out.println("BIENVENIDO AL JUEGO AHORCADO");
        System.out.println("introduce una palabra a adivinar");
        palabraUsuario= Scaner1.nextLine();
        
        tamaño = palabraUsuario.length();
        palabra = new char[tamaño];
        
    
        for (int i = 0; i < tamaño; i++) {
            palabra[i] = '*';
        }
      
        while (correctas != tamaño & VIDAS !=0){
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("AHORCADO adivina la parabra! correctas="+correctas);
            dibujos(VIDAS);
            System.out.println("");
                        
            for(int i=0; i<tamaño; i++){
                System.out.println("___"+ palabra[i] +"___"); }
          
            System.out.println("Jugador Ingrese una letra a adivinar");
            letra = Scaner1.next();
            if (palabraUsuario.contains(letra)){
                
                for(int i = 0;i< tamaño; i++){
                    if (palabraUsuario.charAt(i)== letra.charAt(0)){
                        palabra[i] = letra.charAt(0);
                        contador ++;
                    }
                }
                correctas = correctas + contador;
            } 
            else { 
                VIDAS --;
            }
                contador = 0; 
        }
        if (VIDAS==0){
            dibujos(VIDAS);
            menuFinal3();
        }
        else {
            System.out.println("");
            for (int i = 0;i<tamaño; i++){
                System.out.println("___" +palabra[i] +"___ ");
            }
        }
       
        if  (correctas == tamaño){    
            System.out.println("FELICIDADES Haz Ganado!!");
            menuFinal3();
        }
    }
    
    private static void dibujos(int i){
        switch (i){
            case 7:
                System.out.println("================");
                for(int k=0; k< 14; k++ ){
                    System.out.println("|"); 
                }
                System.out.println("__________");
                break;        
                
            case 6:
                System.out.println("     ================ ");
                System.out.println("     |               |");
                System.out.println("     |               |");
                for (int k=0; k<13; k++){
                System.out.println("|"); 
                }
                System.out.println("__________");
                  break;
            case 5:
                System.out.println("     ================ ");
                System.out.println("     |               |");
                System.out.println("     |               |");
                System.out.println("   vvvvvv            |");
                System.out.println("   |o o |            |");
                System.out.println("   | U  |            |");
                System.out.println("    ----             |");
                for (int k=0; k<9; k++){
                System.out.println("|"); 
                }
                System.out.println("__________");
                  break;  
            case 4:
                System.out.println("     ================ ");
                System.out.println("     |               |");
                System.out.println("     |               |");
                System.out.println("   vvvvvv            |");
                System.out.println("   |o o |            |");
                System.out.println("   | U  |            |");
                System.out.println("    ----             |");
                System.out.println("     ||              |");
                System.out.println("     ||              |");
                System.out.println("     ||              |");
                for (int k=0; k<6; k++){
                    System.out.println("|"); 
                }
                    System.out.println("__________");
                  break;  
            case 3:
                System.out.println("     ================ ");
                System.out.println("     |               |");
                System.out.println("     |               |");
                System.out.println("   vvvvvv            |");
                System.out.println("   |o o |            |");
                System.out.println("   | U  |            |");
                System.out.println("    ----             |");
                System.out.println("   //||              |");
                System.out.println("  // ||              |");
                System.out.println(" //  ||              |");
                for (int k=0; k<9; k++){
                    System.out.println("|"); 
                }
                    System.out.println("__________");
                  break;  
            case 2:
                 System.out.println("     ================ ");
                System.out.println("     |               |");
                System.out.println("     |               |");
                System.out.println("   vvvvvv            |");
                System.out.println("   |o o |            |");
                System.out.println("   | U  |            |");
                System.out.println("    ----             |");
                System.out.println("   //||\\            |");
                System.out.println("  // || \\           |");
                System.out.println(" //  ||  \\          |");
                for (int k=0; k<6; k++){
                    System.out.println("|"); 
                }
                    System.out.println("__________");
                  break;  
             case 1:
                 System.out.println("     ================ ");
                System.out.println("     |               |");
                System.out.println("     |               |");
                System.out.println("   vvvvvv            |");
                System.out.println("   |o o |            |");
                System.out.println("   | U  |            |");
                System.out.println("    ----             |");
                System.out.println("   //||\\            |");
                System.out.println("  // || \\           |");
                System.out.println(" //  ||  \\          |");
                System.out.println("    //               |");
                System.out.println("   //                |");
                System.out.println("  //                 |");
                for (int k=0; k<2; k++){
                    System.out.println("|"); 
                }
                    System.out.println("__________");
                  break; 
            case 0:
                System.out.println("     ================ ");
                System.out.println("     |              |");
                System.out.println("     |              |");
                System.out.println("   vvvvvv           |");
                System.out.println("   |X X |           |");
                System.out.println("   | O  |           |");
                System.out.println("    ----            |");
                System.out.println("   //||\\            |");
                System.out.println("  // || \\           |");
                System.out.println(" //  ||  \\          |");
                System.out.println("    //\\             |");
                System.out.println("   //  \\            |");
                System.out.println("  //    \\           |");
                for (int k=0; k<2; k++){
                    System.out.println("|"); 
                }
                    System.out.println("__________");
                    System.out.println("AHORCADO!!!"); 
                    
                  break; 
        }
    }
    
    
    public static void menuFinal3(){
    
        System.out.println("elije una opcion");
        System.out.println("1 para regresar a Menu Principal");
        System.out.println("2 repetir el juego");
        System.out.println("3 salir del juego");
        
        Scanner Scaner = new Scanner(System.in);
        int opcion = Integer.valueOf(Scaner.next()); 
    
        switch (opcion){
            case 1:
                System.out.println("Menu Principal");
                menu();
                break;
            case 2:
                System.out.println("reiniciar");
                Ahorcado();
                break;
            case 3:
                System.out.println("salir");
                System.exit(0);
                break;
            default:
                System.out.println("ingrese un numero valido por favor");
        }
    } 
   //************************************************************* 
    //juego Basketball
    public static int menuPartidaDefensaF(){
       
        Scanner scaner2 = new Scanner(System.in);
        int movimiento;
        int saltoLargo;
        int saltoCorto;
        int defensa1;
        int defensa2;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("siguiente turno #" +turnos ); 
        System.out.println("siguiente jugador Elija un movimiento");
	System.out.println("elija 1 para realizar salto largo(5 metros)");
	System.out.println("elija 2 para realizar salto corto(3 metros)");
	
        movimiento = Integer.valueOf(scaner2.nextLine());
        
        switch (movimiento){
            case 1:
                System.out.println("ha elegido realizar salto largo(5 metros)");
                defensaFL( ); 
                break;
            case 2: 
                System.out.println("Ha elegido realizar salto corto(3 metros)");
                defensaFC( );
                break;
            
            default:
                System.out.println("ingrese un numero valido por favor");
        }
        return numero;
    }
    
    public static int menuPartidaDefensaCC(){
       
        Scanner scaner2 = new Scanner(System.in);
        int movimiento;
        int saltoLargo;
        int saltoCorto;
        int defensa1;
        int defensa2;
        turnos--;
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("siguiente turno #" +turnos );
        System.out.println("Elija un movimiento");
	System.out.println("elija 1 para realizar salto largo(5 metros)");
	System.out.println("elija 2 para realizar salto corto(3 metros)");
	
        movimiento = Integer.valueOf(scaner2.nextLine());
        
        switch (movimiento){
            case 1:
                System.out.println("ha elegido realizar salto largo(5 metros)");
                defensaCCL( ); 
                break;
            case 2: 
                System.out.println("Ha elegido realizar salto corto(3 metros)");
                defensaCCC( );
                break;
            
            default:
                System.out.println("ingrese un numero valido por favor");
        }
        return numero;
    }
    
    public static int menuPartida(){
        
        Scanner scaner2 = new Scanner(System.in);
        int movimiento;
        int saltoLargo;
        int saltoCorto;
        int defensa1;
        int defensa2;
         
        System.out.println("Elija un movimiento");
	System.out.println("elija 1 para realizar salto largo(5 metros)");
	System.out.println("elija 2 para realizar salto corto(3 metros)");
	System.out.println("elija 3 para realizar Defensa cuerpo a cuerpo");
	System.out.println("elija 4 para realizar defensa fuerte");
        movimiento = Integer.valueOf(scaner2.nextLine());
        
        switch (movimiento){
            case 1:
                System.out.println("ha elegido realizar salto largo(5 metros)");
                SaltoLargo(  ); 
                break;
            case 2: 
                System.out.println("Ha elegido realizar salto corto(3 metros)");
                SaltoCorto(  );
                break;
            case 3:
                System.out.println("Ha elegido realizar Defensa cuerpo a cuerpo");
                menuPartidaDefensaCC();
                break;
            case 4:
                System.out.println("ha elegido realizar defensa fuerte");
                menuPartidaDefensaF();
                break;
            default:
                System.out.println("ingrese un numero valido por favor");
        }  
        return numero;
        }
    
    public static int SaltoLargo(){
        int saltoL = (int) (Math.random() * 100 + 1);
        if (saltoL > 65){
            System.out.println("HA FALLADO!!");
            numero = 0;
        }
        else {
            if (saltoL <= 65){
                System.out.println("CANASTA!!");
                numero = 3 ;
            }
        }
       return numero;
    }
    
    public static int SaltoCorto(){
        int saltoC = (int) (Math.random() * 100 + 1);
        if (saltoC > 80){
            System.out.println("HA FALLADO!!");
            numero = 0;
        }
        else {
            if (saltoC <= 80){
                System.out.println("CANASTA!!");
                numero = 2;
            }
        }
        return numero;
    }
    
    
     //Defensa cuarpo a cuerpo para salto largo 
    public static int defensaCCL( ){
        int tiroLibre;
        Scanner scaner3 = new Scanner(System.in);
        int defensaL = (int) (Math.random() * 100 + 1);
        if (defensaL > 50){
            System.out.println(" FALTA!! de la defensa haga un tiro libre ");
            System.out.println(" oprima 0 para realizar el tiro libre");
            tiroLibre= Integer.valueOf(scaner3.nextLine());
            switch(tiroLibre){
                case 0:
                    tiroLibre( );
                    break;
                default:
                     System.out.println(" numero invalido "); 
            }
        }
        else {
            if (defensaL <=50){
                System.out.println(" DEFENSA !!");
                saltoLagoConDefensaCC();
            } 
        }
        return numero;
    }
    //Defensa cuarpo a cuerpo para salto corto 
     public static int defensaCCC( ){
        int tiroLibre;
        Scanner scaner3 = new Scanner(System.in);
        int defensaC = (int) (Math.random() * 100 + 1);
        if (defensaC > 65){
            System.out.println(" FALTA!! haga un tiro libre ");
            System.out.println(" oprima 0 para realizar el tiro libre");
            tiroLibre= Integer.valueOf(scaner3.nextLine());
            switch(tiroLibre){
                case 0:
                    tiroLibre();
                    break;
                default:
                     System.out.println(" numero invalido ");       
            }
        }
        else {
            if (defensaC <=65){
                System.out.println(" DEFENSA !!");
                saltoCortoConDefensaCC();
            }
        } 
        return numero;
    }
     
    public static int saltoCortoConDefensaCC(){
        int saltoCDC = (int) (Math.random() * 100 + 1);
        if (saltoCDC > 65){
            System.out.println("HA FALLADO!!");
            numero = 0;
        }
        else {
            if (saltoCDC <= 65){
                System.out.println("CANASTA!!");
                numero = 2;
            }
        } 
        return numero;
    }
     
    public static int saltoLagoConDefensaCC(){
        int saltoLDC = (int) (Math.random() * 100 + 1);
        if (saltoLDC > 50){
            System.out.println("HA FALLADO!!");
            numero = 0;
        }
        else {
            if (saltoLDC <= 50){
                System.out.println("CANASTA!!");
                numero = 3;   
            }
        } 
        return numero;
    }
     
    
     //defensa fuerte con salto corto
    public static int defensaFC( ){
        int tiroLibre;
        Scanner scaner3 = new Scanner(System.in);
        int defensaC = (int) (Math.random() * 100 + 1);
        if (defensaC > 35){
            System.out.println(" FALTA!! haga un tiro libre ");
            System.out.println(" oprima 0 para realizar el tiro libre");
            tiroLibre= Integer.valueOf(scaner3.nextLine());
            switch(tiroLibre){
                case 0:
                    tiroLibre();
                    break;
                default:
                     System.out.println(" numero invalido ");       
            }
        }
        else {
            if (defensaC <=35){
                System.out.println(" DEFENSA !!");
                saltoCortoConDefensaF();             
            }
        } 
        return numero;
    }
    
    
    
    //defensa fuerte on salto largo 
    public static int defensaFL( ){
        int defensaC = (int) (Math.random() * 100 + 1);
        Scanner scaner3 = new Scanner(System.in);
        int tiroLibre;
        if (defensaC > 65){
            System.out.println(" FALTA!! haga un tiro libre ");
            System.out.println(" oprima 0 para realizar el tiro libre");
            tiroLibre= Integer.valueOf(scaner3.nextLine());
            switch(tiroLibre){
                case 0:
                    tiroLibre();
                    break;
                default:
                     System.out.println(" numero invalido ");       
            }
            numero = 0;   
        }
        else {
            if (defensaC <=65){
                System.out.println(" DEFENSA !!");
                saltoLagoConDefensaF();         
            }
        } 
        return numero;
    }
    
    
    
    public static int saltoLagoConDefensaF(){
        int saltoLDF = (int) (Math.random() * 100 + 1);
        if (saltoLDF > 35){
            System.out.println("HA FALLADO!!");
            tiroLibre();
            numero = 0;
        }
        else {
            if (saltoLDF <=35 ){
                System.out.println("CANASTA!!");
                numero = 3;  
            }
        } 
        return numero;
    }
    
    public static int saltoCortoConDefensaF(){
        int saltoCDF = (int) (Math.random() * 100 + 1);
        if (saltoCDF > 50){
            System.out.println("HA FALLADO!!");
            tiroLibre();
            numero = 0;
        }
        else {
            if (saltoCDF <= 50){
                System.out.println("CANASTA!!");
                numero = 2;
            }
        } 
        return numero;
    }
    
    
    public static int tiroLibre(){
        int tiroL = (int) (Math.random() * 100 + 1);
        if (tiroL > 90){
            System.out.println("HA FALLADO!!");
            numero = 0;
        }
         else {
            if (tiroL <= 90){
                System.out.println("CANASTA!!");
                numero = 2;
            }
        } 
        return numero;
    }
    public static void menuFinal2(){
    
        System.out.println("elije una opcion");
        System.out.println("1 para regresar a Menu Principal");
        System.out.println("2 repetir el juego");
        System.out.println("3 salir del juego");
    
        Scanner Scaner3 = new Scanner(System.in);
        int opcion = Integer.valueOf(Scaner3.next()); 
    
        switch (opcion){
             case 1:
                System.out.println("Menu Principal");
                menu();
                break;
            case 2:
                System.out.println("reiniciar");
                Basketball();
                break;
            case 3:
                System.out.println("salir");
                System.exit(0);
                break;
            default:
                System.out.println("ingrese un numero valido por favor");
        }
}
   
    public static void Basketball(){
      
        
        int puntos2=0;
        int puntos1=0;
       
        Scanner Scaner2 = new Scanner(System.in);
        String nombre1;
        String nombre2;
        String jugador;
      
        System.out.println("BIENBENIDOS JUEGO BASQUETBALL");
        System.out.println("");// linea de por medio 
        System.out.println("De cuantos turnos por jugador desea la partida?");
        turnos = (Integer.valueOf(Scaner2.nextLine())*2);
        System.out.println("Jugador 1 escriba su nombre");
        nombre1 =  Scaner2.nextLine();
        System.out.println("Jugador 2 escriba su nombre");
        nombre2 =  Scaner2.nextLine();
        String[] nombres = new String [] {nombre2, nombre1};
        jugador = nombres[(int) (Math.random() * 2)];
        System.out.println("");// linea de por medio 
        System.out.println("");// linea de por medio 
        System.out.println("empieza " + jugador + "= turno # " + turnos) ; 
        
        
        while (turnos > 0){
            
            Scanner scaner = new Scanner(System.in);
            if (turnos%2 != 0){
                System.out.println("Turno #" + turnos + " del jugador 2");
                menuPartida ();
                puntos2= (puntos2 + numero);
                System.out.println("sus puntos son "+ puntos2 );
            }
            else {
                if (turnos %2 == 0){
                    System.out.println("Turno #" + turnos + " del jugador 1");
                    menuPartida ();
                    puntos1 = (puntos1 + numero);
                    System.out.println("sus puntos son "+ puntos1 );}
                }
        turnos --;  
        }
        
            if(turnos==0) {
                System.out.println("");
                System.out.println("");
                System.out.println("FIN DEL JUEGO");
                System.out.println("El Ganador es:");}
                if (puntos1>puntos2){
                    System.out.println("EL JUGADOR 1 " + nombre1); 
                    System.out.println("FELICIDADES!!");
                }
            else{
                if(puntos1<puntos2){
                    System.out.println("EL JUGADOR 2 " + nombre2); 
                    System.out.println("FELICIDADES!!");}
            else {
                if(puntos1==puntos2){
                    System.out.println("HA OCURRRIDO UN EMPATE"); 
                    System.out.println("FELICIDADES A LOS DOS ");
                }
            }
        }
        if(turnos==0){
            menuFinal2();
        }      
    }  
    //*****************************************
    //cartas
    
    public static void Cartas(){
        Scanner Scaner4 = new Scanner(System.in);
        int saldo;
        String nombre;
        
        
        System.out.println("BIENVENIDO JUEGO DE CARTAS");
        System.out.println("INGRESE SU NOMRE");
        nombre = Scaner4.nextLine();
        System.out.println("INGRESE SALDO INICIAL");
        saldo = Integer.valueOf(Scaner4.nextLine());
        System.out.println("Bienvenido " + nombre);
        
        apuestaYEvaluacion(saldo);
    }
    
    public static void apuestaYEvaluacion(int saldo){
        Scanner scaner = new Scanner(System.in);
     
        while( saldo > 0){
            int apuesta;
            int carta1;
            int carta2;
            int carta3;
       
            carta1 = ((int) (Math.random() * 14) + 1);
            carta2 = ((int) (Math.random() * 14) + 1);
            carta3 = ((int) (Math.random() * 14) + 1);
            
            System.out.println("las cartas son " + carta1 );
            System.out.println( "y "+ carta2 );
            System.out.println("cuanto desea apostar por que la siguiente carta se encuentra entre los valores de las cartas anteriores?");
            apuesta = Integer.valueOf(scaner.nextLine());
            
            if (saldo >=apuesta){
     
                if (carta1 < carta3 && carta2 >= carta3){
                    System.out.println("ACERTADO!!");
                    saldo = saldo + apuesta;
                    System.out.println("Tu nuevo saldo es "+ saldo);
                }
                else {
                    if (carta2< carta3 && carta1>carta3){
                        System.out.println("acertado!!");
                        saldo = saldo + apuesta;
                        System.out.println("Tu nuevo saldo es " + saldo);} 
                    else {
                        System.out.println("INCORRECTO!!");
                        saldo = saldo - apuesta;
                        System.out.println("Tu saldo es " + saldo);
                    }
                }
            }
            else {
                System.out.println("su saldo es INSUFICIENTE");
            }
        
            if (saldo<=0){
                System.out.println("has terminado todo tu dinero :(");
                menuFinal(); 
            }
        }
    }
    
    public static void menuFinal(){
    
        System.out.println("elije una opcion");
        System.out.println("1 para regresar a Menu Principal");
        System.out.println("2 repetir el juego");
        System.out.println("3 salir del juego");

        Scanner Scaner5 = new Scanner(System.in);
        int opcion = Integer.valueOf(Scaner5.next()); 

        switch (opcion){
            case 1:
                System.out.println("Menu Principal");
                menu();
                break;
            case 2:
                System.out.println("reiniciar");
                Cartas();
                break;
            case 3:
                System.out.println("salir");
                System.exit(0);
                break;
            default:
                System.out.println("ingrese un numero valido por favor");
        }
    }
    //***************************************
    public static void hanoi() {
        Scanner miScanner=new Scanner(System.in);
        System.out.println("");
        System.out.println("BIENVEVIDO A JUEGO TORRES DE HANOI");
        System.out.println("activa mayusculas en tu teclado");
        System.out.println("Ingrese el numero de Discos con los que desea jugar");
        discos=Integer.valueOf(miScanner.nextLine());
        
         switch (discos){
                case 2:
                    dosDiscos();
                    proceso();
                    break;
                default:
                  System.out.println("SOLO PUEDE JUGAR ON 2 DISCOS");
                  hanoi();
        }
    }
    
    
    public static void proceso(){
    // INGRESO Y MOVIMIENTO DE LAS TORRES    
        while(contador != discos+1){
            System.out.println("ha decidido jugar con:  "+discos+" discos");
            System.out.println("RECUERDA solo cuentas con tres movimientos para este numero de discos");
            Scanner Scaner2 = new Scanner(System.in);
            System.out.println("movimientos "+contador);
            System.out.println("que disco desea mover");
            movDisco= Integer.valueOf(Scaner2.nextLine());
            System.out.println(movDisco);
            System.out.println("Hacia que torrre desea mober el disco?");
            movTorre= Scaner2.nextLine();
            System.out.println(movTorre);
            
            if(movDisco == 8){
                if (movTorre.equals("B")) {
                    dosDiscos8B();
                }
                else{
                    if (movTorre.equals("C")){
                        dosDiscos8C();
                    }
                    else{
                        if(movTorre.equals("C")){
                            dosDiscos8A();
                        } 
                    }
                }
            }
            
            if(movDisco == 10){
                if (movTorre.equals("B")) {
                    dosDiscos10B();
                }
                else{
                    if (movTorre.equals("C")){
                    dosDiscos10C();
                    }
                    else{
                        if(movTorre.equals("C")){
                    dosDiscos10A();}
                    }
                }
            }
            if (contador==2){
                if(movDisco == 8){
                 dosDiscos8C10();
                System.out.println("LO HAS LOGRADO");
                menuFinal4();
                }
                else{
                System.out.println("suerte a la proxima");
                menuFinal4();
                }
            }
            contador++;
        }
    }
        
        public static void dosDiscos(){
        System.out.println("     ||      ||     ||");
        System.out.println("     ||      ||     ||");
        System.out.println("   __||__    ||     ||");
        System.out.println("  |__ 8__|   ||     ||");
        System.out.println(" |___10___|  ||     ||");
        System.out.println("      A       B      C ");
        }
        

    public static void dosDiscos8B(){
        System.out.println("       ||            ||        ||");
        System.out.println("       ||            ||        ||");
        System.out.println("       ||            ||        ||");
        System.out.println("  _____||_____   ____||___     ||");
        System.out.println(" |_____10_____| |____8____|    ||");
        System.out.println("        A            B          C ");
    }
    
     
    public static void dosDiscos8A(){
        System.out.println("      ||      ||       ||       ");
        System.out.println("      ||      ||       ||       ");
        System.out.println("      ||      ||       ||       ");
        System.out.println("  ____||___   ||  _____||_____  ");
        System.out.println(" |____8____|  || |_____10_____| ");
        System.out.println("        A     B        C        ");
    
    }
    
    public static void dosDiscos8C(){ 
        System.out.println("       ||        ||      ||    ");
        System.out.println("       ||        ||      ||    ");
        System.out.println("       ||        ||      ||    ");
        System.out.println("  _____||_____   ||  ____||___ ");
        System.out.println(" |_____10_____|  || |____8____|");
        System.out.println("      A           B      C ");
    
    }
    
    public static void dosDiscos10B(){
        System.out.println(" ||           ||             ||    ");
        System.out.println(" ||           ||             ||    ");
        System.out.println(" ||           ||             ||    ");
        System.out.println(" ||      _____||_____    ____||___ ");
        System.out.println(" ||     |_____10_____|  |____8____|");
        
        System.out.println(" A            B              C ");
    
    }
    public static void dosDiscos10C(){
        System.out.println("       ||            ||           ||      ");
        System.out.println("       ||            ||           ||      ");
        System.out.println("       ||            ||           ||      ");
        System.out.println("       ||        ____||___   _____||_____ ");
        System.out.println("       ||       |____8____| |_____10_____|");
        System.out.println("        A             B            C      ");
    
    }
     public static void dosDiscos10A(){
        System.out.println("       ||       ||      ||    ");
        System.out.println("       ||       ||      ||    ");
        System.out.println("       ||       ||      ||    ");
        System.out.println("  _____||_____  ||  ____||___ ");
        System.out.println(" |_____10_____| || |____8____|");
        System.out.println("      A       B        C ");
    }
      public static void dosDiscos8C10(){
        System.out.println(" ||     ||          ||      ");
        System.out.println(" ||     ||          ||      ");
        System.out.println(" ||     ||        __||__    ");
        System.out.println(" ||     ||       |__ 8__|   ");
        System.out.println(" ||     ||      |___10___|  ");
        System.out.println("      A       B      C      ");
    
    }
    
    public static void menuFinal4(){
    
        System.out.println("elije una opcion");
        System.out.println("1 para regresar a Menu Principal");
        System.out.println("2 repetir el juego");
        System.out.println("3 salir del juego");
        
        Scanner Scaner = new Scanner(System.in);
        int opcion = Integer.valueOf(Scaner.next()); 
    
        switch (opcion){
            case 1:
                System.out.println("Menu Principal");
                menu();
                break;
            case 2:
                System.out.println("reiniciar");
                hanoi();
                break;
            case 3:
                System.out.println("salir");
                System.exit(0);
                break;
            default:
                System.out.println("ingrese un numero valido por favor");
        }
    }
}

    
