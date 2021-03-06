package edu.zut.wi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	@Autowired
	private CarDAO carDAO;
	
	void addCar(Car car)
	{
		carDAO.insertCar(car);
		
		
	}
	void updateCar(Car car)
	{
		carDAO.updateCar(car);
	}
	
	Car findById(int id)
	{
		return carDAO.findById(id);
	}
	
	public List<Car> getCars()
	{
		
		return carDAO.listCar();
	}
	
	void takeCar(Car car)
	{
		carDAO.takeCar(car);
	}
	
	void returnCar(Car car)
	{
		carDAO.returnCar(car);
	}
	
	void deleteCar(int id)
	{
		carDAO.deleteCar(id);
	}
}
