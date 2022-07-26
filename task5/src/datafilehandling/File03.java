package datafilehandling;

import java.io.*;



public class File03 {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("data/The Return of Tarzan.txt"));

		r.lines().map(l -> l.toLowerCase()).forEach(l -> System.out.println(l));

		r.close();
	}

}
