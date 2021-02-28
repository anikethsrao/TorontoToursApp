package com.example.android.torontotoursapp;

/**
 * Object to store important information about Toronto tourist attractions
 */
public class Toronto {

    private String name;
    private String address;
    private String phoneNumber;
    private String website;
    private String dates;
    private long rating;

    /**
     * Constructor for restaurant objects
     *
     * @param name        Location Name
     * @param address     Location Address
     * @param phoneNumber Location Phone Number
     * @param rating      Location rating
     */
    public Toronto(String name, String address, String phoneNumber, long rating) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.rating = rating;
    }

    /**
     * Constructor for Tourist attractions
     *
     * @param name        Location Name
     * @param address     Location Address
     * @param phoneNumber Location Phone Number
     * @param website     Location website
     * @param rating      Location rating
     */
    public Toronto(String name, String address, String phoneNumber, String website, long rating) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.rating = rating;
    }

    /**
     * Constructor for Events occurring in Toronto
     *
     * @param name        Location Name
     * @param address     Location Address
     * @param phoneNumber Location Phone Number
     * @param website     Location website
     * @param dates       Location dates
     * @param rating      Location rating
     */
    public Toronto(String name, String address, String phoneNumber, String website, String dates, long rating) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.dates = dates;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDates() {
        return dates;
    }

    public String getWebsite() {
        return website;
    }

    public long getRating() {
        return rating;
    }
}
