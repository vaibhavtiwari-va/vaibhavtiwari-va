package com.codeharry.shap;
public class cylinder extends shap{
    cylinder(int dim1, int dim2){
        super(dim1,dim2);
    }
    public double area(){
        return 2*Math.PI*this.dim1*( this.dim1+this.dim2);

    }

    
}
    

