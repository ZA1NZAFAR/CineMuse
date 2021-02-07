package DTO;

public class PersonDTO {
    int idPerson;
    String TypePerson;

    public PersonDTO(int idPerson, String typePerson) {
        this.idPerson = idPerson;
        TypePerson = typePerson;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getTypePerson() {
        return TypePerson;
    }

    public void setTypePerson(String typePerson) {
        TypePerson = typePerson;
    }
}
