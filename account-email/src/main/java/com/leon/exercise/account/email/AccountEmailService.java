package com.leon.exercise.account.email;

/**
 * Created by Leon on 2016/10/17.
 */
public interface AccountEmailService {

  void sendMail(String to, String subject, String htmlText) throws AccountEmailException;

}
