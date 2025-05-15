public class MethodDeclarationImpl implements  InterfaceWithMethodDeclaration{


    @Override
    public String getMeBody(){
      return "Here, is your body";
   }

    public void staticMethodBodyOfInterface(){
        System.out.println(InterfaceWithMethodDeclaration.anotherMethodBody());
    }

}
