# Roommate-Compatibility-Program
Create a program that will read a list of students. The program will read and score the compatibility of potential roommates. This program will not compare opposite sexs.
This project is a roommate compatibility program using 4 classes.

Student Class: This class stores the  following instance variables about a person.
  name: string type to store the student name
  gender: "M" or "F"
  birthdate: student's birtdate
  pref: instance of the Preference class
  matched: bool variable to see if there is a match

Date Class: Simple date class to store a date
  year: int range 1900 to 3000
  month: int range 1 - 12
  day: int range 1-31
  Also has a method compare(Date dt) that returns the difference between current date in the class and the dt parameter.


Preference Class: This class keep tracks of the preferences of the student of the following activities (range 0-10: 0 hates and 10 loves)
  quietTime, music, reading and chatting


Match Class: This class handles the matching between the given list of students. Simple algorithm as shown below
  
  
  
  For each student NOT currently matched
  
    For each rest of students NOT currently matched
        currentScore = studentA.compare(studentB)
        if the currentScore is better than  MaxScore
          bestMatchStudent is student
          bestMatchScore is currentScore
          
    studentA is now Matched 
    bestMatchStudent is now Matched
