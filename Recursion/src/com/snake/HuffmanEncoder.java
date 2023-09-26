package com.snake;
import java.io.*;
import java.util.*;

class HuffmanNode implements Comparable<HuffmanNode> {
    char data;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return this.frequency - other.frequency;
    }
}

public class HuffmanEncoder {

    public static void compress(String inputFilePath, String outputFilePath) throws IOException {
        FileInputStream fis = new FileInputStream(inputFilePath);
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFilePath));

        int[] frequency = new int[256];
        int totalChars = 0;

        int currentByte;
        while ((currentByte = fis.read()) != -1) {
            frequency[currentByte]++;
            totalChars++;
        }

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                pq.offer(new HuffmanNode((char) i, frequency[i]));
            }
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode merged = new HuffmanNode('\0', left.frequency + right.frequency);
            merged.left = left;
            merged.right = right;
            pq.offer(merged);
        }

        HuffmanNode root = pq.poll();
        Map<Character, String> huffmanCodes = new HashMap<>();
        buildHuffmanCodes(root, "", huffmanCodes);

        dos.writeInt(totalChars);
        dos.writeInt(huffmanCodes.size());

        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            dos.writeChar(entry.getKey());
            dos.writeUTF(entry.getValue());
        }

        fis.close();
        fis = new FileInputStream(inputFilePath);

        StringBuilder encodedBits = new StringBuilder();
        while ((currentByte = fis.read()) != -1) {
            encodedBits.append(huffmanCodes.get((char) currentByte));
        }

        fis.close();

        while (encodedBits.length() % 8 != 0) {
            encodedBits.append('0');  // Pad with zeroes
        }

        for (int i = 0; i < encodedBits.length(); i += 8) {
            String byteStr = encodedBits.substring(i, i + 8);
            dos.writeByte(Integer.parseInt(byteStr, 2));
        }

        dos.close();
    }

    private static void buildHuffmanCodes(HuffmanNode root, String currentCode, Map<Character, String> huffmanCodes) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.data, currentCode);
            return;
        }

        buildHuffmanCodes(root.left, currentCode + "0", huffmanCodes);
        buildHuffmanCodes(root.right, currentCode + "1", huffmanCodes);
    }

    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "compressed.huf";

        try {
            compress("C:\\Users\\Vikash Sharma\\Downloads\\IMG-20230615-WA0001.jpg", "C:\\Users\\Vikash Sharma\\Desktop\\CVENT");
            System.out.println("Compression completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

