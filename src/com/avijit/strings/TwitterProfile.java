package com.avijit.strings;

public class TwitterProfile {
    static class Profile {
        String Name;
        String UserName;
        String Language;
        int numberOfFollower;
        String Country;

        public Profile(String name, String userName, String language, int numberOfFollower, String country) {
            this.Name = name;
            this.UserName = userName;
            this.Language = language;
            this.numberOfFollower = numberOfFollower;
            this.Country = country;
        }

    public String toString() {
        return "Name: " + Name + "\n" + "UserName: " + UserName + "\n" + "Language: " + Language+"\n"+"Number of Followers: "+numberOfFollower+"\n"+"Country: "+Country;
    }
    }

    public static void main(String[] args) {
        Profile p1 = new Profile(
                "john Doe",
                "@jdoe",
                "English",
                10000,
                "England"
                );
        System.out.println(p1.toString());
    }
}
