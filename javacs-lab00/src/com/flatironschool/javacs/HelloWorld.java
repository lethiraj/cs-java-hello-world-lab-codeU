package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
    	String x= System.getProperty("java.specification.version");
    	Double y=Double.parseDouble(x);
    	return y;
    
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
    	System.out.println(getVersion());
    }
}
