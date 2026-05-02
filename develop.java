 class develop {
    public static void main(String[] args) {
        String str = "Dhanaraj Ramesh";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.substring(0, 6));
        System.out.println(str.contains("kamal"));
        System.out.println(str.equals("Abishek "));
        System.out.println(str.equalsIgnoreCase("Abishek"));
        System.out.println(str.replace('a', 'x'));
        System.out.println(str.trim());
        System.out.println(str.startsWith("D"));
        System.out.println(str.endsWith("h"));
        System.out.println(str.toCharArray());
        System.out.println(str.isEmpty());
        // System.out.println(str.isAlphanumeric());
        System.out.println(str.isBlank());
        System.out.println(str.strip());
    }
}