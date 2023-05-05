package cs3500.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import cs3500.model.CollageModel;

/**
 * An interface that represents all controller classes (text based and graphical user based).
 */
public interface CollageController {
  /**
   * Starts the entire program. Creates a new ImageModel.
   * @param sc A scanner that intakes all the user's inputs.
   * @throws IllegalArgumentException Thrown if inputs are out of bounds.
   */
  void startProgram(Scanner sc) throws IllegalArgumentException;

  /**
   * Adds an image to a specified layer that the user inputs.
   * @param currentLayer The layer that the user specifies.
   * @param filePath The filepath of an image.
   * @param x The x-offset of the image.
   * @param y The y-offset of the image.
   * @throws IOException Thrown if the given file is corrupt or doesn't exist.
   */
  void addImageToLayer(String currentLayer, String filePath, int x, int y) throws IOException;

  /**
   * Sets the filter of the selected layer.
   * @param currentLayer The layer that the user selected.
   * @param filter The filter that the user wishes to use.
   */
  void setFilter(String currentLayer, String filter);

  /**
   * Adds a layer to the given canvas.
   * @param text The layer name that the user wishes to use.
   */
  void addLayer(String text);

  /**
   * Saves the entire workspace as a collage file.
   * @param absolutePath The path that the user wishes to save the project.
   * @throws IOException Thrown if the filepath is invalid.
   */
  void saveProject(String absolutePath) throws IOException;

  /**
   * Saves the current image that the user is working on.
   * @param absolutePath The path that the user wishes to save the image.
   * @throws IOException Thrown if the filepath is invalid.
   */
  void saveImage(String absolutePath) throws IOException;

  /**
   * Loads a collage project given it's filepath.
   * @param absolutePath The filepath to the collage file.
   */
  void loadProject(String absolutePath);

  /**
   * Starts a new project with given dimensions.
   * @param height The height of the canvas.
   * @param width The width of the canvas.
   */
  void newProject(int height, int width);

  /**
   * An observational method that returns the height of the canvas.
   * @return The height of the canvas.
   */
  int getHeight();

  /**
   * An observational method that returns the width of the canvas.
   * @return The width of the canvas.
   */
  int getWidth();

  /**
   * An observational method that returns the model of the project. Used for trasnforming the model
   * into a graphical representation.
   * @return The CollageModel.
   */
  CollageModel getModel();

  /**
   * Returns a list of all the layer names that are present on the canvas.
   * @return The list of all layer names.
   */
  ArrayList<String> getLayerNames();
}
