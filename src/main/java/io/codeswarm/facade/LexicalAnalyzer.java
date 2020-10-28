package io.codeswarm.facade;

public class LexicalAnalyzer {

    private SyntaxAnalyzer syntaxAnalyzer;

    public LexicalAnalyzer() {
        syntaxAnalyzer = new SyntaxAnalyzer();
    }

    public void analyze() {
        System.out.println("1. Lexical analysis...");
        syntaxAnalyzer.analyze();
    }
}
