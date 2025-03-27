class FindRepeats {
    public static void main(String[] args) {
        int[] array = {10, 10, 20, 20, 30, 20, 40, 50};
        countOccurrences(array);
    }

    public static void countOccurrences(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        System.out.println("Repeated elements and their count:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
