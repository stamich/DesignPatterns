package io.codeswarm.facade;

public class SemanticAnalyzer {

    private final ErrorHandler errorHandler;
    private final IntermediateCodeGenerator icg;

    public SemanticAnalyzer() {
        errorHandler = new ErrorHandler();
        icg = new IntermediateCodeGenerator();
    }
    public void analyze() {
        System.out.println("3. Semantic analysis...");
        errorHandler.handle();
        icg.generate();
    }
}
