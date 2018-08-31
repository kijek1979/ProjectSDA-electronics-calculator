package com.electronics_elements_calculator.exceptions;

import lombok.Getter;
import org.springframework.validation.BindingResult;

public class BindingResultException extends RuntimeException {

  @Getter
  private final BindingResult bindingResult;

  public BindingResultException(BindingResult bindingResult) {
    super();
    this.bindingResult = bindingResult;
  }
}
