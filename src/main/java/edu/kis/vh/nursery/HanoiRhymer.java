package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer rozszerza DefaultCountingOutRhymer
 * i implementuje specjalne zachowanie dotyczące odrzucania liczb większych od szczytowego elementu stosu.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Licznik odrzuconych wartości.
     */
    private int totalRejected = 0;

    /**
     * Zwraca liczbę odrzuconych wartości.
     * @return  liczba odrzuconych wartości
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Przechowuje liczbę w strukturze, o ile nie jest większa niż obecna wartość na szczycie stosu.
     * Jeśli wartość jest większa, zostaje odrzucona i licznik odrzuceń zostaje zwiększony.
     * Jeśli stos jest pusty również wartość zostaje odrzucona i licznik odrzuceń zostaje zwiększony.
     * @param in wartość do wstawienia do struktury
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
