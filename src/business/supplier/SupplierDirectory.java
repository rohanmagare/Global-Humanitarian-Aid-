/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.supplier;

import business.supplier.Supplier.SupplierType;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SupplierDirectory {
    private ArrayList<Supplier> SupplierList;
    public SupplierDirectory ()
    {
      SupplierList = new ArrayList<>();
    }
    public ArrayList<Supplier> getSupplierList() {
        return SupplierList;
    }

    public void setSupplierList(ArrayList<Supplier> SupplierList) {
        this.SupplierList = SupplierList;
    }
    
    /**
     * This Function creates a supplier of a given type of given name
     * E.g. Food Supplier for a NGO enterprise.
     */
    public Supplier createSupplier(String supplierName,SupplierType supplierType){
    Supplier supplier;
    if(supplierType==SupplierType.EducationMaterialSupplier)
        supplier=new EducationSupplier(supplierName);
    else if(supplierType==SupplierType.FoodSupplier)
        supplier= new EducationSupplier(supplierName);
    else if(supplierType==SupplierType.MedicineSupplier)
        supplier= new MedicineSupplier(supplierName);
    else 
        supplier= new ShelterSupplier(supplierName);
        
    return supplier;
    }
    
    
}
