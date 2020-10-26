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
class Record_4663 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4663: FirstName is Sasha")
	void FirstNameOfRecord4663() {
		assertEquals("Sasha", customers.get(4662).getFirstName());
	}

	@Test
	@DisplayName("Record 4663: LastName is Mileti")
	void LastNameOfRecord4663() {
		assertEquals("Mileti", customers.get(4662).getLastName());
	}

	@Test
	@DisplayName("Record 4663: Company is Wesco Cedar Inc")
	void CompanyOfRecord4663() {
		assertEquals("Wesco Cedar Inc", customers.get(4662).getCompany());
	}

	@Test
	@DisplayName("Record 4663: Address is 1307 John Reed Ct")
	void AddressOfRecord4663() {
		assertEquals("1307 John Reed Ct", customers.get(4662).getAddress());
	}

	@Test
	@DisplayName("Record 4663: City is Hacienda Hyghts")
	void CityOfRecord4663() {
		assertEquals("Hacienda Hyghts", customers.get(4662).getCity());
	}

	@Test
	@DisplayName("Record 4663: County is Los Angeles")
	void CountyOfRecord4663() {
		assertEquals("Los Angeles", customers.get(4662).getCounty());
	}

	@Test
	@DisplayName("Record 4663: State is CA")
	void StateOfRecord4663() {
		assertEquals("CA", customers.get(4662).getState());
	}

	@Test
	@DisplayName("Record 4663: ZIP is 91745")
	void ZIPOfRecord4663() {
		assertEquals("91745", customers.get(4662).getZIP());
	}

	@Test
	@DisplayName("Record 4663: Phone is 626-961-3164")
	void PhoneOfRecord4663() {
		assertEquals("626-961-3164", customers.get(4662).getPhone());
	}

	@Test
	@DisplayName("Record 4663: Fax is 626-961-7194")
	void FaxOfRecord4663() {
		assertEquals("626-961-7194", customers.get(4662).getFax());
	}

	@Test
	@DisplayName("Record 4663: Email is sasha@mileti.com")
	void EmailOfRecord4663() {
		assertEquals("sasha@mileti.com", customers.get(4662).getEmail());
	}

	@Test
	@DisplayName("Record 4663: Web is http://www.sashamileti.com")
	void WebOfRecord4663() {
		assertEquals("http://www.sashamileti.com", customers.get(4662).getWeb());
	}
}
