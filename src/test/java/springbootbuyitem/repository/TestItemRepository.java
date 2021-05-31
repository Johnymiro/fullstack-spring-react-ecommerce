package springbootbuyitem.repository;

import com.training.springbootbuyitem.BuyItemApplication;
import com.training.springbootbuyitem.entity.model.Item;
import com.training.springbootbuyitem.repository.ItemRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@SpringBootTest(classes = BuyItemApplication.class)
@RunWith(SpringRunner.class)
public class TestItemRepository {

	@Autowired
	private ItemRepository itemRepository;

	@Sql("/delete_all.sql")
	@Test
	public void createItemTest() {
		Item item = new Item("my item");
		item.setPriceTag(BigDecimal.ONE);
		item.setStock(BigInteger.ONE);
		Item itemSaved = itemRepository.save(item);
		Assert.assertEquals (item.getName(), ("my item"));
	}

	// TODO

	@Test
	public void getItemsTest() {
		assertThat(itemRepository.findAll().size(), is(5));
	}

/*	@Sql("/delete_all.sql")
	@Test(expected = DataIntegrityViolationException.class)
	public void createDuplicateItemTest() {
		itemRepository.save(Item.builder().name("my item").priceTag(BigDecimal.ONE).stock(BigInteger.ONE).build());
		itemRepository.save(Item.builder().name("my item").priceTag(BigDecimal.ONE).stock(BigInteger.ONE).build());
	}

*/
}
