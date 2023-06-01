// package com;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class GradeLibrary {
	public boolean writeString( String contentToWrite, String fileName ) {
		BufferedWriter writer = null;
        try {
            //create a temporary file
            File createdFile = new File( fileName );

            writer = new BufferedWriter(new FileWriter( createdFile,true ) );
            writer.write( contentToWrite );
            writer.newLine();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            	return false;
            }
        }
	}
}