package agh.po.lab3;



public class CodingBat {

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.sleepIn(true, false));
        System.out.println(cb.loneTeen(14,67));
        System.out.println(cb.helloName("Boron"));
        System.out.println(cb.firstLast6(new int[]{1,2,3,4,6}));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
    public String helloName(String name) {
        return ("Hello " + name + "!");
    }
    public boolean firstLast6(int[] nums) {
        if ((nums[0] == 6) || (nums[nums.length-1] == 6)){
            return true;
        }
        return false;
    }



}




