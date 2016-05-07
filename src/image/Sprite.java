package image;

public final class Sprite {
	private final int measure;
	private int x;
	private int y;
	
	public int [] pixels;

	public Sprite(final int measure, final int column, final int row) {
		this.measure = measure;
		
		pixels = new int[measure * measure];
		
		this.x = column * measure;
		this.y = row * measure;
		
		for(int i = 0; i < measure; i ++) {
			for(int j = 0; i <  measure; j++) {
				//Accede a las coordenadas y se multiplica por el lado
				//pixels[j + i * measure];
			}
			
		}
	}
}
