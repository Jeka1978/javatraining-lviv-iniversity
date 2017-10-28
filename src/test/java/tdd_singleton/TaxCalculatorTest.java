package tdd_singleton;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class TaxCalculatorTest {
    @Test
    public void afterVAT() throws Exception {

        VatResolver vatResolver = Mockito.mock(VatResolver.class);
        Mockito.when(vatResolver.getVat()).thenReturn(0.2);
        System.out.println(vatResolver.getVat());

        TaxCalculator taxCalculator = new TaxCalculator(vatResolver);
        double afterVAT = taxCalculator.afterVAT(100);
        Assert.assertEquals(afterVAT,120,0.0001);
    }

}