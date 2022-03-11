// Define your Question class here:
public class Question {
// integer correct Answer
int correctAnswer;
// integer playerAnswer
int playerAnswer;
//integer imageId
int imageId;
//store question text
String questionText;
//store answer 0
String answer0;
//store answer 1;
String answer1;
//store answer 2;
String answer2;
//store answer 3;
String answer3;
//Constructor Method
public Question(int imageIdentifier, String questionString, String answerZero, String answerOne, String answerTwo, String answerThree, int correctAnswerIndex){
imageId =  imageIdentifier;
questionText = questionString;
answer0 = answerZero;
answer1 = answerOne;
answer2 = answerTwo;
answer3 = answerThree;
correctAnswer = correctAnswer;

playerAnswer = - 1;
}

}
