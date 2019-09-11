package com.kodilla.hibernate.carshop.Test;



import com.kodilla.hibernate.carshop.CarList;
import com.kodilla.hibernate.carshop.RepairsCarriedOut;
import com.kodilla.hibernate.carshop.dao.CarDao;
import com.kodilla.hibernate.carshop.dao.RepairsCarriedOutDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarShopTestSuite {

    @Autowired
    private RepairsCarriedOutDao repairsCarriedOutDao;
    @Autowired
    private CarDao carDao;
    @Test
    public void carTest(){

        RepairsCarriedOut firtsRepair=new RepairsCarriedOut("wymiana oleju");
        RepairsCarriedOut secondRepair=new RepairsCarriedOut("wymiana spezegla");
        RepairsCarriedOut thirdRepair =new RepairsCarriedOut("naprawa silnika");

        CarList firstCar=new CarList("VW",1998);
        firtsRepair.setCarList(firstCar);
        secondRepair.setCarList(firstCar);
        thirdRepair.setCarList(firstCar);
        firstCar.getRepairsCarriedOutList().add(firtsRepair);
        firstCar.getRepairsCarriedOutList().add(secondRepair);
        firstCar.getRepairsCarriedOutList().add(thirdRepair);
        carDao.save(firstCar);



    }
}
