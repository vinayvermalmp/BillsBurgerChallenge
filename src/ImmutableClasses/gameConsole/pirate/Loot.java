package ImmutableClasses.gameConsole.pirate;

public enum Loot {
    SILVER_COIN(5),
    GOLD_COIN(10),
    GOLD_RING(125),
    PERL_NECKLESS(250),
    GOLD_BAR(500);

    private final int worth;

    Loot(int worth) {
        this.worth = worth;
    }

    public int getWorth() {
        return worth;
    }
}
