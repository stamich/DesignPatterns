package io.codeswarm.facade;

public class IntermediateCodeGenerator {

    private final CodeOptimizer codeOptimizer;

    public IntermediateCodeGenerator() {
        codeOptimizer = new CodeOptimizer();
    }

    public void generate() {
        System.out.println("4. Generating intermediate code...");
        codeOptimizer.optimize();
    }
}
