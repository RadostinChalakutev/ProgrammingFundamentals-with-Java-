    package MapsLambdaandStreamAPI.excercise;

    import java.util.*;

    public class P06StudentAcademy {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            Map<String, ArrayList<Double>> studentsMap = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine();
                double grade = Double.parseDouble(scanner.nextLine());

                if (!studentsMap.containsKey(name)) {
                    studentsMap.put(name, new ArrayList<>());
                }
                studentsMap.get(name).add(grade);
            }
            Map<String, Double> studentAverageGrade = new LinkedHashMap<>(); //студентите ср. оценка >= 4.50
            //търсим среданата оценка на всички студенти
            for (Map.Entry<String, ArrayList<Double>> entry : studentsMap.entrySet()) {
                //entry -> име (String) + списък с оценки (list<double>)
                String studentName = entry.getKey();
                List<Double> grades = entry.getValue();
                double averageGrade = getAverageGrade(grades);
                if (averageGrade >= 4.50) {
                    studentAverageGrade.put(studentName, averageGrade);
                }
            }
            //print:
            for (Map.Entry<String, Double> entry : studentAverageGrade.entrySet()) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }


        }

        private static double getAverageGrade(List<Double> grades) {
            double sumGrade = 0;
            for (double grade : grades) {
                sumGrade += grade;
            }
            return sumGrade / grades.size();
        }
    }
