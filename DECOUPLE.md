
# Decouple

In this file, we show what files are needed for only the controller to run. Below are the controllers and their respective imports:

CollageControllerText (controller for text-based interface):

- CollageModel: this file is necessary for the controller to compile as the controller interacts and edits the give model.

CollageControllerGUI (controller for graphic-based interface):

- CollageModel: similar to the CollageModel for CollageControllerText, this CollageControllerGUI needs the model interface to interact with the given model.
- CollageImageModel: this specifc class is needed for starting a new project in the graphic interface.

We made sure to decouple this files so that our code is easier to comprehend and make changes on.


