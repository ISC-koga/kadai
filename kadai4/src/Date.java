class Date { 
    public static String today() { 
        return "2020/01/20"; 
    } 
} 

class Counter { 
    private static int tvNum = 100; 
    private static int radioNum = 76; 
    public static int getTvNumber() { 
        return tvNum++; 
    } 
    
    public static int getRadioNumber() { 
        return radioNum++; 
    } 
}