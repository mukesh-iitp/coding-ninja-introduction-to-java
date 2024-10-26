package recursion;

public class BinarySearch {
	
	public static String replaceChar(String s,char a,char b){
        if(s.length()==0){
            return s;
        }
        String smallOutput=replaceChar(s.substring(1),a,b);
        if(s.charAt(0)==a){
            return b+smallOutput;
        }else{
            return s.charAt(0)+smallOutput;
        }
    }
    public static String replacePi(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            //Call recursion on string of length n-2;
            String smallOutput=replacePi(s.substring(2));
            return "3.14"+smallOutput;
        }else{
            //call recursion on string of length n-1;
            String smallOutput=replacePi(s.substring(1));
            return s.charAt(0)+smallOutput;
        }
    }
    public static int binarySearch(int a[],int si,int ei,int x){
        if(si>ei){
            return -1;
        }
        int midIndex=(si+ei)/2;
        if(a[midIndex]==x){
            return midIndex;
        }else if(a[midIndex]<x){
            return binarySearch(a,midIndex+1,ei,x);
        }else{
            return binarySearch(a,si,midIndex-1,x);
        }
    }
    public static void main(String[] args){
        //System.out.println(replaceChar("abcxdxex",'x','y'));
        //System.out.println(replacePi("apiapipipiip"));
        int[] a={1,3,4,5,6,8};
        System.out.println(binarySearch(a,0,a.length-1,8));
    }

}
