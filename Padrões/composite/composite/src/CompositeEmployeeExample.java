public class CompositeEmployeeExample {
    public static void main(String[] args) {
        // Criar instâncias de folhas
        Developer dev1 = new Developer("Ariane");
        Developer dev2 = new Developer("Silas");
        Manager manager = new Manager("Alan");

        // Criar instância de composite
        TeamLead teamLead = new TeamLead("Professor");

        // Adicionar folhas ao composite
        teamLead.addTeamMember(dev1);
        teamLead.addTeamMember(dev2);
        teamLead.addTeamMember(manager);

        // Chamar o método showDetails no composite
        teamLead.showDetails();
    }
}