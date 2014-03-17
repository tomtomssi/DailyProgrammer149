/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogrammer149;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatu
 */
public class DailyProgrammer149 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] mInput = "all those who believe in psychokinesis raise my hand".toCharArray();
        List<Character> mOutput = new ArrayList();
        List<Character> mExtractedVowels = new ArrayList();
        for (int i = 0; i < mInput.length; ++i) {
            switch (mInput[i]) {
                case 'a':
                    mExtractedVowels.add(mInput[i]);
                    break;
                case 'e':
                    mExtractedVowels.add(mInput[i]);
                    break;
                case 'i':
                    mExtractedVowels.add(mInput[i]);
                    break;
                case 'o':
                    mExtractedVowels.add(mInput[i]);
                    break;
                case 'u':
                    mExtractedVowels.add(mInput[i]);
                    break;
                default:
                    mOutput.add(mInput[i]);
                    break;
            }
        }
        System.out.println("Modified text:");
        for (int i = 0; i < mOutput.size(); ++i) {
            System.out.print(mOutput.get(i));
        }
        System.out.println("\nExtracted Vowels:");
        for (int i = 0; i < mExtractedVowels.size(); ++i) {
            System.out.print(mExtractedVowels.get(i));
        }
        System.out.println();
    }

}
