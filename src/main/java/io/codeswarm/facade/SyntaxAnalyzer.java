package io.codeswarm.facade;

public class SyntaxAnalyzer {

    private final ErrorHandler errorHandler;
    private final SemanticAnalyzer semanticAnalyzer;

    public SyntaxAnalyzer() {
        errorHandler = new ErrorHandler();
        semanticAnalyzer = new SemanticAnalyzer();
    }

    public void analyze() {
        System.out.println("2. Syntax analysis...");
        errorHandler.handle();
        semanticAnalyzer.analyze();
    }
}
