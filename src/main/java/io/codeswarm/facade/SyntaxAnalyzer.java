package io.codeswarm.facade;

public class SyntaxAnalyzer {

    private SemanticAnalyzer semanticAnalyzer;

    public SyntaxAnalyzer() {
        semanticAnalyzer = new SemanticAnalyzer();
    }

    public void analyze() {
        System.out.println("2. Syntax analysis...");
        semanticAnalyzer.analyze();
    }
}
