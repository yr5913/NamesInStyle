package org.stylish;

public class Runner {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide input text as program arguments");
        }
        StringBuilder name = new StringBuilder(args[0]);
        for (int i = 1; i < args.length; i++) {
            name.append("\n").append(args[i]);
        }
        StringGenerator.setUniformFlag(true);
        StringGenerator.setJustifyFlag(true);
        StringGenerator.setIndent(2);

        PrintStylish.generateAndPrint(name.toString(), 250);
    }
}
