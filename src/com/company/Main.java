package com.company;

import builder.ComputerBuilder;
import builder.DocumentationBuilder;
import director.Director;
import entities.Computer;
import entities.Documentation;

public class Main {

    public static void main(String[] args) {
        try {
            Director director = new Director();

            ComputerBuilder builder = new ComputerBuilder();
            director.constructTopComputer(builder);

            Computer computer = builder.getResult();

            DocumentationBuilder documentationBuilder = new DocumentationBuilder();

            director.constructTopComputer(documentationBuilder);
            Documentation documentation = documentationBuilder.getResult();
            System.out.println("\nComputer documentation: \n" + documentation.toString());
        }catch (NullPointerException e){
            System.out.println("Computer isn't build or doesn't exist");
        }
    }
}
