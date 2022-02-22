package day1;

class temperature
{
	public static void main(String[] args)
	{
		System.out.println("\n\tTemperature Converter");
		float temp_in_celcius = 35f;
		float temp_in_fahrenheit = 39f;
		float fahrenheit = (float) (temp_in_celcius*1.8)+32;
		float celcius =  (float) (temp_in_fahrenheit-32)*5/9;
		System.out.println("Temperature in fahrenheit "+fahrenheit);
		System.out.println("Temperature in celcius "+celcius);
	}
}