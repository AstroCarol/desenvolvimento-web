package calc;

public class Calc
    {
        public Calc(){}
        
        int a;
        int b;
        public void setSoma(int a, int b)
        {
            this.a = a;
            this.b = b;
        }
 
        public int getSoma()
        {
            return  (a + b);
        }
      
        public void setSub(int a, int b)
        {
            this.a = a;
            this.b = b;
        }
        
        public int getSub()
        {
            return (a - b);
        }
        
        public void setMult(int a, int b)
        {
            this.a = a;
            this.b = b;
        }
    
        public int getMult()
        {
            return  (a * b);
        }
        
        public void setDiv(int a, int b)
        {
            this.a = a;
            this.b = b;
        }
        
        public int getDiv()
        {
            return  (a / b);
        }
    }
