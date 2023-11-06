public class StudStatistics {
    public static void main(String[] args) {
        // Step a: Declare and initialize the studentData string
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";

        // Step b: Split the studentData string into an array of individual student records
        String[] records = studentData.split(", ");

        // Step c: Create arrays to store student names and scores
        String[] names = new String[records.length];
        int[] scores = new int[records.length];

        // Step d: Populate the arrays with data from the split records
        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(":");
            names[i] = record[0];
            scores[i] = Integer.parseInt(record[1]);
        }

        // Calculate and display the statistics
        int totalStudents = names.length;
        int totalScore = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        String highestScorer = "";
        String lowestScorer = "";

        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i];

            if (scores[i] > highestScore) {
                highestScore = scores[i];
                highestScorer = names[i];
            }

            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
                lowestScorer = names[i];
            }
        }

        double averageScore = (double) totalScore / totalStudents;

        // Display the statistics
        System.out.println("Total number of students: " + totalStudents);
        System.out.println("Average score of all students: " + averageScore);
        System.out.println("Highest score: " + highestScore + " by " + highestScorer);
        System.out.println("Lowest score: " + lowestScore + " by " + lowestScorer);
    }
}