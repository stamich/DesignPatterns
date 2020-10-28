package io.codeswarm.facade;

public class Compiler {

    private final LexicalAnalyzer lexicalAnalyzer;

    public Compiler() {
        lexicalAnalyzer = new LexicalAnalyzer();
    }

    public void compile() {
        System.out.println("Facade - Compile...");
        lexicalAnalyzer.analyze();
    }
}
