package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("27")
class Record_888 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 888: FirstName is Mara")
	void FirstNameOfRecord888() {
		assertEquals("Mara", customers.get(887).getFirstName());
	}

	@Test
	@DisplayName("Record 888: LastName is Garitty")
	void LastNameOfRecord888() {
		assertEquals("Garitty", customers.get(887).getLastName());
	}

	@Test
	@DisplayName("Record 888: Company is Affeldt, Thomas M Esq")
	void CompanyOfRecord888() {
		assertEquals("Affeldt, Thomas M Esq", customers.get(887).getCompany());
	}

	@Test
	@DisplayName("Record 888: Address is 14842 Beech Daly Rd")
	void AddressOfRecord888() {
		assertEquals("14842 Beech Daly Rd", customers.get(887).getAddress());
	}

	@Test
	@DisplayName("Record 888: City is Taylor")
	void CityOfRecord888() {
		assertEquals("Taylor", customers.get(887).getCity());
	}

	@Test
	@DisplayName("Record 888: County is Wayne")
	void CountyOfRecord888() {
		assertEquals("Wayne", customers.get(887).getCounty());
	}

	@Test
	@DisplayName("Record 888: State is MI")
	void StateOfRecord888() {
		assertEquals("MI", customers.get(887).getState());
	}

	@Test
	@DisplayName("Record 888: ZIP is 48180")
	void ZIPOfRecord888() {
		assertEquals("48180", customers.get(887).getZIP());
	}

	@Test
	@DisplayName("Record 888: Phone is 313-946-1112")
	void PhoneOfRecord888() {
		assertEquals("313-946-1112", customers.get(887).getPhone());
	}

	@Test
	@DisplayName("Record 888: Fax is 313-946-3428")
	void FaxOfRecord888() {
		assertEquals("313-946-3428", customers.get(887).getFax());
	}

	@Test
	@DisplayName("Record 888: Email is mara@garitty.com")
	void EmailOfRecord888() {
		assertEquals("mara@garitty.com", customers.get(887).getEmail());
	}

	@Test
	@DisplayName("Record 888: Web is http://www.maragaritty.com")
	void WebOfRecord888() {
		assertEquals("http://www.maragaritty.com", customers.get(887).getWeb());
	}
}
