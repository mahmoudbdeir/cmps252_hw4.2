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

@Tag("7")
class Record_4593 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4593: FirstName is Lupe")
	void FirstNameOfRecord4593() {
		assertEquals("Lupe", customers.get(4592).getFirstName());
	}

	@Test
	@DisplayName("Record 4593: LastName is Hatto")
	void LastNameOfRecord4593() {
		assertEquals("Hatto", customers.get(4592).getLastName());
	}

	@Test
	@DisplayName("Record 4593: Company is White Cross Drug Store")
	void CompanyOfRecord4593() {
		assertEquals("White Cross Drug Store", customers.get(4592).getCompany());
	}

	@Test
	@DisplayName("Record 4593: Address is 3239 Roymar Rd")
	void AddressOfRecord4593() {
		assertEquals("3239 Roymar Rd", customers.get(4592).getAddress());
	}

	@Test
	@DisplayName("Record 4593: City is Oceanside")
	void CityOfRecord4593() {
		assertEquals("Oceanside", customers.get(4592).getCity());
	}

	@Test
	@DisplayName("Record 4593: County is San Diego")
	void CountyOfRecord4593() {
		assertEquals("San Diego", customers.get(4592).getCounty());
	}

	@Test
	@DisplayName("Record 4593: State is CA")
	void StateOfRecord4593() {
		assertEquals("CA", customers.get(4592).getState());
	}

	@Test
	@DisplayName("Record 4593: ZIP is 92054")
	void ZIPOfRecord4593() {
		assertEquals("92054", customers.get(4592).getZIP());
	}

	@Test
	@DisplayName("Record 4593: Phone is 760-439-0067")
	void PhoneOfRecord4593() {
		assertEquals("760-439-0067", customers.get(4592).getPhone());
	}

	@Test
	@DisplayName("Record 4593: Fax is 760-439-0687")
	void FaxOfRecord4593() {
		assertEquals("760-439-0687", customers.get(4592).getFax());
	}

	@Test
	@DisplayName("Record 4593: Email is lupe@hatto.com")
	void EmailOfRecord4593() {
		assertEquals("lupe@hatto.com", customers.get(4592).getEmail());
	}

	@Test
	@DisplayName("Record 4593: Web is http://www.lupehatto.com")
	void WebOfRecord4593() {
		assertEquals("http://www.lupehatto.com", customers.get(4592).getWeb());
	}
}
