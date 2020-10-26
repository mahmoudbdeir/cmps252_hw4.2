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

@Tag("42")
class Record_352 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 352: FirstName is Ernestina")
	void FirstNameOfRecord352() {
		assertEquals("Ernestina", customers.get(351).getFirstName());
	}

	@Test
	@DisplayName("Record 352: LastName is Culpepper")
	void LastNameOfRecord352() {
		assertEquals("Culpepper", customers.get(351).getLastName());
	}

	@Test
	@DisplayName("Record 352: Company is Spirra, Richard R Esq")
	void CompanyOfRecord352() {
		assertEquals("Spirra, Richard R Esq", customers.get(351).getCompany());
	}

	@Test
	@DisplayName("Record 352: Address is 21206 Nordhoff St")
	void AddressOfRecord352() {
		assertEquals("21206 Nordhoff St", customers.get(351).getAddress());
	}

	@Test
	@DisplayName("Record 352: City is Chatsworth")
	void CityOfRecord352() {
		assertEquals("Chatsworth", customers.get(351).getCity());
	}

	@Test
	@DisplayName("Record 352: County is Los Angeles")
	void CountyOfRecord352() {
		assertEquals("Los Angeles", customers.get(351).getCounty());
	}

	@Test
	@DisplayName("Record 352: State is CA")
	void StateOfRecord352() {
		assertEquals("CA", customers.get(351).getState());
	}

	@Test
	@DisplayName("Record 352: ZIP is 91311")
	void ZIPOfRecord352() {
		assertEquals("91311", customers.get(351).getZIP());
	}

	@Test
	@DisplayName("Record 352: Phone is 818-998-0759")
	void PhoneOfRecord352() {
		assertEquals("818-998-0759", customers.get(351).getPhone());
	}

	@Test
	@DisplayName("Record 352: Fax is 818-998-1457")
	void FaxOfRecord352() {
		assertEquals("818-998-1457", customers.get(351).getFax());
	}

	@Test
	@DisplayName("Record 352: Email is ernestina@culpepper.com")
	void EmailOfRecord352() {
		assertEquals("ernestina@culpepper.com", customers.get(351).getEmail());
	}

	@Test
	@DisplayName("Record 352: Web is http://www.ernestinaculpepper.com")
	void WebOfRecord352() {
		assertEquals("http://www.ernestinaculpepper.com", customers.get(351).getWeb());
	}
}
