package org.postgres.creatingjavaproject.exceptions;

import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class CustomFailureAnalyzer extends AbstractFailureAnalyzer<BeanNotOfRequiredTypeException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, BeanNotOfRequiredTypeException cause) {
        return new FailureAnalysis(
                String.format("The bean %s could not be injected as %s," +
                        "as it is of type %s", cause.getBeanName(),
                        cause.getRequiredType().getName(),
                        cause.getActualType().getName()),
                String.format("Consider creating a bean with name %s and type %s",
                        cause.getBeanName(), cause.getRequiredType().getName()),
                cause
        );
    }
}
