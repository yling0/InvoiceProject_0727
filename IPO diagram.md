| INPUT                                                | PROCESSING                                                                       | OUTPUT                                                 |
| ---------------------------------------------------- | -------------------------------------------------------------------------------- | ------------------------------------------------------ |
|                                                      |                                                                                  | Prompt user for tax rate                               |
| Tax rate - input from user double taxRate)           |                                                                                  |                                                        |
|                                                      | Store Tax rate as taxRate/100                                                    |                                                        |
|                                                      |                                                                                  | Prompt user for product price                          |
| Prices - input from user (double price)              |                                                                                  |                                                        |
|                                                      | Store double price                                                               |                                                        |
|                                                      |                                                                                  | Prompt  user for product description                   |
| Product description - input from user (String descr) |                                                                                  |                                                        |
|                                                      | Store String descr                                                               |                                                        |
|                                                      |                                                                                  | Prompt user to enter another product (price and descr) |
|                                                      | If user chooses to continue, allow him/her to enter details again - price, descr |                                                        |
|                                                      | For each product entered:                                                        |                                                        |
|                                                      | Add the price of the item to totalAmount                                         |                                                        |
|                                                      |                                                                                  |                                                        |
|                                                      | If user chooses to not continue,                                                 |                                                        |
|                                                      | For each product entered calculate:                                              |                                                        |
|                                                      | Sum price of each item (add to totalAmount)                                      |                                                        |
|                                                      | taxAmount (taxRate/100*totalAmount)                                              |                                                        |
|                                                      | Apply taxAmount to totalAmount                                                   |                                                        |
|                                                      |                                                                                  | Display product desr, price, taxAmount, totalAmount    |
