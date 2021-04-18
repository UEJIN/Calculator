package com.example.calculator;

import static com.example.calculator.Operator.add;
import static com.example.calculator.Operator.div;
import static com.example.calculator.Operator.multi;
import static com.example.calculator.Operator.sub;

public class Calc {

    int iCalcNum1;
    int iCalcNum2;
    int iOutputNum;
    int iCalcOpeFlag;

    public Calc (int iNum1, int iNum2, int iFlag){

        this.iCalcNum1=iNum1;
        this.iCalcNum2=iNum2;
        this.iCalcOpeFlag=iFlag;

    }

    String strCalcNum (){

        switch(iCalcOpeFlag){
            case add:
                this.iOutputNum = this.iCalcNum1 + this.iCalcNum2;
                break;
            case sub:
                this.iOutputNum = this.iCalcNum1 - this.iCalcNum2;
                break;
            case multi:
                this.iOutputNum = this.iCalcNum1 * this.iCalcNum2;
                break;
            case div:
                if(this.iCalcNum2!=0) {
                    this.iOutputNum = this.iCalcNum1 / this.iCalcNum2;
                }
                break;
        }



        return String.valueOf(this.iOutputNum);
    }



}
