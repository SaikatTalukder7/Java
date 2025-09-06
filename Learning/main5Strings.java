public class main5Strings {
    public static void main(String[] args){
        //String
        //concetenate
        String name1 = "Saikat";
        String name2 = "akku";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);

        //charAT
        String name4 = "Saikatt";
        System.out.println(name4.charAt(0));
        //length
        System.out.println(name4.length());

        //relace
        String name5 = "Talukder";
        String name6 = name5.replace('a','b');
        System.out.println(name6);

        //substring
        String name7 = "Saikat Talukder";
        System.out.println(name7.substring(0,8)); //output will come from...first index to last-1.Space also count...

    }
}
