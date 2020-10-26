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

@Tag("13")
class Record_4748 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4748: FirstName is Roseann")
	void FirstNameOfRecord4748() {
		assertEquals("Roseann", customers.get(4747).getFirstName());
	}

	@Test
	@DisplayName("Record 4748: LastName is Valree")
	void LastNameOfRecord4748() {
		assertEquals("Valree", customers.get(4747).getLastName());
	}

	@Test
	@DisplayName("Record 4748: Company is Allison Pest Control")
	void CompanyOfRecord4748() {
		assertEquals("Allison Pest Control", customers.get(4747).getCompany());
	}

	@Test
	@DisplayName("Record 4748: Address is 225 S 15th St")
	void AddressOfRecord4748() {
		assertEquals("225 S 15th St", customers.get(4747).getAddress());
	}

	@Test
	@DisplayName("Record 4748: City is Philadelphia")
	void CityOfRecord4748() {
		assertEquals("Philadelphia", customers.get(4747).getCity());
	}

	@Test
	@DisplayName("Record 4748: County is Philadelphia")
	void CountyOfRecord4748() {
		assertEquals("Philadelphia", customers.get(4747).getCounty());
	}

	@Test
	@DisplayName("Record 4748: State is PA")
	void StateOfRecord4748() {
		assertEquals("PA", customers.get(4747).getState());
	}

	@Test
	@DisplayName("Record 4748: ZIP is 19102")
	void ZIPOfRecord4748() {
		assertEquals("19102", customers.get(4747).getZIP());
	}

	@Test
	@DisplayName("Record 4748: Phone is 215-545-9763")
	void PhoneOfRecord4748() {
		assertEquals("215-545-9763", customers.get(4747).getPhone());
	}

	@Test
	@DisplayName("Record 4748: Fax is 215-545-9988")
	void FaxOfRecord4748() {
		assertEquals("215-545-9988", customers.get(4747).getFax());
	}

	@Test
	@DisplayName("Record 4748: Email is roseann@valree.com")
	void EmailOfRecord4748() {
		assertEquals("roseann@valree.com", customers.get(4747).getEmail());
	}

	@Test
	@DisplayName("Record 4748: Web is http://www.roseannvalree.com")
	void WebOfRecord4748() {
		assertEquals("http://www.roseannvalree.com", customers.get(4747).getWeb());
	}
}
