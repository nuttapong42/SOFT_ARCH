package edu.parinya.softarchdesign.structural;

import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {

    Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        members = new LinkedHashSet<>();
    }

    public void addMember(HealthcareServiceable worker) {
        members.add(worker);

    }
    public void removeMember(HealthcareServiceable worker) {
        members.remove(worker);
    }

    public void service() {
        for (HealthcareServiceable i : members) {
            i.service();
        }
    }



    public double getPrice() {
    double price = 0;
    for (HealthcareServiceable i : members) {
        price += i.getPrice();
    }
      return price;
    }






}
