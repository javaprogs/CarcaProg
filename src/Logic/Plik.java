/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Plik {

    public boolean save(int[] tab) throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
        for (int i = 0; i < tab.length; i++) {
            writer.println(tab[i]);
        }
        writer.close();
        return true;

    }

    public int[] load() throws FileNotFoundException {
        int i = 0;
        int tab[] = new int[30];

        File file = new File("the-file-name.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            
            tab[i] = Integer.parseInt(scanner.nextLine());
            System.out.println(tab[i]);
            i++;
            
        }
        scanner.close();

        return tab;

    }
}
