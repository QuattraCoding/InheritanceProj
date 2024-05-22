public class Swedish extends Human {


    public Swedish(String name) {
        typeOfPerson = 1;
        super.name = name;
    }

    @Override
    public void talk(Human human) {
        if(human.typeOfPerson == 1){
        System.out.println("halloj jag käkar köttbullar och hare gött runt majbrasan kexet.");}
        else{
            System.out.println("salve");
        }
    }
}
