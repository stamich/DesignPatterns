package io.codeswarm.facade;

public class CodeOptimizer {

    private final CodeGenerator codeGenerator;

    public CodeOptimizer() {
        codeGenerator = new CodeGenerator();
    }

    public void optimize() {
        System.out.println("5. Optimizing code...");
        codeGenerator.generate();
    }
}
