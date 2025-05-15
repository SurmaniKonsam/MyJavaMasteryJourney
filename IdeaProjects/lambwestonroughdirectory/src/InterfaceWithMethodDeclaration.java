public interface InterfaceWithMethodDeclaration {

    public String getMeBody();

    default String writes(){
        return "yes i can have a method body but it must be of default type";
    }

    public static String anotherMethodBody(){
        return "yes i am a static method body";
    }
}
