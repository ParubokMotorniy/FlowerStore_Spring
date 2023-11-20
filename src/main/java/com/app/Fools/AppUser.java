package com.app.Fools;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@Entity
public class AppUser
{
    @Id
    @Setter
    @Getter
    private int id;

    @Getter
    @Column(length = 30, unique = true)
    private String email;

    @Transient
    @Setter
    private LocalDate dob;

    @Setter
    @Getter
    @Column(length = 30)
    private Period age;

    @Setter
    @Getter
    @Column(updatable = false)
    private LocalDate timeAdded;


    public LocalDate getDob()
    {
        LocalDate currentDate = LocalDate.now();
        Period diff = Period.between(currentDate, timeAdded);

        age = age.plusYears(diff.getYears()).plusMonths(diff.getMonths()).plusDays(diff.getDays());

        LocalDate newDob = currentDate.minusYears(age.getYears()).minusMonths(age.getMonths()).minusDays(age.getDays());
        return newDob;
    }
}
