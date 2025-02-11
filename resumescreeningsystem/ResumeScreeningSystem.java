package com.tit.week04.day01.generics.resumescreeningsystem;

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        SoftwareEngineer se1 = new SoftwareEngineer("Backend Developer", "Java");
        SoftwareEngineer se2 = new SoftwareEngineer("Frontend Developer", "React");
        softwareEngineerResumes.addResume(se1);
        softwareEngineerResumes.addResume(se2);

        Resume<DataScientist> dataScientistResumes = new Resume<>();
        DataScientist ds1 = new DataScientist("AI Engineer", "Machine Learning");
        DataScientist ds2 = new DataScientist("Data Analyst", "Big Data");
        dataScientistResumes.addResume(ds1);
        dataScientistResumes.addResume(ds2);

        Resume<ProductManager> productManagerResumes = new Resume<>();
        ProductManager pm1 = new ProductManager("E-commerce PM", "Retail");
        ProductManager pm2 = new ProductManager("FinTech PM", "Banking");
        productManagerResumes.addResume(pm1);
        productManagerResumes.addResume(pm2);


        System.out.println("\nSoftware Engineer Resumes:");
        Resume.displayResumes(softwareEngineerResumes.getResumes());

        System.out.println("\nData Scientist Resumes:");
        Resume.displayResumes(dataScientistResumes.getResumes());

        System.out.println("\nProduct Manager Resumes:");
        Resume.displayResumes(productManagerResumes.getResumes());

        // Process resumes
        System.out.println("\nProcessing Resumes:");
        Resume.processResume(se1);
        Resume.processResume(ds1);
        Resume.processResume(pm1);
    }
}
