package fileSystemLLD;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

	String directoryName;
	List<FileSystem> fileSystemList;
	
	public Directory(String name) {
		this.directoryName = name;
		fileSystemList = new ArrayList<>();
	}
	public void add(FileSystem obj) {
		fileSystemList.add(obj);
	}
	@Override
	public void ls() {
		System.out.println("\tDirectory Name " + directoryName );
		
		for (var fileSystem: fileSystemList) {
			fileSystem.ls();
		}
		
	}
}
