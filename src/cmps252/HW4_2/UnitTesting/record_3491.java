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

@Tag("47")
class Record_3491 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3491: FirstName is Buster")
	void FirstNameOfRecord3491() {
		assertEquals("Buster", customers.get(3490).getFirstName());
	}

	@Test
	@DisplayName("Record 3491: LastName is Bembry")
	void LastNameOfRecord3491() {
		assertEquals("Bembry", customers.get(3490).getLastName());
	}

	@Test
	@DisplayName("Record 3491: Company is Nyseg Corporate General Office")
	void CompanyOfRecord3491() {
		assertEquals("Nyseg Corporate General Office", customers.get(3490).getCompany());
	}

	@Test
	@DisplayName("Record 3491: Address is 2 World Trade Ctr")
	void AddressOfRecord3491() {
		assertEquals("2 World Trade Ctr", customers.get(3490).getAddress());
	}

	@Test
	@DisplayName("Record 3491: City is New York")
	void CityOfRecord3491() {
		assertEquals("New York", customers.get(3490).getCity());
	}

	@Test
	@DisplayName("Record 3491: County is New York")
	void CountyOfRecord3491() {
		assertEquals("New York", customers.get(3490).getCounty());
	}

	@Test
	@DisplayName("Record 3491: State is NY")
	void StateOfRecord3491() {
		assertEquals("NY", customers.get(3490).getState());
	}

	@Test
	@DisplayName("Record 3491: ZIP is 10048")
	void ZIPOfRecord3491() {
		assertEquals("10048", customers.get(3490).getZIP());
	}

	@Test
	@DisplayName("Record 3491: Phone is 212-839-8579")
	void PhoneOfRecord3491() {
		assertEquals("212-839-8579", customers.get(3490).getPhone());
	}

	@Test
	@DisplayName("Record 3491: Fax is 212-839-2113")
	void FaxOfRecord3491() {
		assertEquals("212-839-2113", customers.get(3490).getFax());
	}

	@Test
	@DisplayName("Record 3491: Email is buster@bembry.com")
	void EmailOfRecord3491() {
		assertEquals("buster@bembry.com", customers.get(3490).getEmail());
	}

	@Test
	@DisplayName("Record 3491: Web is http://www.busterbembry.com")
	void WebOfRecord3491() {
		assertEquals("http://www.busterbembry.com", customers.get(3490).getWeb());
	}
}
