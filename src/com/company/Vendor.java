package com.company;

/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
  // Fields:
  private int price, stock, currMoney;
  private static double sales;

  /**
   * Constructs a Vendor
   * @param p the price of a single item in cents (int)
   * @param s number of items to place in stock (int)
   */
  public Vendor(int p, int s)
  {
    price = p;
    stock = s;
    currMoney = 0;
  }
  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int qty)
  {
    stock = qty;
  }
  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  public int getStock()
  {
    return stock;
  }
  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int number)
  {
    currMoney+=number;
  }
  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit()
  {
    return currMoney;
  }
  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock
   * and calculates and sets change and returns true;
   * otherwise refunds the whole deposit (moves it into
   * change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale()
  {
    if(currMoney >= price && stock != 0){
      currMoney-=price;
      sales+=price;
      stock--;
      return true;
    }else{return false;}
  }
  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
  public int getChange()
  {
    int currChange = currMoney;
    currMoney = 0;
    return currChange;
  }

  public static double getTotalSales()
  {
     return sales/100;
  }
}
