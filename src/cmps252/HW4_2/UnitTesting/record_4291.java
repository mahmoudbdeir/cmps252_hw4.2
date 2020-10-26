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

@Tag("28")
class Record_4291 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4291: FirstName is Gerardo")
	void FirstNameOfRecord4291() {
		assertEquals("Gerardo", customers.get(4290).getFirstName());
	}

	@Test
	@DisplayName("Record 4291: LastName is Slaugenhaupt")
	void LastNameOfRecord4291() {
		assertEquals("Slaugenhaupt", customers.get(4290).getLastName());
	}

	@Test
	@DisplayName("Record 4291: Company is Hortsch, Michael Md")
	void CompanyOfRecord4291() {
		assertEquals("Hortsch, Michael Md", customers.get(4290).getCompany());
	}

	@Test
	@DisplayName("Record 4291: Address is 21 S 5th St")
	void AddressOfRecord4291() {
		assertEquals("21 S 5th St", customers.get(4290).getAddress());
	}

	@Test
	@DisplayName("Record 4291: City is Philadelphia")
	void CityOfRecord4291() {
		assertEquals("Philadelphia", customers.get(4290).getCity());
	}

	@Test
	@DisplayName("Record 4291: County is Philadelphia")
	void CountyOfRecord4291() {
		assertEquals("Philadelphia", customers.get(4290).getCounty());
	}

	@Test
	@DisplayName("Record 4291: State is PA")
	void StateOfRecord4291() {
		assertEquals("PA", customers.get(4290).getState());
	}

	@Test
	@DisplayName("Record 4291: ZIP is 19106")
	void ZIPOfRecord4291() {
		assertEquals("19106", customers.get(4290).getZIP());
	}

	@Test
	@DisplayName("Record 4291: Phone is 215-922-8430")
	void PhoneOfRecord4291() {
		assertEquals("215-922-8430", customers.get(4290).getPhone());
	}

	@Test
	@DisplayName("Record 4291: Fax is 215-922-1458")
	void FaxOfRecord4291() {
		assertEquals("215-922-1458", customers.get(4290).getFax());
	}

	@Test
	@DisplayName("Record 4291: Email is gerardo@slaugenhaupt.com")
	void EmailOfRecord4291() {
		assertEquals("gerardo@slaugenhaupt.com", customers.get(4290).getEmail());
	}

	@Test
	@DisplayName("Record 4291: Web is http://www.gerardoslaugenhaupt.com")
	void WebOfRecord4291() {
		assertEquals("http://www.gerardoslaugenhaupt.com", customers.get(4290).getWeb());
	}
}
