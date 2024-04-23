import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.*;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Main {
    static double R;
	static double S;
	static double L;
	static double p;
	static int k;
	public static String str;
	private static HashMap<String, Double> map =
            										new HashMap<>();

    public static void main(String[] args) {
       map.put("железо", 0.1);
        map.put("медь", 0.02);
        map.put("алюминий", 0.03);
        map.put("серебро", 0.015);
        map.put("золото", 0.022);
        map.put("никель", 0.069);
        map.put("свинец", 0.207);
        map.put("вольфрам", 0.054);
        map.put("цинк", 0.059);
        map.put("платина", 0.105);
        map.put("бронза", 0.116);
        map.put("сталь", 0.2);
        map.put("алмаз", 2.0);
        map.put("силикон", 2300.0);
        map.put("полиэтилен", 1e16);
        map.put("нейзильбер", 0.02);
        map.put("тантал", 0.15);
        map.put("ртути", 0.96);
        map.put("порох", 1e13);
        map.put("неизвестно", 0.0);


        Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(869, 599);
		shell.setText("SWT Application");
        Button exitButton = new Button(shell, SWT.NONE);
		exitButton.setBounds(729, 511, 93, 39);
		exitButton.setText("Exit");

		Button clearButton_1 = new Button(shell, SWT.NONE);
		clearButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		clearButton_1.setBounds(603, 511, 93, 39);
		clearButton_1.setText("Clear");

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setAlignment(SWT.RIGHT);
		lblNewLabel.setBounds(20, 145, 55, 39);
		lblNewLabel.setText("R:");

		Text textR = new Text(shell, SWT.BORDER);
		textR.setBounds(81, 142, 129, 45);

		Label lblS = new Label(shell, SWT.NONE);
		lblS.setAlignment(SWT.RIGHT);
		lblS.setText("S:");
		lblS.setBounds(20, 212, 55, 15);

		Text textS = new Text(shell, SWT.BORDER);
		textS.setBounds(81, 209, 129, 45);

		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setAlignment(SWT.RIGHT);
		lblNewLabel_1.setBounds(20, 269, 55, 15);
		lblNewLabel_1.setText("L:");

		Text textL = new Text(shell, SWT.BORDER);
		textL.setBounds(81, 266, 129, 45);

		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(56, 328, 233, 152);

		Button btnRBNumbers = new Button(composite, SWT.RADIO);
		btnRBNumbers.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numbers windowOne=new numbers(display);
			}
		});
		btnRBNumbers.setBounds(41, 48, 134, 28);
		btnRBNumbers.setText("Вводим число");
		btnRBNumbers.setSelection(true);

		Button btnRBMaterrial = new Button(composite, SWT.RADIO);
		btnRBMaterrial.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				forWordResistanceMeaning windowTwo=new forWordResistanceMeaning(display);

			}
		});
		btnRBMaterrial.setBounds(41, 83, 134, 28);
		btnRBMaterrial.setText("Вводим материал");

		btnRBNumbers.setSelection(false);//не активируем радиокнопки при запуске программы
		btnRBMaterrial.setSelection(false);

		Label lblNewLabel_2 = new Label(composite, SWT.NONE);
		lblNewLabel_2.setText("Удельное сопротивление материалла");
		lblNewLabel_2.setBounds(10, 10, 213, 15);

		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setBounds(399, 64, 423, 416);

		Label lblNewLabel_3 = new Label(composite_1, SWT.NONE);
		lblNewLabel_3.setBounds(37, 25, 110, 27);
		lblNewLabel_3.setText("Рабочая формула:");

		Label lblNewLabel_4 = new Label(composite_1, SWT.NONE);
		lblNewLabel_4.setBounds(34, 143, 20, 15);
		lblNewLabel_4.setText("R:");

		Label outputR = new Label(composite_1, SWT.NONE);
		outputR.setBounds(56, 143, 55, 15);
		outputR.setText("New Label");

		Label lblNewLabel_7 = new Label(composite_1, SWT.NONE);
		lblNewLabel_7.setBounds(34, 168, 20, 15);
		lblNewLabel_7.setText("L:");

		Label outputL = new Label(composite_1, SWT.NONE);
		outputL.setBounds(56, 168, 55, 15);
		outputL.setText("New Label");

		Label lblS_1 = new Label(composite_1, SWT.NONE);
		lblS_1.setBounds(34, 189, 20, 15);
		lblS_1.setText("S:");

		Label outputS = new Label(composite_1, SWT.NONE);
		outputS.setBounds(56, 189, 55, 15);
		outputS.setText("New Label");

		Label lblNewLabel_10 = new Label(composite_1, SWT.NONE);
		lblNewLabel_10.setBounds(34, 217, 20, 15);
		lblNewLabel_10.setText("p:");

		Label outputp = new Label(composite_1, SWT.NONE);
		outputp.setBounds(56, 217, 55, 15);
		outputp.setText("New Label");

		Label canva = new Label(composite_1, SWT.CENTER);
		canva.setToolTipText("");
		canva.setAlignment(SWT.CENTER);
		canva.setBounds(146, 47, 100, 72);

		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setText("Введите \"0\" у того значения, которое мы ищем");
		lblNewLabel_5.setAlignment(SWT.CENTER);
		lblNewLabel_5.setBounds(64, 64, 310, 51);

		Button startButton = new Button(shell, SWT.PUSH);
		startButton.setBounds(470, 511, 93, 39);
		startButton.setText("Start");




		startButton.addListener(SWT.Selection, new Listener() {//Основная логика программы

					@Override
					public void handleEvent(Event arg0) {
						if(btnRBMaterrial.getSelection()==true) {
							try {
								p=map.get(str);
							} catch (NullPointerException e) {
								// TODO: handle exception
								k++;
								MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
								m2.setText("Ошибка");
								m2.setMessage("Такого материала нет в базе данных");
								m2.open();
							}

						}

						// Проверка на ввод чисел

						try {
							 R=Double.parseDouble(textR.getText());
						} catch (NumberFormatException e) {
							k++;
							MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
							m2.setText("Ошибка");
							m2.setMessage("Введено не число");
							m2.open();

						}
						// Проверка на ввод чисел
						try {
							 L=Double.parseDouble(textL.getText());
						} catch (NumberFormatException e) {
							k++;
							MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
							m2.setText("Ошибка");
							m2.setMessage("Введено не число");
							m2.open();

						}
						// Проверка на ввод чисел
						try {
							 S=Double.parseDouble(textS.getText());
						} catch (NumberFormatException e) {
							k++;
							MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
							m2.setText("Ошибка");
							m2.setMessage("Введено не число");
							m2.open();

						}

						double []arr= {R, L, S, p};

						//проверка на колич6ество неизвестных

						for(int i=0; i<arr.length;i++) {
							if (arr[i]==0) {
								k++;
							}
						}


						if(R==Double.NaN || L==Double.NaN || S==Double.NaN || p==Double.NaN ) {
							MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
							m2.setText("Ошибка");
							m2.setMessage("Введены аномальные значения");
							m2.open();
						}

						if(k>1) {
							MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
							m2.setText("Ошибка");
							m2.setMessage("Слишком много неизвестных");
							m2.open();
						}
						if(k==0) {
							MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
							m2.setText("Ошибка");
							m2.setMessage("Все известно");
							m2.open();
						}
						//нижняя граница значений
						if(R<0 || L<0 || p<0 || S<0 ) {
							MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
							m2.setText("Ошибка");
							m2.setMessage("Слишком маленькие значения");
							m2.open();
						}
						if(R>111111110 || L>111111110 || p>1111111110 || S>1111111110) {
							MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
							m2.setText("Ошибка");
							m2.setMessage("Слишком большие значения");
							m2.open();
						}




						if(R==0) {
							R=p*L/S;
							Image im=new Image(display, "forR.png");
							canva.setBackgroundImage(im);
						}
						if(L==0) {
							L=R*S/p;
							Image im=new Image(display, "forL.png");
							canva.setBackgroundImage(im);
						}
						if(S==0) {
							S=p*L/R;
							Image im=new Image(display, "forS.png");
							canva.setBackgroundImage(im);
						}
						if(p==0) {
							p=R*S/L;
							Image im=new Image(display, "forp.png");
							canva.setBackgroundImage(im);
						}

						outputL.setText(String.format("%.3f", L));
						outputp.setText(String.format("%.3f", R));
						outputR.setText(String.format("%.3f", S));
						outputS.setText(String.format("%.3f", p));
					}
				});


		clearButton_1.addListener(SWT.Selection, new Listener() { //Очистка формы

			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				textL.setText("");
				textR.setText("");
				textS.setText("");
				btnRBNumbers.setSelection(false);
				btnRBMaterrial.setSelection(false);
			}
		});

		btnRBNumbers.addListener(SWT.Selection, new Listener() {//выключение второй радио кнопки, если активна первая

			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				btnRBMaterrial.setSelection(false);
			}
		});

		btnRBMaterrial.addListener(SWT.Selection, new Listener() { //выключение первой радио кнопки, если активна вторая

			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				btnRBNumbers.setSelection(false);
			}
		});

		exitButton.addListener(SWT.Selection, new Listener() { //Закрытие формы

			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				shell.dispose();
			}
		});

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}

