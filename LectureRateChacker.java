import java.util.Scanner;
public class LectureRateChacker{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
//User inputs
System.out.println("===================================");
System.out.println("Program to chack Price per Lecture");
System.out.println("===================================");

// checking if the user is paying monthly or smasterly
String UserInstitute;
System.out.print("Are you a univerity or School student (uni / school): ");
while(true){
   UserInstitute = sc.nextLine().toLowerCase();
if(UserInstitute.equals("uni") || UserInstitute.equals("school")){
break;
}else{
System.out.print("\nPlease Enter one of these values (uni / school): ");
}
}


//get the amout user is paying to his institute
int UserPayingFees;
System.out.print("\nHow much fees are you paying to your instetute: ");
while(true){
if(sc.hasNextInt()){
UserPayingFees = sc.nextInt();
if(UserPayingFees > 0 ){
break;
}else{
System.out.print("\nPlease Enter valid amount : ");
sc.next();
}
}
}

// this will run if the user is a uni student
if(UserInstitute.equals("uni")){

int TotalLecturesInWeek;
System.out.print("\nHow many lectures do you have in one week: ");
while(true){
if(sc.hasNextInt()){
TotalLecturesInWeek = sc.nextInt();
if(TotalLecturesInWeek > 0 ){
break;
}else{
System.out.print("\nPlease Enter valid amount : ");
sc.next();
}
}
}
double FullDegreeFees = UserPayingFees * 8 ; 
double FeePerMonth = UserPayingFees / 6 ;
double FeePerWeek = FeePerMonth / 4 ; 
double FeePerDay = FeePerWeek / (7 - 3) ; 
double FeePerLecture = FeePerWeek / TotalLecturesInWeek;
double FeePerHour = FeePerLecture / 1.5;


System.out.printf("Full degree fees (8 semesters): %.2f\n", FullDegreeFees);
System.out.printf("Fee per month: %.2f\n", FeePerMonth);
System.out.printf("Fee per week: %.2f\n", FeePerWeek);
System.out.printf("Fee per day (4 study days in week): %.2f\n", FeePerDay);
System.out.printf("Fee per lecture: %.2f\n", FeePerLecture);
System.out.printf("Fee per hour (1.5 hr per lecture): %.2f\n", FeePerHour);
}else{
// this will run if the user is a school student

double FeePerMonth = UserPayingFees;
double FeePerWeek = FeePerMonth / 4 ; 
double FeePerDay = FeePerWeek / (7 - 1) ; 
double FeePerHour = FeePerDay / 6.5;


System.out.printf("Fee per month: %.2f\n", FeePerMonth);
System.out.printf("Fee per week: %.2f\n", FeePerWeek);
System.out.printf("Fee per day (6 study days in week): %.2f\n", FeePerDay);
System.out.printf("Fee per hour (6.5 hours in day): %.2f\n", FeePerHour);
}





}
}