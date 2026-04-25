public class Tablouri {
   
    public static void main(String[] args){
        String[] names = new String[3]; 

	names[0] = "Ionut";
	names[1] = "Razvan";
	names[2] = "Gheorghe";

        for(String name : names)
	{
            System.out.println(name);
	}

	System.out.println(names.length);
	System.out.println(names[2]);
    }

}