class numbers extends Shell {
	private Text text;
	public Shell shell;

	public numbers(Display display) {
		super(display, SWT.SHELL_TRIM | SWT.APPLICATION_MODAL);
		shell=this.getShell();
		createContents();
		this.getShell().open();
		display.sleep();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("SWT Application");
		setSize(450, 300);

		text = new Text(this, SWT.BORDER);
		text.setBounds(121, 124, 213, 47);

		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setBounds(10, 89, 177, 29);
		lblNewLabel.setText("Введите сопротивление");

		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(184, 197, 75, 25);
		btnNewButton.setText("Ок");


		btnNewButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				try {
					Main.p=Double.parseDouble(text.getText());
				} catch (InputMismatchException e) {
					Main.k++;
					MessageBox m2=new MessageBox(shell,SWT.ICON_WARNING| SWT.OPEN);
					m2.setText("Ошибка");
					m2.setMessage("Введено не число");
					m2.open();

				}


				shell.close();
			}
		});
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
class forWordResistanceMeaning extends Shell {
	private Text text;
	public Shell shell;

	/**
	 * Launch the application.
	 * @param
	 */

	public forWordResistanceMeaning(Display display) {
		super(display, SWT.SHELL_TRIM | SWT.APPLICATION_MODAL);
		shell=this.getShell();
		createContents();
		this.getShell().open();
		display.sleep();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("SWT Application");
		setSize(450, 300);



		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setBounds(10, 89, 177, 29);
		lblNewLabel.setText("Введите сопротивление");

		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(184, 197, 75, 25);
		btnNewButton.setText("Ок");

		text = new Text(this, SWT.BORDER);
		text.setBounds(121, 124, 213, 47);
		Main.str=text.getText();

		btnNewButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event arg0) {

				Main.str=text.getText();
				shell.close();
			}
		});

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

