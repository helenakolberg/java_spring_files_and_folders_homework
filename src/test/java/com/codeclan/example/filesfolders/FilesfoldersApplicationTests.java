package com.codeclan.example.filesfolders;

import com.codeclan.example.filesfolders.models.File;
import com.codeclan.example.filesfolders.models.Folder;
import com.codeclan.example.filesfolders.models.User;
import com.codeclan.example.filesfolders.repositories.FileRepository;
import com.codeclan.example.filesfolders.repositories.FolderRepository;
import com.codeclan.example.filesfolders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesfoldersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void create() {
		User helena = new User("Helena");
		userRepository.save(helena);

		Folder javaFolder = new Folder("java_stuff", helena);
		folderRepository.save(javaFolder);

		File helenasJavaFile = new File("pirates", "java", 22, javaFolder);
		fileRepository.save(helenasJavaFile);
	}


}
