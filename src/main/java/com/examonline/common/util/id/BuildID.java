package com.examonline.common.util.id;

public class BuildID {
   public static String BuildExamId(String lessonno){
       String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXY";
       String id = lessonno+""+chars.charAt((int)(Math.random() * 52))
               +chars.charAt((int)(Math.random() * 52))
               +chars.charAt((int)(Math.random() * 52))
               +chars.charAt((int)(Math.random() * 52))
               +chars.charAt((int)(Math.random() * 52))
               +System.currentTimeMillis();
       return id;
   }
}
