

Skip to content
Using GLA University Mail with screen readers

3 of 3,995
Fwd: EPAM Design pattern assignment
Inbox
x

HARSH SAXENA <harsh.saxena_ccv17@gla.ac.in>
Attachments
10:00 PM (52 minutes ago)
to me






This is the design pattern assignment of epam.
Create an repository in git and then upload these files and submit the link
 

this is the task submission link.

https://epa.ms/EPAMPEP2020TaskSubmission

 

6 Attachments

import java.util.HashMap; 
import java.util.Map; 
  
  
abstract class Color implements Cloneable 
{ 
      
    protected String colorName; 
       
    abstract void addColor(); 
       
    public Object clone() 
    { 
        Object clone = null; 
        try 
        { 
            clone = super.clone(); 
        }  
        catch (CloneNotSupportedException e)  
        { 
            e.printStackTrace(); 
        } 
        return clone; 
    } 
} 
  
class blueColor extends Color 
{ 
    public blueColor()  
    { 
        this.colorName = "blue"; 
    } 
   
    @Override
    void addColor()  
    { 
        System.out.println("Blue color added"); 
    } 
      
} 
  
class blackColor extends Color{ 
   
    public blackColor() 
    { 
        this.colorName = "black"; 
    } 
   
    @Override
    void addColor()  
    { 
        System.out.println("Black color added"); 
    } 
} 
   
class ColorStore { 
   
    private static Map<String, Color> colorMap = new HashMap<String, Color>();  
       
    static 
    { 
        colorMap.put("blue", new blueColor()); 
        colorMap.put("black", new blackColor()); 
    } 
       
    public static Color getColor(String colorName) 
    { 
        return (Color) colorMap.get(colorName).clone(); 
    } 
} 
  
  

class PrototypePatternDemo
{ 
    public static void main (String[] args) 
    { 
        ColorStore.getColor("blue").addColor(); 
        ColorStore.getColor("black").addColor(); 
        ColorStore.getColor("black").addColor(); 
        ColorStore.getColor("blue").addColor(); 
    } 
} 
PrototypePatternDemo.java
Displaying PrototypePatternDemo.java.
