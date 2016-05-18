package org.abc.taxperson;

public class ItemCostCalculator {

	private static final double BASIC_TAX_RATE = 0.01;
	private static final double LUXURY_TAX_RATE = 0.09;

	private static final String BASIC_TAC_CAT = "B";
	private static final String LUXURT_TAX_CAT = "L";

	public static void main(String[] args) {
		double unitPrice = Double.valueOf(args[0]);
		String taxCategory = args[1];
		double itemCost = 0;

		System.out.println("Unit price of the item in cents: " + unitPrice);

		if (0 < unitPrice) {
			if (BASIC_TAC_CAT.equalsIgnoreCase(taxCategory)) {
				itemCost = calculateItemCost(unitPrice, BASIC_TAX_RATE);
				System.out.println("Tax rate of the item: " + BASIC_TAX_RATE);
			} else if (LUXURT_TAX_CAT.equalsIgnoreCase(taxCategory)) {
				itemCost = calculateItemCost(unitPrice, LUXURY_TAX_RATE);
				System.out.println("Tax rate of the item: " + LUXURY_TAX_RATE);
			} else {
				System.out.println("Invalid tax cateogory");
			}

			System.out.println("Total cost of the item in cents: " + itemCost);
		} else {
			System.out.println("Unit price of the item cannot be a negetive number");
		}

	}

	private static double calculateItemCost(double unitPrice, double taxRate) {

		return unitPrice + unitPrice * taxRate;
	}
}
