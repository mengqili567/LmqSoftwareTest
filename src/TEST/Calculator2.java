package TEST;

public class Calculator2 //被测试类
{
    public int result=0;
    public int add2(int operand1,int operand2){
        result=operand1+operand2;   //将两个传入参数进行相加操作
        return result;
    }
    public  int subtract2(int operand1,int operand2){
        result=operand1-operand2;   //将两个传入参数进行相减操作
        return  result;
    }
    public int multipe2(int operand1,int operand2){
        return result=operand1*operand2;   //将两个传入参数进行相乘操作
        /*for(;;){                    //死循环
        }*/
    }
    public int divide2(int operand1,int operand2){
        result=operand1/operand2;      //除法操作
        return result;
    }
    public int getResult2(){
        return this.result;     //返回计算结果
    }

}
