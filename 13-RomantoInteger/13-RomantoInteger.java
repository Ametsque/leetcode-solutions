// Last updated: 29/04/2025, 13:30:30
class Solution {
    public int romanToInt(String s) {
        char[] stringChars = s.toCharArray();
        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < stringChars.length; i++){
            if (skip){
                skip = false;
                continue;
            }
            switch(stringChars[i]){
                case 'I':
                if ((i+1) == stringChars.length){
                    sum+= 1;
                    continue;
                }
                    if (stringChars[i+1] == 'V'){
                        sum += 4;
                        skip = true;
                    } else if (stringChars[i+1] == 'X'){
                        sum += 9;
                        skip = true;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'X':
                if ((i+1) == stringChars.length){
                    sum+= 10;
                    continue;
                }
                    if (stringChars[i+1] == 'L'){
                        sum += 40;
                        skip = true;
                    } else if (stringChars[i+1] == 'C'){
                        sum += 90;
                        skip = true;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'C':
                if ((i+1) == stringChars.length){
                    sum+= 100;
                    continue;
                }
                    if (stringChars[i+1] == 'D'){
                        sum += 400;
                        skip = true;
                    } else if (stringChars[i+1] == 'M'){
                        sum += 900;
                        skip = true;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                case 'D':
                    sum += 500;
                    break;
            }
        }
        return sum;
    }
}