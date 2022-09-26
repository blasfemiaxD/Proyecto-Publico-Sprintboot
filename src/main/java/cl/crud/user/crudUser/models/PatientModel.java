package cl.crud.user.crudUser.models;

public class PatientModel extends PersonalInformationModel {

    private String prevision;
    private float size;
    private String allergies;
    private String preexistingDiseases;

    public String getPrevision() {
        return prevision;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPreexistingDiseases() {
        return preexistingDiseases;
    }

    public void setPreexistingDiseases(String preexistingDiseases) {
        this.preexistingDiseases = preexistingDiseases;
    }

    /*public static void main(String[] args){

        PatientModel patientModel = new PatientModel();
        patientModel.setName("Blas Miguel");
        patientModel.setPaternalSurname("Carvajal");
        patientModel.setMaternalSurname("Araya");

        System.out.println("Informacion del paciente");
        System.out.println("Nombre del paciente: " + patientModel.getName());
        System.out.println("Apellido Paterno del paciente: " + patientModel.getPaternalSurname());
        System.out.println("Apellido Materno del paciente: " + patientModel.getMaternalSurname());

    }*/


}