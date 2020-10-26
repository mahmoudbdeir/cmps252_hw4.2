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
class Record_4796 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4796: FirstName is Tyron")
	void FirstNameOfRecord4796() {
		assertEquals("Tyron", customers.get(4795).getFirstName());
	}

	@Test
	@DisplayName("Record 4796: LastName is Skrebes")
	void LastNameOfRecord4796() {
		assertEquals("Skrebes", customers.get(4795).getLastName());
	}

	@Test
	@DisplayName("Record 4796: Company is Insty Prints Printing Centers")
	void CompanyOfRecord4796() {
		assertEquals("Insty Prints Printing Centers", customers.get(4795).getCompany());
	}

	@Test
	@DisplayName("Record 4796: Address is 23588 Connecticut St")
	void AddressOfRecord4796() {
		assertEquals("23588 Connecticut St", customers.get(4795).getAddress());
	}

	@Test
	@DisplayName("Record 4796: City is Hayward")
	void CityOfRecord4796() {
		assertEquals("Hayward", customers.get(4795).getCity());
	}

	@Test
	@DisplayName("Record 4796: County is Alameda")
	void CountyOfRecord4796() {
		assertEquals("Alameda", customers.get(4795).getCounty());
	}

	@Test
	@DisplayName("Record 4796: State is CA")
	void StateOfRecord4796() {
		assertEquals("CA", customers.get(4795).getState());
	}

	@Test
	@DisplayName("Record 4796: ZIP is 94545")
	void ZIPOfRecord4796() {
		assertEquals("94545", customers.get(4795).getZIP());
	}

	@Test
	@DisplayName("Record 4796: Phone is 510-783-9834")
	void PhoneOfRecord4796() {
		assertEquals("510-783-9834", customers.get(4795).getPhone());
	}

	@Test
	@DisplayName("Record 4796: Fax is 510-783-8531")
	void FaxOfRecord4796() {
		assertEquals("510-783-8531", customers.get(4795).getFax());
	}

	@Test
	@DisplayName("Record 4796: Email is tyron@skrebes.com")
	void EmailOfRecord4796() {
		assertEquals("tyron@skrebes.com", customers.get(4795).getEmail());
	}

	@Test
	@DisplayName("Record 4796: Web is http://www.tyronskrebes.com")
	void WebOfRecord4796() {
		assertEquals("http://www.tyronskrebes.com", customers.get(4795).getWeb());
	}
}
