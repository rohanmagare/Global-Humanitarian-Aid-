/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.supplier;

/**
 *
 * @author Admin
 */
public class FoodSupplier extends Supplier{
    
    public FoodSupplier(String supplierName) {
        super(supplierName, SupplierType.FoodSupplier);
    }
    
}
