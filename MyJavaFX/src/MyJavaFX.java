import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class MyJavaFX extends Application implements Initializable {
	
	public static String BOB1 = "Bob";
	
	private String datascore1;
	
	private String datascore2;
	
	private String datascore3;
	
	private String datascore4;
	
	private String datascore5;
	
	private ArrayList<String>numbers = new ArrayList<String>();
	
	@FXML
	Pane pane1;	

	@FXML
	Button done;
	
	@FXML
	
	Button wantcode;
	
	@FXML
	
	Button confirmcode;
	
	@FXML
	TextField entercode;
	
	@FXML
	
	TextField receivecode;

	@FXML
	TextField name;
	
	@FXML
	TextField nametag;
	
	@FXML

	ImageView finalhair;
	
	@FXML

	ImageView finaltop;
	
	@FXML
	ImageView finaltorso;
	
	@FXML
	ImageView finallegs;
	
	@FXML
	ImageView color1;
	
	@FXML
	ImageView color2;
	
	@FXML
	ImageView color3;
	
	@FXML
	ImageView color4;
	
	@FXML
	ImageView color5;
	
	@FXML
	ImageView color6;
	
	@FXML
	ImageView color7;
	
	@FXML
	ImageView color8;

	@FXML
	Button bhair1;
	
	@FXML
	Button bhair2;
	
	@FXML
	Button bhair3;
	
	@FXML
	Button bhair4;
	
	@FXML
	Button bhair5;

	@FXML
	Button bhair8;
	
	@FXML
	Button hairc1;
	
	@FXML
	Button hairc2;
	
	@FXML
	Button hairc3;
	
	@FXML
	Button hairc4;

	@FXML
	Button hairc5;
	
	@FXML
	Button hairc6;
	
	@FXML
	Button hairc7;
	
	@FXML
	Button hairc8;
	
	@FXML
	Button skintone1;

	@FXML
	Button skintone2;
	
	@FXML
	Button skintone3;
	
	@FXML
	Button skintone4;
	
	@FXML
	Button top1;
	
	@FXML
	Button top2;
	
	@FXML
	Button top3;
	
	@FXML
	Button top4;
	
	@FXML
	Button top5;
	
	@FXML
	Button top6;
	
	@FXML
	Button top7;
	
	@FXML
	Button top8;
	
	@FXML
	Button legs1;
	
	@FXML
	Button legs2;
	
	@FXML
	Button legs3;
	
	@FXML
	Button legs4;
	
	@FXML
	Button legs5;
	
	@FXML
	Button legs6;
	
	@FXML
	Button legs7;
	
	@FXML
	Button legs8;
	
	@FXML
	Button finish;
	
	@FXML
	Button random;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("/resource/CHARACTERCREATOR.fxml"));
		final Pane pane1 = loader.load();

		primaryStage.setTitle("Character Creator");
		primaryStage.setScene(new Scene(pane1));
		primaryStage.show();
	}
	
	public static void Image(String path, ImageView holder) {
		Image image1 = new Image(path);
		holder.setImage(image1);
	}
	
	public int title(int newId) {
		int currentId = 0;
		Random random = new Random();
		int finalId = newId;
		if (finalId == currentId) {
			finalId = random.nextInt(5);
			title(finalId);
		}
		if (finalId == 0) {
			String storytime = nametag.getText();
			storytime = storytime.replaceAll("The Adventurer", "The Chef");
			storytime = storytime.replaceAll("The Adventurer", "The Unit");
			storytime = storytime.replaceAll("The Adventurer", "The Unit");
			storytime = storytime.replaceAll("The Adventurer", "The Villager");
			nametag.setText(storytime);
		}
		if (finalId == 1) {
			String storytime = nametag.getText();
			storytime = storytime.replaceAll("The King", "The Unit");
			storytime = storytime.replaceAll("The King", "The Adventurer");
			storytime = storytime.replaceAll("The King", "The Chef");
			storytime = storytime.replaceAll("The King", "The Villager");
			nametag.setText(storytime);
		}
		if (finalId == 2) {
			String storytime = nametag.getText();
			storytime = storytime.replaceAll("The Chef", "The King");
			storytime = storytime.replaceAll("The Chef", "The Adventurer");
			storytime = storytime.replaceAll("The Chef", "The Unit");
			storytime = storytime.replaceAll("The Chef", "The Villager");
			nametag.setText(storytime);
		}
		if (finalId == 3) {
			String storytime = nametag.getText();
			storytime = storytime.replaceAll("The Unit", "The Villager");
			storytime = storytime.replaceAll("The Unit", "The Chef");
			storytime = storytime.replaceAll("The Unit", "The King");
			storytime = storytime.replaceAll("The Unit", "The Adventurer");
			nametag.setText(storytime);
			
		}
		if (finalId == 4) {
			String storytime = nametag.getText();
			storytime = storytime.replaceAll("The Villager", "The Adventurer");
			storytime = storytime.replaceAll("The Villager", "The Chef");
			storytime = storytime.replaceAll("The Villager", "The Unit");
			storytime = storytime.replaceAll("The Villager", "The King");
			nametag.setText(storytime);
			
		}
		return 0;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		done.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String bob = name.getText();
				if(bob != BOB1) {
					String storytime = nametag.getText();
					storytime = storytime.replaceAll(BOB1, bob);
					nametag.setText(storytime);
				}
				BOB1 = bob;
			}
		});
		random.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Random random = new Random();
				int randId = random.nextInt(5);
				title(randId);
			}
		});
		bhair1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/hair1/Hair11.png", finalhair);
				Image("/resource/assets/hair1/Hair11.png", color1);
				Image("/resource/assets/hair1/Hair12.png", color2);
				Image("/resource/assets/hair1/Hair13.png", color3);
				Image("/resource/assets/hair1/Hair14.png", color4);
				Image("/resource/assets/hair1/Hair15.png", color5);
				Image("/resource/assets/hair1/Hair16.png", color6);
				Image("/resource/assets/hair1/Hair17.png", color7);
				Image("/resource/assets/hair1/Hair18.png", color8);
				datascore1 = "1"; 
			}
		});
		bhair2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/hair2/Hair21.png", finalhair);
				Image("/resource/assets/hair2/Hair21.png", color1);
				Image("/resource/assets/hair2/Hair22.png", color2);
				Image("/resource/assets/hair2/Hair23.png", color3);
				Image("/resource/assets/hair2/Hair24.png", color4);
				Image("/resource/assets/hair2/Hair25.png", color5);
				Image("/resource/assets/hair2/Hair26.png", color6);
				Image("/resource/assets/hair2/Hair27.png", color7);
				Image("/resource/assets/hair2/Hair28.png", color8);
				datascore1 = "2";
			}
		});
		bhair3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/hair3/Hair31.png", finalhair);
				Image("/resource/assets/hair3/Hair31.png", color1);
				Image("/resource/assets/hair3/Hair32.png", color2);
				Image("/resource/assets/hair3/Hair33.png", color3);
				Image("/resource/assets/hair3/Hair34.png", color4);
				Image("/resource/assets/hair3/Hair35.png", color5);
				Image("/resource/assets/hair3/Hair36.png", color6);
				Image("/resource/assets/hair3/Hair37.png", color7);
				Image("/resource/assets/hair3/Hair38.png", color8);
				datascore1 = "3";
			}
		});
		bhair4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/hair4/Hair41.png", finalhair);
				Image("/resource/assets/hair4/Hair41.png", color1);
				Image("/resource/assets/hair4/Hair42.png", color2);
				Image("/resource/assets/hair4/Hair43.png", color3);
				Image("/resource/assets/hair4/Hair44.png", color4);
				Image("/resource/assets/hair4/Hair45.png", color5);
				Image("/resource/assets/hair4/Hair46.png", color6);
				Image("/resource/assets/hair4/Hair47.png", color7);
				Image("/resource/assets/hair4/Hair48.png", color8);
				datascore1 = "4";
			}
		});
		bhair5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/hair5/Hair51.png", finalhair);
				Image("/resource/assets/hair5/Hair51.png", color1);
				Image("/resource/assets/hair5/Hair52.png", color2);
				Image("/resource/assets/hair5/Hair53.png", color3);
				Image("/resource/assets/hair5/Hair54.png", color4);
				Image("/resource/assets/hair5/Hair55.png", color5);
				Image("/resource/assets/hair5/Hair56.png", color6);
				Image("/resource/assets/hair5/Hair57.png", color7);
				Image("/resource/assets/hair5/Hair58.png", color8);
				datascore1 = "5";
			}
		});
		hairc1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(datascore1 == "1") {
					Image("/resource/assets/hair1/Hair11.png", finalhair);
					datascore2 = "1";
				}
				else if(datascore1 == "2") {
					Image("/resource/assets/hair2/Hair21.png", finalhair);
					datascore2 = "1";
				}
				else if(datascore1 == "3") {
					Image("/resource/assets/hair3/Hair31.png", finalhair);
					datascore2 = "1";
				}
				else if(datascore1 == "4") {
					Image("/resource/assets/hair4/Hair41.png", finalhair);
					datascore2 = "1";
				}
				else if(datascore1 == "5") {
					Image("/resource/assets/hair5/Hair51.png", finalhair);
					datascore2 = "1";
				}
			}
		});
		hairc2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(datascore1 == "1") {
					Image("/resource/assets/hair1/Hair12.png", finalhair);
					datascore2 = "2";
				}
				else if(datascore1 == "2") {
					Image("/resource/assets/hair2/Hair22.png", finalhair);
					datascore2 = "2";
				}
				else if(datascore1 == "3") {
					Image("/resource/assets/hair3/Hair32.png", finalhair);
					datascore2 = "2";
				}
				else if(datascore1 == "4") {
					Image("/resource/assets/hair4/Hair42.png", finalhair);
					datascore2 = "2";
				}
				else if(datascore1 == "5") {
					Image("/resource/assets/hair5/Hair52.png", finalhair);
					datascore2 = "2";
				}
			}
		});
		hairc3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(datascore1 == "1") {
					Image("/resource/assets/hair1/Hair13.png", finalhair);
					datascore2 = "3";
				}
				else if(datascore1 == "2") {
					Image("/resource/assets/hair2/Hair23.png", finalhair);
					datascore2 = "3";
				}
				else if(datascore1 == "3") {
					Image("/resource/assets/hair3/Hair33.png", finalhair);
					datascore2 = "3";
				}
				else if(datascore1 == "4") {
					Image("/resource/assets/hair4/Hair43.png", finalhair);
					datascore2 = "3";
				}
				else if(datascore1 == "5") {
					Image("/resource/assets/hair5/Hair53.png", finalhair);
					datascore2 = "3";
				}
			}
		});
		hairc4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(datascore1 == "1") {
					Image("/resource/assets/hair1/Hair14.png", finalhair);
					datascore2 = "4";
				}
				else if(datascore1 == "2") {
					Image("/resource/assets/hair2/Hair24.png", finalhair);
					datascore3 = "4";
				}
				else if(datascore1 == "3") {
					Image("/resource/assets/hair3/Hair34.png", finalhair);
					datascore2 = "4";
				}
				else if(datascore1 == "4") {
					Image("/resource/assets/hair4/Hair44.png", finalhair);
					datascore2 = "4";
				}
				else if(datascore1 == "5") {
					Image("/resource/assets/hair5/Hair54.png", finalhair);
					datascore2 = "4";
				}
			}
		});
		hairc5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(datascore1 == "1") {
					Image("/resource/assets/hair1/Hair15.png", finalhair);
					datascore2 = "5";
				}
				else if(datascore1 == "2") {
					Image("/resource/assets/hair2/Hair25.png", finalhair);
					datascore2 = "5";
				}
				else if(datascore1 == "3") {
					Image("/resource/assets/hair3/Hair35.png", finalhair);
					datascore2 = "5";
				}
				else if(datascore1 == "4") {
					Image("/resource/assets/hair4/Hair45.png", finalhair);
					datascore2 = "5";
				}
				else if(datascore1 == "5") {
					Image("/resource/assets/hair5/Hair55.png", finalhair);
					datascore2 = "5";
				}
			}
		});
		hairc6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(datascore1 == "1") {
					Image("/resource/assets/hair1/Hair16.png", finalhair);
					datascore2 = "6";
				}
				else if(datascore1 == "2") {
					Image("/resource/assets/hair2/Hair26.png", finalhair);
					datascore2 = "6";
				}
				else if(datascore1 == "3") {
					Image("/resource/assets/hair3/Hair36.png", finalhair);
					datascore2 = "6";
				}
				else if(datascore1 == "4") {
					Image("/resource/assets/hair4/Hair46.png", finalhair);
					datascore2 = "6";
				}
				else if(datascore1 == "5") {
					Image("/resource/assets/hair5/Hair56.png", finalhair);
					datascore2 = "6";
				}
			}
		});
		hairc7.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(datascore1 == "1") {
					Image("/resource/assets/hair1/Hair17.png", finalhair);
					datascore2 = "7";
				}
				else if(datascore1 == "2") {
					Image("/resource/assets/hair2/Hair27.png", finalhair);
					datascore2 = "7";
				}
				else if(datascore1 == "3") {
					Image("/resource/assets/hair3/Hair37.png", finalhair);
					datascore2 = "7";
				}
				else if(datascore1 == "4") {
					Image("/resource/assets/hair4/Hair47.png", finalhair);
					datascore2 = "7";
				}
				else if(datascore1 == "5") {
					Image("/resource/assets/hair5/Hair57.png", finalhair);
					datascore2 = "7";
				}
			}
		});
		hairc8.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(datascore1 == "1") {
					Image("/resource/assets/hair1/Hair18.png", finalhair);
					datascore2 = "8";
				}
				else if(datascore1 == "2") {
					Image("/resource/assets/hair2/Hair28.png", finalhair);
					datascore2 = "8";
				}
				else if(datascore1 == "3") {
					Image("/resource/assets/hair3/Hair38.png", finalhair);
					datascore2 = "8";
				}
				else if(datascore1 == "4") {
					Image("/resource/assets/hair4/Hair48.png", finalhair);
					datascore2 = "8";
				}
				else if(datascore1 == "5") {
					Image("/resource/assets/hair5/Hair58.png", finalhair);
					datascore2 = "8";
				}
			}
		});
		skintone1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/skintones/CharacterTop1.png", finaltop);
				datascore3 = "1";
			}
		});
		skintone2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/skintones/CharacterTop2.png", finaltop);
				datascore3 = "2";
			}
		});
		skintone3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/skintones/CharacterTop3.png", finaltop);
				datascore3 = "3";
			}
		});
		skintone4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/skintones/CharacterTop4.png", finaltop);
				datascore3 = "4";
			}
		});
		top1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/Torso1.png", finaltorso);
				datascore4 = "1";
			}
		});
		top2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/Torso2.png", finaltorso);
				datascore4 = "2";
			}
		});
		top3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/torso/Torso3.png", finaltorso);
				datascore4 = "3";
			}
		});
		top4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/torso/Torso4.png", finaltorso);
				datascore4 = "4";
			}
		});
		top5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/torso/Torso5.png", finaltorso);
				datascore4 = "5";
			}
		});
		top6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/torso/Torso6.png", finaltorso);
				datascore4 = "6";
			}
		});
		top7.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/torso/Torso7.png", finaltorso);
				datascore4 = "7";
			}
		});
		top8.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/torso/Torso8.png", finaltorso);
				datascore4 = "8";
			}
		});
		legs1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/legs/Legs1.png", finallegs);
				datascore5 = "1";
			}
		});
		legs2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/legs/Legs2.png", finallegs);
				datascore5 = "2";
			}
		});
		legs3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/legs/Legs3.png", finallegs);
				datascore5 = "3";
			}
		});
		legs4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/legs/Legs4.png", finallegs);
				datascore5 = "4";
			}
		});
		legs5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/legs/Legs5.png", finallegs);
				datascore5 = "5";
			}
		});
		legs6.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/legs/Legs6.png", finallegs);
				datascore5 = "6";
			}
		});
		legs7.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/legs/Legs7.png", finallegs);
				datascore5 = "7";
			}
		});
		legs8.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image("/resource/assets/legs/Legs8.png", finallegs);
				datascore5 = "8";
			}
		});
		wantcode.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				numbers.add(datascore1);
				numbers.add(datascore2);
				numbers.add(datascore3);
				numbers.add(datascore4);
				numbers.add(datascore5);
				System.out.print(numbers);
				numbers.clear();
			}}); 
		confirmcode.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String b = entercode.getText();
				char c = b.charAt(0); //represents datascore1
				char d = b.charAt(1); //represents datascore2
				char e = b.charAt(2); //represents datascore3
				char f = b.charAt(3); //represents datascore4
				char g = b.charAt(4); //represents datascore5
				if (c == '1') {
					if (d == '1') {
						Image("/resource/assets/hair1/Hair11.png", finalhair);
					}
					else if (d == '2') {
						Image("/resource/assets/hair1/Hair12.png", finalhair);
					}
					else if (d == '3') {
						Image("/resource/assets/hair1/Hair13.png", finalhair);
					}
					else if (d == '4') {
						Image("/resource/assets/hair1/Hair14.png", finalhair);
					}
					else if (d == '5') {
						Image("/resource/assets/hair1/Hair15.png", finalhair);
					}
					else if (d == '6') {
						Image("/resource/assets/hair1/Hair16.png", finalhair);
					}
					else if (d == '7') {
						Image("/resource/assets/hair1/Hair17.png", finalhair);
					}
					else if (d == '8') {
						Image("/resource/assets/hair1/Hair18.png", finalhair);
					}
				}
				if (c == '2') {
					if (d == '1') {
						Image("/resource/assets/hair2/Hair21.png", finalhair);
					}
					else if (d == '2') {
						Image("/resource/assets/hair2/Hair22.png", finalhair);
					}
					else if (d == '3') {
						Image("/resource/assets/hair2/Hair23.png", finalhair);
					}
					else if (d == '4') {
						Image("/resource/assets/hair2/Hair24.png", finalhair);
					}
					else if (d == '5') {
						Image("/resource/assets/hair2/Hair25.png", finalhair);
					}
					else if (d == '6') {
						Image("/resource/assets/hair2/Hair26.png", finalhair);
					}
					else if (d == '7') {
						Image("/resource/assets/hair2/Hair27.png", finalhair);
					}
					else if (d == '8') {
						Image("/resource/assets/hair2/Hair28.png", finalhair);
					}
				}
				if (c == '3') {
					if (d == '1') {
						Image("/resource/assets/hair3/Hair31.png", finalhair);
					}
					else if (d == '2') {
						Image("/resource/assets/hair3/Hair32.png", finalhair);
					}
					else if (d == '3') {
						Image("/resource/assets/hair3/Hair33.png", finalhair);
					}
					else if (d == '4') {
						Image("/resource/assets/hair3/Hair34.png", finalhair);
					}
					else if (d == '5') {
						Image("/resource/assets/hair3/Hair35.png", finalhair);
					}
					else if (d == '6') {
						Image("/resource/assets/hair3/Hair36.png", finalhair);
					}
					else if (d == '7') {
						Image("/resource/assets/hair3/Hair37.png", finalhair);
					}
					else if (d == '8') {
						Image("/resource/assets/hair3/Hair38.png", finalhair);
					}
				}
				if (c == '4') {
					if (d == '1') {
						Image("/resource/assets/hair4/Hair41.png", finalhair);
					}
					else if (d == '2') {
						Image("/resource/assets/hair4/Hair42.png", finalhair);
					}
					else if (d == '3') {
						Image("/resource/assets/hair4/Hair43.png", finalhair);
					}
					else if (d == '4') {
						Image("/resource/assets/hair4/Hair44.png", finalhair);
					}
					else if (d == '5') {
						Image("/resource/assets/hair4/Hair45.png", finalhair);
					}
					else if (d == '6') {
						Image("/resource/assets/hair4/Hair46.png", finalhair);
					}
					else if (d == '7') {
						Image("/resource/assets/hair4/Hair47.png", finalhair);
					}
					else if (d == '8') {
						Image("/resource/assets/hair4/Hair48.png", finalhair);
					}
				}
				if (c == '5') {
					if (d == '1') {
						Image("/resource/assets/hair5/Hair51.png", finalhair);
					}
					else if (d == '2') {
						Image("/resource/assets/hair5/Hair52.png", finalhair);
					}
					else if (d == '3') {
						Image("/resource/assets/hair5/Hair53.png", finalhair);
					}
					else if (d == '4') {
						Image("/resource/assets/hair5/Hair54.png", finalhair);
					}
					else if (d == '5') {
						Image("/resource/assets/hair5/Hair55.png", finalhair);
					}
					else if (d == '6') {
						Image("/resource/assets/hair5/Hair56.png", finalhair);
					}
					else if (d == '7') {
						Image("/resource/assets/hair5/Hair57.png", finalhair);
					}
					else if (d == '8') {
						Image("/resource/assets/hair5/Hair58.png", finalhair);
					}
				}
				if (e == '1') {
					Image("/resource/assets/skintones/CharacterTop1.png", finaltop);
				}
				else if (e == '2') {
					Image("/resource/assets/skintones/CharacterTop2.png", finaltop);
				}
				else if (e == '3') {
					Image("/resource/assets/skintones/CharacterTop3.png", finaltop);
				}
				else if (e == '4') {
					Image("/resource/assets/skintones/CharacterTop4.png", finaltop);

			}
				if (f == '1') {
					Image("/resource/assets/torso/Torso1.png", finaltorso);
				}
				else if (f == '2') {
					Image("/resource/assets/torso/Torso2.png", finaltorso);
				}
				else if (f == '3') {
					Image("/resource/assets/torso/Torso3.png", finaltorso);
				}
				else if (f == '4') {
					Image("/resource/assets/torso/Torso4.png", finaltorso);
				}
				if (f == '5') {
					Image("/resource/assets/torso/Torso5.png", finaltorso);
				}
				else if (f == '6') {
					Image("/resource/assets/torso/Torso6.png", finaltorso);
				}
				else if (f == '7') {
					Image("/resource/assets/torso/Torso7.png", finaltorso);
				}
				else if (f == '8') {
					Image("/resource/assets/torso/Torso8.png", finaltorso);
				}
				
				if (g == '1') {
					Image("/resource/assets/legs/Legs1.png", finallegs);
				}
				else if (g == '2') {
					Image("/resource/assets/legs/Legs2.png", finallegs);
				}
				else if (g == '3') {
					Image("/resource/assets/legs/Legs3.png", finallegs);
				}
				else if (g == '4') {
					Image("/resource/assets/legs/Legs4.png", finallegs);
				}
				if (g == '5') {
					Image("/resource/assets/legs/Legs5.png", finallegs);
				}
				else if (g == '6') {
					Image("/resource/assets/legs/Legs6.png", finallegs);
				}
				else if (g == '7') {
					Image("/resource/assets/legs/Legs7.png", finallegs);
				}
				else if (g == '8') {
					Image("/resource/assets/legs/Legs8.png", finallegs);
				}
				
			}});
	} 	
	public static void main(String[] args) {
		launch(args);
	}
}