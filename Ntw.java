import java.util.*;
public class Ntw {
    public static void main(String[] arg){
       Scanner sc=new Scanner(System.in);
       String num=sc.next(),d1[]={"zero","one","two","three","four","five","six","seven","eight","nine"},d2[]={"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
       String d3[]={"","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
       String d4[]={"","hundered","thousand","lakhs","crore"};
       int l=num.length();
       for(int i=0;i<num.length();i++){
        char c=num.charAt(i);
  
        if(l==1){
            System.out.print(d1[num.charAt(l-1)-'0']);
        }
        //eleven
        if(l>1&&i==l-2&&(num.charAt(i)=='1')&&(num.charAt(i+1)>='1'&&num.charAt(i+1)<='9')){
            System.out.print(d3[num.charAt(l-1)-'0']+" ");
            i++;
        }
        //ten
        else if(l>1&&i==l-2&&(num.charAt(i)>='1'&&num.charAt(l-2)<='9')){
            if(num.charAt(i+1)=='0'){
                System.out.print(d2[num.charAt(l-2)-'0']);
                i++;
            }
            else if(num.charAt(i+1)>='1'&&num.charAt(i+1)<='9'){
                System.out.print(d2[num.charAt(l-2)-'0']+" "+d1[num.charAt(i+1)-'0']);
                i++;
            }
            
            
            //hundred
        }
        else if(i==l-3&&num.charAt(i)!='0'){
            System.out.print(d1[num.charAt(i)-'0']+" "+d4[1]+" ");
        }
        
        
        //10's thousand and 11's thousand
        else if(l>1&&i<l-3&&((l-i-1)%2==0&&num.charAt(i)>='1'&&num.charAt(i)<='9')){
            if(num.charAt(i+1)=='0'){
                System.out.print(d2[num.charAt(i)-'0']+" "+d4[(l-i-1)/2]+" ");
                i++;
            }
            else if(num.charAt(i)!='1'&&(num.charAt(i+1)>='1'&&num.charAt(i+1)<='9')){
                System.out.print(d2[num.charAt(i)-'0']+" "+d1[num.charAt(i+1)-'0']+" "+d4[(l-i-1)/2]+" ");
                i++;
            }
            else if(num.charAt(i)=='1'&&(num.charAt(i+1)>='1'&&num.charAt(i+1)<='9')){
                System.out.print(d3[num.charAt(i+1)-'0']+" "+d4[(l-i-1)/2]+" ");
                i++;
            }
            
            
        }
        else if(l%2==0&&l>3&&i<l-3&&(l-i-1)%2==1&&num.charAt(i)!='0'){
            System.out.print(d1[num.charAt(i)-'0']+" "+d4[(l-i)/2]+" ");
        }
        else if((i<num.length()-1&&num.charAt(i)!='0'&&num.charAt(i+1)!='0')){
            System.out.print(d1[c-'0']);
        }
       }
       if(l!=1&&num.charAt(l-2)=='0'&&(num.charAt(l-1)>='1'&&num.charAt(l-1)<='9')){
           System.out.print(d1[num.charAt(l-1)-'0']);
       }
      // System.out.print(l-3);
    }
}
