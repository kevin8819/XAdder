import java.io.File;
//import javax.swing.JFileChooser;

public class XAdder
{
	public static void main(String[] args)
	{
		// Uses JFileChooser to select a directory and rename files
		/*
		JFileChooser chooser = new JFileChooser();
		chooser.setMultiSelectionEnabled(true);
		
		File[] filesList;
		
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
			filesList = chooser.getSelectedFiles();
			
			for(int i = 0; i < filesList.length; i++)  
			{  
				StringBuilder parentDirectory = new StringBuilder(filesList[i].getParent());
				StringBuilder fileName = new StringBuilder(filesList[i].getName());
				fileName.insert(1, 'x');
				File file = new File(parentDirectory.toString() + "\\" + fileName.toString());
				//System.out.println(file.getName());
				filesList[i].renameTo(file);
			}
		}
		*/
		
		// Creates a runnable .jar to rename stuff in current directory
		File dir = new File(".");
		File[] filesList = dir.listFiles();
		
		for(int i = 0; i < filesList.length; i++)
		{
			StringBuilder parentDirectory = new StringBuilder(filesList[i].getParent());
			StringBuilder fileName = new StringBuilder(filesList[i].getName());
			fileName.insert(1, 'x');
			File file = new File(parentDirectory.toString() + "\\" + fileName.toString());
			//System.out.println(file.getName());
			filesList[i].renameTo(file);
		}
	}
}