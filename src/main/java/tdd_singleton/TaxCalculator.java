package tdd_singleton;

import lombok.Setter;

public class TaxCalculator {


    @Setter
    private VatResolver vatResolver;

    public TaxCalculator(VatResolver vatResolver) {
        this.vatResolver = vatResolver;
    }

    public double afterVAT(double price) {

        double vat = vatResolver.getVat();
        return vat * price + price;
    }


}
