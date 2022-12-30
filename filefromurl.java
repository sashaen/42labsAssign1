package Downloadfilefromurl;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class filefromurl {

	public static void main(String[] args) {
		
		String link = "http://iiti.ac.in/people/~tanimad/JavaTheCompletereference.pdf";
		File out = new File("C://Users//Tanvy//Documents//JavaAssignment1B.pdf");
		try {
			URL url = new URL(link);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			double filesize = (double)http.getContentLength();
			BufferedInputStream in = new BufferedInputStream(http.getInputStream());
			FileOutputStream fos = new FileOutputStream(out);
			byte[] buffer = new byte[1024];
			double downloaded = 0.00;
			int read = 0;
			double percentDownload = 0.00;
			while((read = in.read(buffer, 0, 1024)) >= 0)
			{
				fos.write(buffer, 0, read);
				downloaded += read;
				percentDownload = (downloaded*100)/filesize;
				
				System.out.printf("Downloaded percent of file: %.2f", percentDownload);
			}
			fos.close();
			in.close();
			System.out.println("Download Complete");

		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}