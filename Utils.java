package com.sap.projectsap.utilities;

import java.security.SecureRandom;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad Tauheed
 */
public class Utils {
    
  private final Random RANDOM = new SecureRandom();
  private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  private final String NUMBERS = "0123456789";
  
  public static <T> T requireNonNull(T obj, String message){
     if(obj == null || obj.equals("") || obj.equals(" ") || obj.equals("null")){
            throw new RuntimeException(message);
        }
        return obj; 
  }  
  
  public String generateSAPId(int length){
      return generateRandomString(length);
  }
  
  public String generateRandomString(int length){
      StringBuilder returnValue = new StringBuilder(length);
      for(int i=0;i<length;i++){
          returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
      }
      return new String(returnValue);
  }
  
  public String generateRandomInteger(int length){
      StringBuilder returnValue = new StringBuilder(length);
      for(int i=0;i<length;i++){
          returnValue.append(NUMBERS.charAt(RANDOM.nextInt(NUMBERS.length())));
      }
      return new String(returnValue);
  }
}
