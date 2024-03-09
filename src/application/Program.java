package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os estados do AFD, separados por vírgula: ");
        String[] states = scanner.nextLine().split(",");
        
        String[] symbols;
        while (true) {
            System.out.println("Digite o alfabeto do AFD, separados por vírgula e composto por até 2 símbolos: ");
            symbols = scanner.nextLine().split(",");
            if (symbols.length > 2) {
                System.out.println("O alfabeto deve ser composto por até 2 símbolos.");
            } else {
                break;
            }
        }

        String initialState;
        while (true) {
            System.out.println("Selecione o estado inicial: ");
            initialState = scanner.nextLine().trim();
            if (!Arrays.asList(states).contains(initialState)) { 
                System.out.println("Esse estado não existe.");
            } else {
                break;
            }
        }
        
        String[] finalStates;
        while (true) {
            System.out.println("Selecione os estados de aceitação, separados por vírgula: ");
            finalStates = scanner.nextLine().split(",");
            boolean allStatesValid = true;
            for (String state : finalStates) {
                if (!Arrays.asList(states).contains(state.trim())) {
                    System.out.println("O estado '" + state + "' não existe.");
                    allStatesValid = false;
                    break;
                }
            }
            if (allStatesValid) {
                break;
            }
        }

        List<String> transitions = new ArrayList<>();
        String transition;
        
        System.out.println("Digite as funções de transição no seguinte formato: estado_atual/simbolo/proximo_estado");
        System.out.println("Digite 'fim' para encerrar.");
        
        while(true) {
            transition = scanner.nextLine();
            if (!transition.equals("fim")) {
                transitions.add(transition);
            } else {
                break;
            }
        }
        
        System.out.println("Digite uma cadeia de símbolos: ");
        System.out.println("Digite 'fim' para encerrar.");
        
        while(true) {
            String string = scanner.nextLine();
            
            if (!string.equals("fim")) {
                String currentState = initialState;
                boolean invalidTransition = false;
                
                for (int j = 0; j < string.length(); j++) {
                    boolean foundTransition = false;
                    for (String t : transitions) {
                        String[] eachTransition = t.split("/");
                        if (eachTransition[0].equals(currentState) && eachTransition[1].charAt(0) == string.charAt(j)) {
                            currentState = eachTransition[2];
                            foundTransition = true;
                            break;
                        }
                    }
                    if (!foundTransition) {
                        invalidTransition = true;
                        break;
                    }
                }
                
                if (invalidTransition || !Arrays.asList(finalStates).contains(currentState)) {
                    System.out.println("A cadeia foi rejeitada.");
                } else {
                    System.out.println("A cadeia foi aceita.");
                }
                
            } else {
                break;
            }
        }

        scanner.close();
    }
}
