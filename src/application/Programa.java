package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Carro;
import entities.Cliente;

public class Programa {
	public static void main(String[] args) {
				
		String nome, email;
		int idade, cnh, cpf, cel, escolhaCarro, menu;

        List<Carro> carros = new ArrayList<Carro>();

        List<Cliente> clientes = new ArrayList<>();
		
		Scanner leia = new Scanner (System.in);			
		
        Carro carro1 = new Carro(1, "Chevrolet", "Celta", 53.00);
        Carro carro2 = new Carro(2, "Lamborguini", "Huracan", 200.00);
        Carro carro3 = new Carro(3, "Chevrolet", "Opala", 87.00);
        Carro carro4 = new Carro(4, "Wolks", "Golf GTI", 65.00);
        Carro carro5 = new Carro(5, "Fiat", "Uno com escadinha", 45.00);

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);

        System.out.println("------------------------------------------------------\n");
        System.out.println("\t\tBem vindo a SixBlack");
        System.out.println("------------------------------------------------------\n");

        do {
            System.out.println("(1) - Exibir a lista de veículos.");
            System.out.println("(2) - Efetuar aluguel.");
            System.out.println("(3) - Imprimir comprovante.");
            System.out.println("(0) - Encerrar o sistema.\n");
            menu = leia.nextInt();

            switch(menu){
                case 1:
                    System.out.println("\n-------------- Carros disponíveis -------------- \n");
                    for(Carro imprimir : carros) {
                        System.out.println(imprimir);
                    }
                    System.out.println("\n------------------------------------------------ \n");
                break;

                case 2:
                System.out.println("\n-------------- Carros disponíveis -------------- \n");

                    for(Carro imprimir : carros) {
                        System.out.println(imprimir);
                    }

                    System.out.println("\n------------------------------------------------ \n");

                    System.out.println("\nEntre com o carro escolhido: ");
                    escolhaCarro = leia.nextInt();
                    leia.nextLine();

                    carros.remove(escolhaCarro - 1);

                    System.out.println("\nEntre com a data de retirada do veículo (no formato: aaaa-MM-dd): ");
                    String dataLocacao = leia.nextLine();
                    LocalDate startDate = LocalDate.parse(dataLocacao);

                    System.out.println("\nEntre com a data de devolução do veículo (no formato: aaaa-MM-dd): ");
                    String dataDevolucao = leia.nextLine();
                    LocalDate endDate = LocalDate.parse(dataDevolucao);

                    System.out.println("\n------------------- Registro do Cliente ----------------------");
                    System.out.println("--------------------------------------------------------------\n");

                    System.out.println("\nNome completo: ");
                    nome = leia.nextLine();

                    System.out.println("\nIdade: ");
                    idade = leia.nextInt();
                    leia.nextLine();

                    System.out.println("\nCNH: ");
                    cnh = leia.nextInt();
                    leia.nextLine();

                    System.out.println("\nCPF: ");
                    cpf = leia.nextInt();
                    leia.nextLine();      

                    System.out.println("\nE-mail: ");
                    email = leia.nextLine();
                    
                    System.out.println("\nCelular: ");
                    cel = leia.nextInt();
                    leia.nextLine();

                    Cliente cliente = new Cliente(nome, email, cel, idade, cnh, cpf);
                    clientes.add(cliente);

                    System.out.println("Cliente Registrado com sucesso!");
                    System.out.println("\nCarro reservado para: " + clientes.get(0).getNome() + "\n");
                
                    double valorTotal = carros.get((escolhaCarro - 1)).calcularCustoTotal(startDate, endDate);

                    System.out.println("\n-------------- Impressão de comprovante -------------------");
                    System.out.println("-------------------------------------------------------------\n");

                    System.out.println("Dados do cliente---------------------------------------------");
                    System.out.println("Nome: " + clientes.get(0).getNome());
                    System.out.println("CNH: " + clientes.get(0).getCnh());
                    System.out.println("Celular: " + clientes.get(0).getCel());
                    System.out.println("\nDados da reserva--------------------------------------------");
                    System.out.println("Modelo: " + carros.get(escolhaCarro - 1).getModelo() + " | Valor da diária: " + carros.get(escolhaCarro - 1).getCustoDiario());       
                    System.out.println("\nData de Retirada: " + dataLocacao + " | Data de Devolução: " + dataDevolucao);
                    System.out.println("\n-----------------------------------------------------------"); 
                    System.out.println("Valor TOTAL: R$" + valorTotal + " reais."); 
                    System.out.println("-------------------------------------------------------------\n"); 
                    
                    System.out.println("\nDeseja realizar uma nova reserva? 1-Sim 2-Não\n"); 
                    int novaReserva = leia.nextInt();

                    if(novaReserva == 2) {
                        menu = 0;
                        System.out.println("\nPrograma Finalizado. Volte Sempre!");
                    }
                    else {
                        menu = novaReserva;
                    }
                    
                break;


                default :
                    System.out.println("\nPrograma Finalizado. Volte Sempre!");
            }
        }
        while(menu != 0);
    
    leia.close();
	}
}