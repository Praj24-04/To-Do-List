import java.util.ArrayList;
import java.util.Scanner;

public class ToDo_List
{
private ArrayList<String> tasks;
public ToDo_List()
{
tasks = new ArrayList<>();
}

public void addTask(String task)
{
tasks.add(task);
System.out.println("Task added: " + task);
}

public void removeTask(int index)
{
if (index >= 0 && index < tasks.size())
{
String dltTask = tasks.remove(index);
System.out.println("Task removed: " + dltTask);
}
else
{
System.out.println("Invalid task index");
}
}

public void displayTasks()
{
System.out.println("Tasks:");
for (int i = 0; i < tasks.size(); i++)
{
System.out.println((i + 1) + ". " + tasks.get(i));
}
}

public void markDone(int index)
{
if (index >= 0 && index < tasks.size())
{
String task = tasks.get(index);
tasks.set(index, "[*] " + task);
System.out.println("Task marked as done: " + task);
}
else
{
System.out.println("Invalid task index");
}
}

public static void main(String[] args)
{
ToDo_List check = new ToDo_List();
Scanner taskk= new Scanner(System.in);

while (true)
{
System.out.println("\n YOUR TO-DO CHECKLIST:");
System.out.println("1. Add Task");
System.out.println("2. Remove Task");
System.out.println("3. Display Tasks");
System.out.println("4. Mark Task as Done");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");

int choice = taskk.nextInt();
                      taskk.nextLine();

switch (choice)
{
case 1:
System.out.print("Enter task to add: ");
String taskAdd = taskk.nextLine();
check.addTask(taskAdd);
break;

case 2:
System.out.print("Enter index of task to remove: ");
int indexRemove = taskk.nextInt() - 1;
check.removeTask(indexRemove);
break;

case 3:
check.displayTasks();
break;

case 4:
System.out.print("Enter index of task to mark as done: ");
int indexMarkDone = taskk.nextInt() - 1;
check.markDone(indexMarkDone);
break;


case 5:
System.out.println("Signed off from To-Do list!");
System.exit(0);

default:
System.out.println("Invalid choice");
}
}
}
}
