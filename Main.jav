

public class Main{
    bool loading_boolean = true;
    bool initialise = false;

    public static void initialisation(String[] args) // loading initialisation

        if (loading_boolean == true){
            initialise = true;
            System.out.println(initialise);
            return 0;
            
        }else{
            initialise = false;
            return 4;
        }
        

    }
    public static void version_info(String[] args){ // Information on version and dependencies
        string version = "v0.0.1 ";
        string edition = "Windows 11 edition. ";
        string spacer_for_desc = " ";
        string description_1 = "Runtime Enviroment for Windows ";
        string description_2 = "For Games made in Java (link here at java.com)";
        string description_3 = "Java Runtime required. Java runtime needs to be latest";
        string description_4 = "Made with Java";
        string description_5 = "Using Visual Studio Code";
        string description_6 = "Copyrighted. DO NOT DISTRIBUTE";

        if (loading_boolean == true){
            System.out.println(version);
            System.out.println(edition);
            System.out.println(spacer_for_desc);
            System.out.println(spacer_for_desc);
            System.out.println(description_1);
            System.out.println(description_2);
            System.out.println(description_3);
            System.out.println(spacer_for_desc);
            System.out.println(spacer_for_desc);
            System.out.println(description_4);
            System.out.println(description_5);
            System.out.println(description_6);
            return 0;
        }else{
            return 2;
        }
        
    }
}
