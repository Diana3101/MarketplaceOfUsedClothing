package com.company.services;

import com.company.entities.*;


public final class ITService {
    private final Staff webDeveloper;
    private final Staff webDesigner;
    private final Staff appDeveloper;

    public ITService(Staff webDeveloper, Staff webDesigner, Staff appDeveloper) {
        this.webDeveloper = webDeveloper;
        this.webDesigner = webDesigner;
        this.appDeveloper = appDeveloper;
    }

    public void fixSite(Customer customer){
        System.out.println(this.webDeveloper.getPosition() + " " + this.webDeveloper.getFirstName() + " fixed bug: " + customer.getProblem() + ".");
        customer.setProblem(Problems.NoProblems);
    }

    public void fixInterface(Customer customer){
        System.out.println(this.webDesigner.getPosition() + " " + this.webDesigner.getFirstName() + " fixed bug: " + customer.getProblem() + ".");
        customer.setProblem(Problems.NoProblems);
    }

    public void fixApp(Customer customer){
        System.out.println(this.appDeveloper.getPosition() + " " + this.appDeveloper.getFirstName() + " fixed bug: " + customer.getProblem() + ".");
        customer.setProblem(Problems.NoProblems);
    }

    @Override
    public String toString(){
        return "There are Web-developer, Web-designer and App-developer in our IT service";
    }
}
