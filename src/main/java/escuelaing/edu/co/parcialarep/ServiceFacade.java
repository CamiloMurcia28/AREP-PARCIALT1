/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuelaing.edu.co.parcialarep;

import static java.lang.System.out;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 *
 * @author camilo.murcia-e
 */
public class ServiceFacade {
    
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=fb&apikey=Q1QZFVJQ21K7C6XM";
    
    private ReflexCalculator rc;    
    
    public static void main(String ... args) throws IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        
        Class c = ReflexCalculator.class;
        Class<?> cArg = Class.forName(args[1]);
        Constructor[] allConstructors = c.getDeclaredConstructors();
	    for (Constructor ctor : allConstructors) {
		Class<?>[] pType  = ctor.getParameterTypes();
		for (int i = 0; i < pType.length; i++) {
		    if (pType[i].equals(cArg)) {
			out.format("%s%n", ctor.toGenericString());

			Type[] gpType = ctor.getGenericParameterTypes();
			for (int j = 0; j < gpType.length; j++) {
			    char ch = (pType[j].equals(cArg) ? '*' : ' ');
			    out.format("%7c%s[%d]: %s%n", ch,
				       "GenericParameterType", j, gpType[j]);
			}
			break;
		    }
		}
        Method[] allMethods = c.getDeclaredMethods();
                  
        for(Method m : allMethods){
            m.invoke(null);
        }
        }
    }
}
