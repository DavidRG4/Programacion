package com.company;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String YN;
        int puntos=0;
        System.out.println("Realiza este test para ve si tu pareja es infiel, responde con si o no");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        YN=sc.nextLine();
        if (YN.equals("si")){
            puntos=puntos+3;
        }
        if (puntos>=0 && puntos<=10){
            System.out.println("• Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }else if (puntos>=11 && puntos<=22){
           System.out.println("• Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");

       }else if (puntos>=23 && puntos<=30) {
            System.out.println("• Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }


    }
}
