import java.util.Scanner;

public class Main {

    public static void holaMundo() {
        System.out.println("\nHola Mundo :D");
    }

    public static void sumaDosNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu primer digito ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo digito ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("\nla suma de los numeros es: " + suma);
    }

    public static void parOImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("\nEl numero es par.");
        } else {
            System.out.println("\nEl numero es impar.");
        }
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngresa un numero: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("\nEl factorial del numero " + num + " es: " + factorial);
    }

    public static void tablaDeMultiplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngresa un numero: ");
        int num = scanner.nextInt();

        System.out.println("\nTabla de multiplicar en orden ascendente 😎:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("\nTabla de multiplicar en orden descendente 🙀: ");
        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void ProgramaBonus() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ingresa un número (ingresa un numero negativo para terminar): ");
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("\nEl numero mas grande es: " + max);
        System.out.println("El numero mas pequeno es: " + min + "\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nMenú de Ejercicios:");
            System.out.println("1. Hola Mundo :D");
            System.out.println("2. Suma de dos numeros");
            System.out.println("3. Numero par o impar");
            System.out.println("4. Factorial de un numero");
            System.out.println("5. Tabla de multiplicar de un numero");
            System.out.println("6. Programa Bonus 🙀🙀(numero max y min)");

            System.out.println("7. Salir");
            System.out.print("Selecciona una de las opciones: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    sumaDosNumeros();
                    break;
                case 3:
                    parOImpar();
                    break;
                case 4:
                    factorial();
                    break;
                case 5:
                    tablaDeMultiplicar();
                    break;
                case 6:
                    ProgramaBonus();
                    break;
                case 7:
                    System.out.println("vuelve pronto 😁, Saliendo del programa... ");
                    break;
                default:
                    System.out.println("Selecciona una de las opciones en el rango de 1-6.");
            }
        } while (option != 7);

        scanner.close();
    }

}
