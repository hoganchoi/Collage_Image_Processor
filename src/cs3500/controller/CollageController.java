package cs3500.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import cs3500.model.CollageModel;

/**
 * An interface that represents all controller classes (text based and graphical user based).
 */
public interface CollageController {
  void startProgram(Scanner sc) throws IllegalArgumentException;

  void addImageToLayer(String currentLayer, String filePath, int x, int y) throws IOException;

  void setFilter(String currentLayer, String filter);

  void addLayer(String text);

  void saveProject(String absolutePath) throws IOException;

  void saveImage(String absolutePath) throws IOException;

  void loadProject(String absolutePath);

  void newProject(int height, int width);

  int getHeight();

  int getWidth();

  CollageModel getModel();

  ArrayList<String> getLayerNames();
}
