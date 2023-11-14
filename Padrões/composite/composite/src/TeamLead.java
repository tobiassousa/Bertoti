import java.util.ArrayList;
import java.util.List;

class TeamLead implements Employee {
    private String name;
    private List<Employee> teamMembers = new ArrayList<>();

    public TeamLead(String name) {
        this.name = name;
    }

    public void addTeamMember(Employee member) {
        teamMembers.add(member);
    }

    public void removeTeamMember(Employee member) {
        teamMembers.remove(member);
    }

    @Override
    public void showDetails() {
        System.out.println("Líder de Equipe: " + name);
        System.out.println("Membros da Equipe:");

        for (Employee member : teamMembers) {
            member.showDetails();
        }
    }
}