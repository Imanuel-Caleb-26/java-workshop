package com.java.workshop.temp.bin;

public class Academic extends Building{

    private boolean isLibraryAvailable;
    private boolean isAuditoriumAvailable;



    public boolean isLibraryAvailable() {
        return isLibraryAvailable;
    }
    public boolean isAuditoriumAvailable() {
        return isAuditoriumAvailable;
    }
    public void setLibraryAvailable(boolean isLibraryAvailable) {
        this.isLibraryAvailable = isLibraryAvailable;
    }

    public void setAuditoriumAvailable(boolean isAuditoriumAvailable) {
        this.isAuditoriumAvailable = isAuditoriumAvailable;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Library Available: " + isLibraryAvailable);
        System.out.println("Auditorium Available: " + isAuditoriumAvailable);
    }
    

}
