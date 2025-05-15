import java.util.logging.Logger;

public class MainClass {
    public static void main(String[] args) {
        MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
        System.out.println(methodDeclaration.getMeBody());

        System.out.println(methodDeclaration.writes());

        methodDeclaration.staticMethodBodyOfInterface();
    }
}
