package com.example.calculator;

public class Calc {

    int iCalcNum1;
    int iCalcNum2;
    int iOutputNum;
    int iCalcOpeFlag;

    String strOutputNum="";


    public Calc (int iNum1, int iNum2, int iFlag){

        this.iCalcNum1=iNum1;
        this.iCalcNum2=iNum2;
        this.iCalcOpeFlag=iFlag;

    }

    String CalcNum (){

        switch(iCalcOpeFlag){
            case 1:
                this.iOutputNum = this.iCalcNum1 + this.iCalcNum2;
                break;
            case 2:
                this.iOutputNum = this.iCalcNum1 - this.iCalcNum2;
                break;
            case 3:
                this.iOutputNum = this.iCalcNum1 * this.iCalcNum2;
                break;
            case 4:
                if(this.iCalcNum2!=0) {
                    this.iOutputNum = this.iCalcNum1 / this.iCalcNum2;
                }
                break;
        }

        this.strOutputNum = String.valueOf(this.iOutputNum);

        return this.strOutputNum;

    }



}
