/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KARTOON
 */
public class Product {

    private String productName, productType;

    public Product() {
    }

    public Product(String productName, String productType) {
        this.productName = productName;
        this.productType = productType;
    }

    public String getProuctName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getStock() {
        char firstCha = this.productName.charAt(0);

        if ((firstCha >= 'a' && firstCha <= 'p') || (firstCha >= 'A' && firstCha <= 'P')) {
            if (this.productType.equalsIgnoreCase("toy")) {
                return "Stock to APTOY11";
            } else if (this.productType.equalsIgnoreCase("accessory")) {
                return "Stock to APACC12";
            } else if (this.productType.equalsIgnoreCase("bag")) {
                return "Stock to APBAG13";
            } else {
                return "Not Found";
            }
        } else if (this.productType.equalsIgnoreCase("toy")) {
            return "Stock to QZTOY18";
        } else if (this.productType.equalsIgnoreCase("accessory")) {
            return "Stock to QZACC19";
        } else if (this.productType.equalsIgnoreCase("bag")) {
            return "Stock to QZBAG20";
        } else {
            return "Not Found";
        }
    }

    @Override
    public String toString() {
        return "---Product---" + "\nProductName : " + productName
                + "\nProductType : " + productType + "\n" + getStock();
    }

}
