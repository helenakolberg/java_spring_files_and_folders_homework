package com.codeclan.example.filesfolders.components;

import com.codeclan.example.filesfolders.models.File;
import com.codeclan.example.filesfolders.models.Folder;
import com.codeclan.example.filesfolders.models.User;
import com.codeclan.example.filesfolders.repositories.FileRepository;
import com.codeclan.example.filesfolders.repositories.FolderRepository;
import com.codeclan.example.filesfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User helena = new User("Helena");
        Folder javaFolder = new Folder("java_stuff", helena);
        File helenasJavaFile = new File("pirates", "java", 22, javaFolder);

        User tim = new User("Tim");
        Folder rubyFolder = new Folder("ruby_things", tim);
        File timsRubyFile = new File("cool_ruby_app", "ruby", 24, rubyFolder);

    }


}
