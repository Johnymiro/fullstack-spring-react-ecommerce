package springbootbuyitem.service;

import com.training.springbootbuyitem.repository.ItemRepository;
import com.training.springbootbuyitem.service.ItemService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ItemServiceTest {

	@MockBean
	private ItemRepository itemRepository;

	@Autowired
	private ItemService itemService;

	private static final long ID = 1l;

		/*
	@Test
 	public void save() {
		Item item = Item.builder().
				name("banana").priceTag(BigDecimal.ONE).stock(BigInteger.ONE).build();

				Item persist = item;
				persist.setItemUid(1l);
		when(itemRepository.save(item)).thenReturn(persist);
		item = itemService.save(item);
		assertThat(item.getItemUid(),is(1l));
	}

	@Test(expected = EntityNotFoundException.class)
	public void errorGet() {
		when(itemRepository.findById(ID)).thenReturn(Optional.empty());
		itemService.get(ID);

	}
	*/

}