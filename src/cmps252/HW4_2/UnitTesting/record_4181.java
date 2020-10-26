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

@Tag("45")
class Record_4181 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4181: FirstName is Shari")
	void FirstNameOfRecord4181() {
		assertEquals("Shari", customers.get(4180).getFirstName());
	}

	@Test
	@DisplayName("Record 4181: LastName is Pieloch")
	void LastNameOfRecord4181() {
		assertEquals("Pieloch", customers.get(4180).getLastName());
	}

	@Test
	@DisplayName("Record 4181: Company is Elegant Flowers")
	void CompanyOfRecord4181() {
		assertEquals("Elegant Flowers", customers.get(4180).getCompany());
	}

	@Test
	@DisplayName("Record 4181: Address is 502 W 6th St")
	void AddressOfRecord4181() {
		assertEquals("502 W 6th St", customers.get(4180).getAddress());
	}

	@Test
	@DisplayName("Record 4181: City is Tulsa")
	void CityOfRecord4181() {
		assertEquals("Tulsa", customers.get(4180).getCity());
	}

	@Test
	@DisplayName("Record 4181: County is Tulsa")
	void CountyOfRecord4181() {
		assertEquals("Tulsa", customers.get(4180).getCounty());
	}

	@Test
	@DisplayName("Record 4181: State is OK")
	void StateOfRecord4181() {
		assertEquals("OK", customers.get(4180).getState());
	}

	@Test
	@DisplayName("Record 4181: ZIP is 74119")
	void ZIPOfRecord4181() {
		assertEquals("74119", customers.get(4180).getZIP());
	}

	@Test
	@DisplayName("Record 4181: Phone is 918-587-1353")
	void PhoneOfRecord4181() {
		assertEquals("918-587-1353", customers.get(4180).getPhone());
	}

	@Test
	@DisplayName("Record 4181: Fax is 918-587-9562")
	void FaxOfRecord4181() {
		assertEquals("918-587-9562", customers.get(4180).getFax());
	}

	@Test
	@DisplayName("Record 4181: Email is shari@pieloch.com")
	void EmailOfRecord4181() {
		assertEquals("shari@pieloch.com", customers.get(4180).getEmail());
	}

	@Test
	@DisplayName("Record 4181: Web is http://www.sharipieloch.com")
	void WebOfRecord4181() {
		assertEquals("http://www.sharipieloch.com", customers.get(4180).getWeb());
	}
}
