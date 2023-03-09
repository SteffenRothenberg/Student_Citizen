public class Main {

        public static void main(String[] args) {

                BiologyStudent myStudent = new BiologyStudent(123,"Street 1","Name1");
                ComputerScienceStudent myStudentTwo = new ComputerScienceStudent(234,"Street 2","Name2");
                System.out.println(myStudent);
                System.out.println(myStudentTwo);
                Citizen myCitizen = new ComputerScienceStudent(123, "Street3", "Name3");
                System.out.println(myCitizen);
                Student myFirstSuperStudent = new BiologyStudent(890, "Street4", "Name4");
                System.out.println(myFirstSuperStudent);
                System.out.println(myStudent.getNameAndAddress());
                System.out.println(myStudentTwo.getNameAndAddress());
                myStudentTwo.setName("NameLess");
                System.out.println(myStudentTwo.getName());

                Student expertiseTestOne = new BiologyStudent();
                System.out.println(expertiseTestOne.areaOfExpertise());
                Student expertiseTestTwo = new ComputerScienceStudent();
                System.out.println(expertiseTestTwo.areaOfExpertise());
                System.out.println(expertiseTestOne.areaOfExpertise());
                System.out.println(expertiseTestTwo.areaOfExpertise());
        }
}
