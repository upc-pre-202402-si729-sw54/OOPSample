package Sales.domain.model.aggregate;

public class PersonImpl implements Person{
    @Override
    public int getPersonId() {
        return 0;
    }

    @Override
    public String getPersonName() {
        return Person.super.getPersonName();
    }
}
