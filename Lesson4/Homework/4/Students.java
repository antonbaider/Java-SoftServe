public class Students {
    public static void main(String[] args) {
        Faculty faculty = new Faculty(300, Season.Winter);
        System.out.println(faculty.toString());
    }

    public enum Season {
        Winter, Autumn, Spring, Summer;
    }

    public static class Faculty {
        int numberOfStudents = 0;
        String season;

        public Faculty(int numberOfStudents, Season season) {
            this.numberOfStudents = numberOfStudents;
            this.season = String.valueOf(season);
        }

        @Override
        public String toString() {
            return "Faculty " +
                    "number of students = " + numberOfStudents +
                    ", season is '" + season + '\'';
        }

        public int getNumberOfStudents() {
            return numberOfStudents;
        }

        public void setNumberOfStudents(int numberOfStudents) {
            this.numberOfStudents = numberOfStudents;
        }

        public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }
    }
}
