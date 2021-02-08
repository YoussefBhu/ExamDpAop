package com.example.demo.Context;

public class ApplicationContext {
    private static String username = "" ;
    private static String password= "" ;
    private static String[] roles = {} ;

    public static void Auth(String u , String p , String[] r){
        if((u.equals("Admin")) && (p.equals("hello"))){
            username = u ;
            password = p ;
            roles =  r;
        }

    }

    public static boolean hasRole(String role){
        for(String r : roles)
            if(r.equals(role))
                return true;
        return false ;
    }

}
