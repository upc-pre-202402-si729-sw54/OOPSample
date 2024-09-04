package Sales.domain.model.aggregate;

public class ProfileImpl implements Person{
    @Override
    public int getPersonId() {
        return 0;
    }

    @Override
    public String getPersonCode() {
        return "PersonCode2";
    }

    @Override
    public String getPersonName() {
        return Person.super.getPersonName();
    }
}
