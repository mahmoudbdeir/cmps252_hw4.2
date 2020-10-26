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

@Tag("6")
class Record_3759 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3759: FirstName is Arlie")
	void FirstNameOfRecord3759() {
		assertEquals("Arlie", customers.get(3758).getFirstName());
	}

	@Test
	@DisplayName("Record 3759: LastName is Sule")
	void LastNameOfRecord3759() {
		assertEquals("Sule", customers.get(3758).getLastName());
	}

	@Test
	@DisplayName("Record 3759: Company is Columbia Sports")
	void CompanyOfRecord3759() {
		assertEquals("Columbia Sports", customers.get(3758).getCompany());
	}

	@Test
	@DisplayName("Record 3759: Address is Box #-1267")
	void AddressOfRecord3759() {
		assertEquals("Box #-1267", customers.get(3758).getAddress());
	}

	@Test
	@DisplayName("Record 3759: City is Agoura Hills")
	void CityOfRecord3759() {
		assertEquals("Agoura Hills", customers.get(3758).getCity());
	}

	@Test
	@DisplayName("Record 3759: County is Los Angeles")
	void CountyOfRecord3759() {
		assertEquals("Los Angeles", customers.get(3758).getCounty());
	}

	@Test
	@DisplayName("Record 3759: State is CA")
	void StateOfRecord3759() {
		assertEquals("CA", customers.get(3758).getState());
	}

	@Test
	@DisplayName("Record 3759: ZIP is 91376")
	void ZIPOfRecord3759() {
		assertEquals("91376", customers.get(3758).getZIP());
	}

	@Test
	@DisplayName("Record 3759: Phone is 818-879-7377")
	void PhoneOfRecord3759() {
		assertEquals("818-879-7377", customers.get(3758).getPhone());
	}

	@Test
	@DisplayName("Record 3759: Fax is 818-879-7209")
	void FaxOfRecord3759() {
		assertEquals("818-879-7209", customers.get(3758).getFax());
	}

	@Test
	@DisplayName("Record 3759: Email is arlie@sule.com")
	void EmailOfRecord3759() {
		assertEquals("arlie@sule.com", customers.get(3758).getEmail());
	}

	@Test
	@DisplayName("Record 3759: Web is http://www.arliesule.com")
	void WebOfRecord3759() {
		assertEquals("http://www.arliesule.com", customers.get(3758).getWeb());
	}
}
