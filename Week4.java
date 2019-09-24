public class Week4 {
    public static int max2Int(int a, int b) {
        if(a > b) return a;
        else return b;
    }


    public static int minArray(int[] arr) {
        int tmp = arr[0];
        for(int i = 0; i < arr.length - 1; ++i)
        {
            if(arr[i] > arr[i + 1])
                tmp = arr[i + 1];
        }
        return tmp;
    }


    public static String calculateBMI(double weight, double height) {
        double BMI = weight/(height*height);
        if(BMI < 18.5) return "Thiếu cân";
        else if(BMI >= 18.5 && BMI < 23) return "Bình thường";
        else if(BMI >= 23 && BMI < 25) return "Thừa cân";
        else return "Béo phì";
    }
}
