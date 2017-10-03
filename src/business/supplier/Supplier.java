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
public class Supplier {
  private SupplierType supplierType;
  private String supplierName;
  
  public Supplier(String supplierName,SupplierType supplierType){
  this.supplierType=supplierType;
  this.supplierName=supplierName;
  }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public SupplierType getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(SupplierType supplierType) {
        this.supplierType = supplierType;
    }
    
    public enum SupplierType {
        FoodSupplier("FoodSupplier"), EducationMaterialSupplier("EducationMaterialSupplier"), MedicineSupplier("MedicineSupplier"), ShelterSupplier("ShelterSupplier");
        private String value;

        private SupplierType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
         @Override
        public String toString() {
            return value;
        }

    }
    
    
}
