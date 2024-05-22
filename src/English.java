public class English extends Human {
    public English(String name) {
        typeOfPerson = 3;
        super.name = name;

    }

    @Override
    public void talk(Human human) {
        if(human.typeOfPerson == 3){
        System.out.println("i hate me wife, its tuesday innit, my teef be like a beavers innit");}
        else {
            System.out.println("salve");
        }

    }
}
