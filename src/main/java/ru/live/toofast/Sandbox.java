package ru.live.toofast;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Sandbox {

    public static class User {
        long id;
        String name;
        String email;

        public User(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {

        Stream<String> lines = Files.lines(Paths.get("first.txt"));
        lines.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.err.println(s);
            }
        });
    }

}
