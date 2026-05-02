 class Stringbuilder{
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");          
        sb.replace(6, 11, "Java");    
        sb.append("!"); 
        System.out.println(sb);        
}
}
