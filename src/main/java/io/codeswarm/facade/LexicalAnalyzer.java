package io.codeswarm.facade;

public class LexicalAnalyzer {

    private final ErrorHandler errorHandler;
    private final SyntaxAnalyzer syntaxAnalyzer;

    public LexicalAnalyzer() {
        errorHandler = new ErrorHandler();
        syntaxAnalyzer = new SyntaxAnalyzer();
    }

    public void analyze() {
        System.out.println("1. Lexical analysis...");
        errorHandler.handle();
        syntaxAnalyzer.analyze();
    }
}
