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

@Tag("44")
class Record_1501 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1501: FirstName is Noelle")
	void FirstNameOfRecord1501() {
		assertEquals("Noelle", customers.get(1500).getFirstName());
	}

	@Test
	@DisplayName("Record 1501: LastName is Aragon")
	void LastNameOfRecord1501() {
		assertEquals("Aragon", customers.get(1500).getLastName());
	}

	@Test
	@DisplayName("Record 1501: Company is Vermont Bag & Film Corp")
	void CompanyOfRecord1501() {
		assertEquals("Vermont Bag & Film Corp", customers.get(1500).getCompany());
	}

	@Test
	@DisplayName("Record 1501: Address is 4901 W State St")
	void AddressOfRecord1501() {
		assertEquals("4901 W State St", customers.get(1500).getAddress());
	}

	@Test
	@DisplayName("Record 1501: City is Milwaukee")
	void CityOfRecord1501() {
		assertEquals("Milwaukee", customers.get(1500).getCity());
	}

	@Test
	@DisplayName("Record 1501: County is Milwaukee")
	void CountyOfRecord1501() {
		assertEquals("Milwaukee", customers.get(1500).getCounty());
	}

	@Test
	@DisplayName("Record 1501: State is WI")
	void StateOfRecord1501() {
		assertEquals("WI", customers.get(1500).getState());
	}

	@Test
	@DisplayName("Record 1501: ZIP is 53208")
	void ZIPOfRecord1501() {
		assertEquals("53208", customers.get(1500).getZIP());
	}

	@Test
	@DisplayName("Record 1501: Phone is 414-771-2707")
	void PhoneOfRecord1501() {
		assertEquals("414-771-2707", customers.get(1500).getPhone());
	}

	@Test
	@DisplayName("Record 1501: Fax is 414-771-7844")
	void FaxOfRecord1501() {
		assertEquals("414-771-7844", customers.get(1500).getFax());
	}

	@Test
	@DisplayName("Record 1501: Email is noelle@aragon.com")
	void EmailOfRecord1501() {
		assertEquals("noelle@aragon.com", customers.get(1500).getEmail());
	}

	@Test
	@DisplayName("Record 1501: Web is http://www.noellearagon.com")
	void WebOfRecord1501() {
		assertEquals("http://www.noellearagon.com", customers.get(1500).getWeb());
	}
}
