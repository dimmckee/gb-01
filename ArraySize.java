package HomeWork2;

public class ArraySize {
    static int getArray(String[][] OneArray) throws ArraySizeException,ArrayDataException {
        if(OneArray.length == 4 && OneArray[0].length == 4) {
            System.out.println("Array's length is correct");
        } else {
            throw new ArraySizeException("Array's length is not correct");
        }

        int sum = 0;
        if(OneArray.length != 4) {
            throw new ArraySizeException("Array's length is not correct");
        }

        for (int i=0;i<OneArray.length;i++) {
            if(OneArray[i].length != 4) {
                throw new ArraySizeException("Array's length is not correct");
            }
            for(int j=0;j<OneArray[i].length;j++) {
                try {
                    sum += Integer.parseInt(OneArray[i][j]);
                } catch (NumberFormatException m) {
                    throw new ArrayDataException("Wrong data in the cell "+i+"x"+j);
                }
            }
        }

        Integer[][] intArray = new Integer[OneArray.length][OneArray[0].length];
        int res=0;
        for(int i=0;i<OneArray.length;i++) {
            for (int j=0;j<OneArray[0].length;j++) {
                intArray[i][j] = Integer.parseInt(OneArray[i][j]);
                i++;
                res += intArray[i][j];
            }
        }
        return sum;
    }
}
