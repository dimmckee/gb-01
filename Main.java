package HomeWork2;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        for(int i=0; i< array.length; i++){
            for(int j=0;j < array[i].length; j++){
                array[i][j]="Str"+j;
                java.lang.System.out.print(array[i][j]+" ");
            }
            java.lang.System.out.println();
        }

        try {
            try {
                int sum = ArraySize.getArray(array);
            } catch (ArraySizeException m) {

                java.lang.System.out.println(m.getMessage());
            }
        } catch (ArrayDataException m) {
            java.lang.System.out.println(m.getMessage());
        }

    }
}
