package ch.heigvd.res.chill.domain.junodch;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Coffee implements IProduct {

  public final static String NAME = "Coffee";
  public final static BigDecimal PRICE = new BigDecimal(2.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
