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

@Tag("35")
class Record_3109 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3109: FirstName is Terrie")
	void FirstNameOfRecord3109() {
		assertEquals("Terrie", customers.get(3108).getFirstName());
	}

	@Test
	@DisplayName("Record 3109: LastName is Stile")
	void LastNameOfRecord3109() {
		assertEquals("Stile", customers.get(3108).getLastName());
	}

	@Test
	@DisplayName("Record 3109: Company is Oquinn, Robert Jr")
	void CompanyOfRecord3109() {
		assertEquals("Oquinn, Robert Jr", customers.get(3108).getCompany());
	}

	@Test
	@DisplayName("Record 3109: Address is 118 E Market St")
	void AddressOfRecord3109() {
		assertEquals("118 E Market St", customers.get(3108).getAddress());
	}

	@Test
	@DisplayName("Record 3109: City is York")
	void CityOfRecord3109() {
		assertEquals("York", customers.get(3108).getCity());
	}

	@Test
	@DisplayName("Record 3109: County is York")
	void CountyOfRecord3109() {
		assertEquals("York", customers.get(3108).getCounty());
	}

	@Test
	@DisplayName("Record 3109: State is PA")
	void StateOfRecord3109() {
		assertEquals("PA", customers.get(3108).getState());
	}

	@Test
	@DisplayName("Record 3109: ZIP is 17401")
	void ZIPOfRecord3109() {
		assertEquals("17401", customers.get(3108).getZIP());
	}

	@Test
	@DisplayName("Record 3109: Phone is 717-845-1108")
	void PhoneOfRecord3109() {
		assertEquals("717-845-1108", customers.get(3108).getPhone());
	}

	@Test
	@DisplayName("Record 3109: Fax is 717-845-3269")
	void FaxOfRecord3109() {
		assertEquals("717-845-3269", customers.get(3108).getFax());
	}

	@Test
	@DisplayName("Record 3109: Email is terrie@stile.com")
	void EmailOfRecord3109() {
		assertEquals("terrie@stile.com", customers.get(3108).getEmail());
	}

	@Test
	@DisplayName("Record 3109: Web is http://www.terriestile.com")
	void WebOfRecord3109() {
		assertEquals("http://www.terriestile.com", customers.get(3108).getWeb());
	}
}
