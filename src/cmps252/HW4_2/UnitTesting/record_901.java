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

@Tag("16")
class Record_901 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 901: FirstName is Conrad")
	void FirstNameOfRecord901() {
		assertEquals("Conrad", customers.get(900).getFirstName());
	}

	@Test
	@DisplayName("Record 901: LastName is Gornick")
	void LastNameOfRecord901() {
		assertEquals("Gornick", customers.get(900).getLastName());
	}

	@Test
	@DisplayName("Record 901: Company is Minarik Electric Co")
	void CompanyOfRecord901() {
		assertEquals("Minarik Electric Co", customers.get(900).getCompany());
	}

	@Test
	@DisplayName("Record 901: Address is 728 Chestnut St")
	void AddressOfRecord901() {
		assertEquals("728 Chestnut St", customers.get(900).getAddress());
	}

	@Test
	@DisplayName("Record 901: City is Philadelphia")
	void CityOfRecord901() {
		assertEquals("Philadelphia", customers.get(900).getCity());
	}

	@Test
	@DisplayName("Record 901: County is Philadelphia")
	void CountyOfRecord901() {
		assertEquals("Philadelphia", customers.get(900).getCounty());
	}

	@Test
	@DisplayName("Record 901: State is PA")
	void StateOfRecord901() {
		assertEquals("PA", customers.get(900).getState());
	}

	@Test
	@DisplayName("Record 901: ZIP is 19106")
	void ZIPOfRecord901() {
		assertEquals("19106", customers.get(900).getZIP());
	}

	@Test
	@DisplayName("Record 901: Phone is 215-922-6352")
	void PhoneOfRecord901() {
		assertEquals("215-922-6352", customers.get(900).getPhone());
	}

	@Test
	@DisplayName("Record 901: Fax is 215-922-6244")
	void FaxOfRecord901() {
		assertEquals("215-922-6244", customers.get(900).getFax());
	}

	@Test
	@DisplayName("Record 901: Email is conrad@gornick.com")
	void EmailOfRecord901() {
		assertEquals("conrad@gornick.com", customers.get(900).getEmail());
	}

	@Test
	@DisplayName("Record 901: Web is http://www.conradgornick.com")
	void WebOfRecord901() {
		assertEquals("http://www.conradgornick.com", customers.get(900).getWeb());
	}
}
