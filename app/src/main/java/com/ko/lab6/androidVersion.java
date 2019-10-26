package com.ko.lab6;

public class androidVersion {
    private int logo;
    private String name, cCountry, cIndustry, cCEO, cDescription;

    public androidVersion(int logo, String name, String cCountry, String cIndustry, String cCEO, String cDescription) {
        this.logo = logo;
        this.name = name;
        this.cCountry = cCountry;
        this.cIndustry = cIndustry;
        this.cCEO = cCEO;
        this.cDescription = cDescription;
    }


    public int getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getcCountry() {
        return cCountry;
    }

    public String getcIndustry() {
        return cIndustry;
    }

    public String getcCEO() {
        return cCEO;
    }

    public String getcDescription() {
        return cDescription;
    }
}
