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

@Tag("40")
class Record_4252 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4252: FirstName is Mona")
	void FirstNameOfRecord4252() {
		assertEquals("Mona", customers.get(4251).getFirstName());
	}

	@Test
	@DisplayName("Record 4252: LastName is Rynke")
	void LastNameOfRecord4252() {
		assertEquals("Rynke", customers.get(4251).getLastName());
	}

	@Test
	@DisplayName("Record 4252: Company is Harris Insurance Services")
	void CompanyOfRecord4252() {
		assertEquals("Harris Insurance Services", customers.get(4251).getCompany());
	}

	@Test
	@DisplayName("Record 4252: Address is 1830 E Sahara Ave")
	void AddressOfRecord4252() {
		assertEquals("1830 E Sahara Ave", customers.get(4251).getAddress());
	}

	@Test
	@DisplayName("Record 4252: City is Las Vegas")
	void CityOfRecord4252() {
		assertEquals("Las Vegas", customers.get(4251).getCity());
	}

	@Test
	@DisplayName("Record 4252: County is Clark")
	void CountyOfRecord4252() {
		assertEquals("Clark", customers.get(4251).getCounty());
	}

	@Test
	@DisplayName("Record 4252: State is NV")
	void StateOfRecord4252() {
		assertEquals("NV", customers.get(4251).getState());
	}

	@Test
	@DisplayName("Record 4252: ZIP is 89104")
	void ZIPOfRecord4252() {
		assertEquals("89104", customers.get(4251).getZIP());
	}

	@Test
	@DisplayName("Record 4252: Phone is 702-892-1199")
	void PhoneOfRecord4252() {
		assertEquals("702-892-1199", customers.get(4251).getPhone());
	}

	@Test
	@DisplayName("Record 4252: Fax is 702-892-4667")
	void FaxOfRecord4252() {
		assertEquals("702-892-4667", customers.get(4251).getFax());
	}

	@Test
	@DisplayName("Record 4252: Email is mona@rynke.com")
	void EmailOfRecord4252() {
		assertEquals("mona@rynke.com", customers.get(4251).getEmail());
	}

	@Test
	@DisplayName("Record 4252: Web is http://www.monarynke.com")
	void WebOfRecord4252() {
		assertEquals("http://www.monarynke.com", customers.get(4251).getWeb());
	}
}
