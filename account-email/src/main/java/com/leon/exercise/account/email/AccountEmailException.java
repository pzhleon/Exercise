package com.leon.exercise.account.email;

/**
 * Created by Leon on 2016/10/17.
 */
public class AccountEmailException extends Exception {

  private static final long serialVersionUID = 1L;

  public AccountEmailException(String message) {
    super(message);
  }

  public AccountEmailException(String message, Throwable throwable) {
    super(message, throwable);
  }

}
