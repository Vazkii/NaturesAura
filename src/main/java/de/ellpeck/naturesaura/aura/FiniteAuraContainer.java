package de.ellpeck.naturesaura.aura;

public class FiniteAuraContainer extends BasicAuraContainer {

    public FiniteAuraContainer(int aura, boolean artificial) {
        super(aura, artificial);
        this.aura = aura;
    }

    @Override
    public int storeAura(int amountToStore, boolean simulate) {
        return 0;
    }
}
