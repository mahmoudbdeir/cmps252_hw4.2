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

@Tag("12")
class Record_346 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 346: FirstName is Zane")
	void FirstNameOfRecord346() {
		assertEquals("Zane", customers.get(345).getFirstName());
	}

	@Test
	@DisplayName("Record 346: LastName is Greenleaf")
	void LastNameOfRecord346() {
		assertEquals("Greenleaf", customers.get(345).getLastName());
	}

	@Test
	@DisplayName("Record 346: Company is Blt")
	void CompanyOfRecord346() {
		assertEquals("Blt", customers.get(345).getCompany());
	}

	@Test
	@DisplayName("Record 346: Address is 700 Packer Ave")
	void AddressOfRecord346() {
		assertEquals("700 Packer Ave", customers.get(345).getAddress());
	}

	@Test
	@DisplayName("Record 346: City is Philadelphia")
	void CityOfRecord346() {
		assertEquals("Philadelphia", customers.get(345).getCity());
	}

	@Test
	@DisplayName("Record 346: County is Philadelphia")
	void CountyOfRecord346() {
		assertEquals("Philadelphia", customers.get(345).getCounty());
	}

	@Test
	@DisplayName("Record 346: State is PA")
	void StateOfRecord346() {
		assertEquals("PA", customers.get(345).getState());
	}

	@Test
	@DisplayName("Record 346: ZIP is 19148")
	void ZIPOfRecord346() {
		assertEquals("19148", customers.get(345).getZIP());
	}

	@Test
	@DisplayName("Record 346: Phone is 215-389-2541")
	void PhoneOfRecord346() {
		assertEquals("215-389-2541", customers.get(345).getPhone());
	}

	@Test
	@DisplayName("Record 346: Fax is 215-389-3843")
	void FaxOfRecord346() {
		assertEquals("215-389-3843", customers.get(345).getFax());
	}

	@Test
	@DisplayName("Record 346: Email is zane@greenleaf.com")
	void EmailOfRecord346() {
		assertEquals("zane@greenleaf.com", customers.get(345).getEmail());
	}

	@Test
	@DisplayName("Record 346: Web is http://www.zanegreenleaf.com")
	void WebOfRecord346() {
		assertEquals("http://www.zanegreenleaf.com", customers.get(345).getWeb());
	}
}
