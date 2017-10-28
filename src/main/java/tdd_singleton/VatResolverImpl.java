package tdd_singleton;

import lombok.Getter;

public class VatResolverImpl implements VatResolver {
    @Getter
    private final double vat;

    public VatResolverImpl() {
        // some code which goes to some website and takes the vat volume
        vat = 0.1;
    }


}
