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

@Tag("9")
class Record_4151 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4151: FirstName is Brock")
	void FirstNameOfRecord4151() {
		assertEquals("Brock", customers.get(4150).getFirstName());
	}

	@Test
	@DisplayName("Record 4151: LastName is Carline")
	void LastNameOfRecord4151() {
		assertEquals("Carline", customers.get(4150).getLastName());
	}

	@Test
	@DisplayName("Record 4151: Company is Hauser, Allison Hunnicutt Esq")
	void CompanyOfRecord4151() {
		assertEquals("Hauser, Allison Hunnicutt Esq", customers.get(4150).getCompany());
	}

	@Test
	@DisplayName("Record 4151: Address is 2323 E Capitol Dr")
	void AddressOfRecord4151() {
		assertEquals("2323 E Capitol Dr", customers.get(4150).getAddress());
	}

	@Test
	@DisplayName("Record 4151: City is Appleton")
	void CityOfRecord4151() {
		assertEquals("Appleton", customers.get(4150).getCity());
	}

	@Test
	@DisplayName("Record 4151: County is Outagamie")
	void CountyOfRecord4151() {
		assertEquals("Outagamie", customers.get(4150).getCounty());
	}

	@Test
	@DisplayName("Record 4151: State is WI")
	void StateOfRecord4151() {
		assertEquals("WI", customers.get(4150).getState());
	}

	@Test
	@DisplayName("Record 4151: ZIP is 54911")
	void ZIPOfRecord4151() {
		assertEquals("54911", customers.get(4150).getZIP());
	}

	@Test
	@DisplayName("Record 4151: Phone is 920-733-5820")
	void PhoneOfRecord4151() {
		assertEquals("920-733-5820", customers.get(4150).getPhone());
	}

	@Test
	@DisplayName("Record 4151: Fax is 920-733-7791")
	void FaxOfRecord4151() {
		assertEquals("920-733-7791", customers.get(4150).getFax());
	}

	@Test
	@DisplayName("Record 4151: Email is brock@carline.com")
	void EmailOfRecord4151() {
		assertEquals("brock@carline.com", customers.get(4150).getEmail());
	}

	@Test
	@DisplayName("Record 4151: Web is http://www.brockcarline.com")
	void WebOfRecord4151() {
		assertEquals("http://www.brockcarline.com", customers.get(4150).getWeb());
	}
}
