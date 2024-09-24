package libManagementSystem;

public class dummy {

    public int hashfunction1(Integer num) {
        int key = num % 13;
        return key;
    }

    public int[] linearProbing(int[] input) {

        int[] output = new int[100];
        for (int i : input) {
            int key = hashfunction1(i);
            if (output[key] != 0) {
                while (output[key] != 0) {
                    key++;
                }
                output[key] = i;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = { 18, 41, 22, 44, 59, 32, 31 };
        
    }
}
