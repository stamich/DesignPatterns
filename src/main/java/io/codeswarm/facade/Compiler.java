package io.codeswarm.facade;

public class Compiler {

    private LexicalAnalyzer lexicalAnalyzer;

    public Compiler() {
        lexicalAnalyzer = new LexicalAnalyzer();
    }

    public void compile() {
        System.out.println("Compile...");
        lexicalAnalyzer.analyze();
    }
}
