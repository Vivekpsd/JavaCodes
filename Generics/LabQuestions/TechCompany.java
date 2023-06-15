import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TechCompany {
    private String name;
    private int packageOffered;
    private String domainOfWork;

    public TechCompany(String name, int packageOffered, String domainOfWork) {
        this.name = name;
        this.packageOffered = packageOffered;
        this.domainOfWork = domainOfWork;
    }

    public String getName() {
        return name;
    }

    public int getPackageOffered() {
        return packageOffered;
    }

    public String getDomainOfWork() {
        return domainOfWork;
    }

    public static void main(String[] args) {
        List<TechCompany> companyList = new ArrayList<>();

        companyList.add(new TechCompany("Google", 150000, "Search Engine"));
        companyList.add(new TechCompany("Microsoft", 120000, "Software Development"));
        companyList.add(new TechCompany("Amazon", 130000, "E-commerce"));


        for (TechCompany company : companyList) {
            System.out.println("Company: " + company.getName());
            System.out.println("Package Offered: $" + company.getPackageOffered());
            System.out.println("Domain of Work: " + company.getDomainOfWork());
            System.out.println("---------------------------");
        }

        Comparator<TechCompany> con = new Comparator<TechCompany>() {
            public int compare(TechCompany c1, TechCompany c2) {
                return Integer.compare(c1.packageOffered, c2.packageOffered);
            }
        };

        Collections.sort(companyList, con);

        System.out.println("\n||||||||||||||||||| AFTER SORTING ||||||||||||||||\n");

        // increasing order of salary offered...
        
        for (TechCompany company : companyList) {
            System.out.println("Company: " + company.getName());
            System.out.println("Package Offered: $" + company.getPackageOffered());
            System.out.println("Domain of Work: " + company.getDomainOfWork());
            System.out.println("---------------------------");
        }
    }
}
