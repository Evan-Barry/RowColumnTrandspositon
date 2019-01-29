public class RowColumnTransposition {

    public static String encrypt(String plaintext, int numColumns)
    {
        String noSpaces = "";
        int numRows;
        int remainder;
        int numXs;
        String cipherText;
        int index;

        for(int i = 0; i < plaintext.length(); i++)//for loop to cycle through plaintext
        {
            if(Character.isLetter(plaintext.charAt(i)))//if a character in plaintext is not a space
            {
                noSpaces += plaintext.charAt(i);//add that character to a new string
            }
        }

        numRows = noSpaces.length() / numColumns;//assign numrows a value
        remainder = noSpaces.length() % numColumns;//assign remainder a value to see if a new row is needed

        if(remainder > 0)//if a remainder is present, add a new row
        {
            numRows++;
        }

        //System.out.println("Length: " + noSpaces.length());
        //System.out.println("Num Rows: " + numRows);
        //System.out.println("Remainder: " + remainder);

        numXs = numColumns - remainder;//assign numXs to the value of Xs needed

        //System.out.println(numXs);

        if(numXs < numColumns)//if the number of Xs needed is less than the amount of columns
        {
            for(int i = 0; i < numXs; i++)
            {
                noSpaces += 'x';//add X to string
            }
        }

        cipherText = "";//initiating ciphertext

        for(int c = 0; c < numColumns; c++)//cycle through each column
        {
            index = c;//set index to current row
            for(int r = 0; r < numRows; r++)//cycle through each row
            {
                cipherText += noSpaces.charAt(index);//add character at current index in noSpaces to ciphertext
                index += numColumns;//add the number of columns to index to jump down 1 row on
            }
        }

        return cipherText;
    }

    public static String decrypt(String plaintext, int numColumns)
    {
        int numRows = plaintext.length()/numColumns;//assign numRows a value
        //System.out.println(numRows);
        int index;
        String decipherText = "";

        for(int c = 0; c < numColumns; c++)//cycle through each column
        {
            index = c;//assign index to value of current column
            for(int r = 0; r < numRows; r++)//cycle through each row
            {
                decipherText += plaintext.charAt(index);//add character at this index of plaintext to deciphertext
                index += numColumns;//increment index by number of columns
            }
        }

        return decipherText;
    }
}
