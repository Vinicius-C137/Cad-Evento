package principal.java.principal;

//importações

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// criação de classe

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EventoManager eventoManager = new EventoManager();

        System.out.println("Cadastro Usuário:");
        // entrada nome
        System.out.println("Nome: ");
        String userName = scanner.nextLine();
        // entrada email
        System.out.println("Email: ");
        String userEmail = scanner.nextLine();
        // entrada idade
        System.out.println("Idade: ");
        int userAge = scanner.nextInt();
        // entrada genero
        System.out.println("Sexo (M/F): ");
        boolean userSex = scanner.next().equalsIgnoreCase("M");
        scanner.nextLine();
        // entrada endereço
        System.out.println("Endereço: ");
        String userAddress = scanner.nextLine();
        // criação de usuario

        User usuario = new User(userName, userEmail, userAge, userSex, userAddress);

        System.out.println("Cadastro de Evento:");
        // entrada nome evento
        System.out.println("Nome: ");
        String eventName = scanner.nextLine();
        // entrada endereço evento
        System.out.println("Endereço: ");
        String eventAddress = scanner.nextLine();
        // entrada categoria evento
        System.out.println("Categoria: ");
        String category = scanner.nextLine();
        // entrada data e hora evento
        System.out.println("Horário (YYYY-MM-DDTHH:MM): ");
        LocalDateTime time = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        // descrição evento
        System.out.println("Descrição: ");
        String description = scanner.nextLine();
        // criação de novo evento
        Evento evento = new Evento(eventName, eventAddress, category, time, description);
        eventoManager.cadastrarEvento(evento);

        System.out.println("\nEventos Cadastrados:");
        for (Evento e : eventoManager.consultarEventos()) {
            System.out.printf("Nome: " + e.getEventName());
            System.out.printf("\nEndereço: " + e.getEventAddress());
            System.out.printf("\nCategoria: " + e.getCategory());
            System.out.printf("\nHorário: " + e.getTime());
            System.out.printf("\nDescrição: " + e.getDescription());
        }

        scanner.close();
    }
}
