package com.kodilla.hibernate.invoice.dao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemsDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

       //Given
        Item item1 = new Item(new Product("shoes"), new BigDecimal(100), 2);
        Item item2 = new Item(new Product("tv"), new BigDecimal(1000), 1);
        Invoice firstInvoice = new Invoice("first 2019");
        //When
        firstInvoice.getItemList().add(item1);
        firstInvoice.getItemList().add(item2);
        invoiceDao.save(firstInvoice);

        //Then
        Assert.assertEquals(2, productDao.count());
        Assert.assertEquals(2, itemDao.count());
        Assert.assertEquals(1, invoiceDao.count());



    }
}
