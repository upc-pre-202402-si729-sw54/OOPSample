package Sales.domain.model.aggregate;

interface Person {

    int getPersonId();

    default String getPersonCode(){
        return "PersonCode";
    }

    default String getPersonName() {
        return "Person";
    }

}
