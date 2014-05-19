package week2.day2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import helpers.StringHelper;

public class Task3 {

	public static void main(String[] args) throws IOException {
		String line = "aa vlksd ;lvkgfmbp wea";
		int res = StringHelper.countA(line);
		System.out.println("count a in string " + res);

		ZipOutputStream zop = new ZipOutputStream(new FileOutputStream(new File("f:/ccc.zip")));
		zop.putNextEntry(new ZipEntry("AAA"));
		
	}

}
