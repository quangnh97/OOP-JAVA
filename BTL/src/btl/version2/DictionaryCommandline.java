  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl.version2;

import btl.version2.Dictionary;
import btl.version2.DictionaryManagement;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author QUANG
 */
public class DictionaryCommandline {

    public void dictionarybasic() throws IOException {
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile();
        //insertFromCommandline();
        dm.showAllWords();
        
       // Word word = new Word()
        while (true) {
            this.showMenu();
            Scanner sc = new Scanner(System.in);
            String action = sc.nextLine();
            if (action.equals("1")) {//tim kiem
                System.out.println("Nhap tu can tim kiem: ");
                String key = sc.nextLine();

                dm.showWords(dm.dictionaryLookup(key));
            }
            if (action.equals("2"))//thêm
            {
                
            }
            if (action.equals("3"))//sửa
            {

            }
            if (action.equals("4"))//xóa
            {

            }
            if (action.equals("5"))//hien thị
            {

            }
            if (action.equals("6"))//thoat
            {
                break;
            }
        }

    }

    private void showMenu() {
        System.out.println("-- menu --");
        System.out.println("1: tim kiem");
        System.out.println("");
        System.out.println("Nhap so :");
    }
}
