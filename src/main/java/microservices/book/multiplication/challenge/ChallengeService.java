package microservices.book.multiplication.challenge;

public interface ChallengeService {

    /**
     * Verifies if an attempt comming from the presentation layer is correct or not.
     *
     * @return the resulting ChallengeAttempt object
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
}
