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

@Tag("17")
class Record_2504 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2504: FirstName is Malissa")
	void FirstNameOfRecord2504() {
		assertEquals("Malissa", customers.get(2503).getFirstName());
	}

	@Test
	@DisplayName("Record 2504: LastName is Tifft")
	void LastNameOfRecord2504() {
		assertEquals("Tifft", customers.get(2503).getLastName());
	}

	@Test
	@DisplayName("Record 2504: Company is Hill Printing Inc")
	void CompanyOfRecord2504() {
		assertEquals("Hill Printing Inc", customers.get(2503).getCompany());
	}

	@Test
	@DisplayName("Record 2504: Address is 6401 Skillman St")
	void AddressOfRecord2504() {
		assertEquals("6401 Skillman St", customers.get(2503).getAddress());
	}

	@Test
	@DisplayName("Record 2504: City is Dallas")
	void CityOfRecord2504() {
		assertEquals("Dallas", customers.get(2503).getCity());
	}

	@Test
	@DisplayName("Record 2504: County is Dallas")
	void CountyOfRecord2504() {
		assertEquals("Dallas", customers.get(2503).getCounty());
	}

	@Test
	@DisplayName("Record 2504: State is TX")
	void StateOfRecord2504() {
		assertEquals("TX", customers.get(2503).getState());
	}

	@Test
	@DisplayName("Record 2504: ZIP is 75231")
	void ZIPOfRecord2504() {
		assertEquals("75231", customers.get(2503).getZIP());
	}

	@Test
	@DisplayName("Record 2504: Phone is 214-343-6757")
	void PhoneOfRecord2504() {
		assertEquals("214-343-6757", customers.get(2503).getPhone());
	}

	@Test
	@DisplayName("Record 2504: Fax is 214-343-9861")
	void FaxOfRecord2504() {
		assertEquals("214-343-9861", customers.get(2503).getFax());
	}

	@Test
	@DisplayName("Record 2504: Email is malissa@tifft.com")
	void EmailOfRecord2504() {
		assertEquals("malissa@tifft.com", customers.get(2503).getEmail());
	}

	@Test
	@DisplayName("Record 2504: Web is http://www.malissatifft.com")
	void WebOfRecord2504() {
		assertEquals("http://www.malissatifft.com", customers.get(2503).getWeb());
	}
}
