package org.vodqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.vodqa.Matchmaker.Gender.FEMALE;
import static org.vodqa.Matchmaker.Gender.MALE;

public class MatchmakerTest {

    Matchmaker agent = new Matchmaker();

    @Test
    public void test22YearOldMale() {
        assertTrue(agent.isEligibleForMarriage(22, MALE));
    }

    @Test
    public void test19YearOldFemale() {
        assertTrue(agent.isEligibleForMarriage(19, FEMALE));
    }
}
