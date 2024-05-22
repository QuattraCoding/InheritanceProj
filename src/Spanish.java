public class Spanish extends Human {
    public Spanish(String name) {
        typeOfPerson = 2;
        super.name = name;
    }

    @Override
    public void talk(Human human) {
        if(human.typeOfPerson == 2) {
            System.out.println("donde esta la farmatica, me duele en mis pies, por favor ayudame.");
        }
        else{
            System.out.println("salve");
        }
    }
}
