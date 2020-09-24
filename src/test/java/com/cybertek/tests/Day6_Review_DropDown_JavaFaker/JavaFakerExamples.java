package com.cybertek.tests.Day6_Review_DropDown_JavaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {
    @Test
    public void Faker_Test(){

        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        System.out.println("firstName = " + firstName);

        String lastName = faker.name().lastName();
        System.out.println("lastName = " + lastName);

        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);

        String fullAddress = faker.address().fullAddress();
        System.out.println("fullAddress = " + fullAddress);

        String summonerSpell = faker.leagueOfLegends().summonerSpell();
        System.out.println("summonerSpell = " + summonerSpell);

        String location = faker.leagueOfLegends().location();
        System.out.println("location = " + location);
        String champion = faker.leagueOfLegends().champion();
        System.out.println("champion = " + champion);
    }
}
