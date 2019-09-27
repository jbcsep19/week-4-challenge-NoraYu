package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class InitRinner implements CommandLineRunner {
    @Autowired
    MessagepostRepository messagepostRepository;
    @Override
    public void run(String... args) throws Exception {
        Messagepost m;
        String t="Getting Started with Bootstrap";
        String c="Bootstrap is an HTML, CSS, JavaScript framework that you can use as basis for creating responsive web applications.";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);
        t="SPAN and DIV Tags";
        c="Span and Div\n" +
                "The <span> tag is used to group inline-elements in a document.\n" +
                "The <span> tag provides no visual change by itself.\n" +
                "The <span> tag provides a way to add a hook to a part of a text or a part of a document.\n";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);


        t="Abstract Classes";
        c="How to inherit an abstract class\n" +
                "To inherit your abstract class and all it's methods, etc... ";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);


        t="Interfaces";
        c="Interfaces allow you to specify that multiple classes implement some common functionality but they don't restrict you to how that functionality is implemented. ";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);


        t="HashMaps";
        c="Hashtables/HashMaps are Java objects which contain a collection of  values that can be found by keys. ";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);


        t="Designing Programs";
        c="Programmers need to have a good understanding of the data to be processed. This includes the data variables, constants and literals. It also includes elementary data items, data structures, files and data validation.";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);


        t="Algorithm";
        c="An algorithm represents the ordered sequence of steps required to solve a problem. ";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);


        t="Arrays";
        c="An array is a variable that allows you to use a single variable name to be associated with all instances of that variable.";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);


        t="Create a GitHub Account";
        c="There is no cost to creating an account.\n" +
                "\n" +
                "GitHub is a community where developers can discover, reuse, and contribute to projects.";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);


        t="Clone an Existing Repository";
        c= "To clone the git project on your computer:\n" +
                "You now have the git source code on your computer.";
        m=new Messagepost(t,c);
        messagepostRepository.save(m);


}
}
