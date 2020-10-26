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

@Tag("22")
class Record_4080 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4080: FirstName is Marion")
	void FirstNameOfRecord4080() {
		assertEquals("Marion", customers.get(4079).getFirstName());
	}

	@Test
	@DisplayName("Record 4080: LastName is Rosecrans")
	void LastNameOfRecord4080() {
		assertEquals("Rosecrans", customers.get(4079).getLastName());
	}

	@Test
	@DisplayName("Record 4080: Company is Sun Gro")
	void CompanyOfRecord4080() {
		assertEquals("Sun Gro", customers.get(4079).getCompany());
	}

	@Test
	@DisplayName("Record 4080: Address is 30 Shipyard St")
	void AddressOfRecord4080() {
		assertEquals("30 Shipyard St", customers.get(4079).getAddress());
	}

	@Test
	@DisplayName("Record 4080: City is Providence")
	void CityOfRecord4080() {
		assertEquals("Providence", customers.get(4079).getCity());
	}

	@Test
	@DisplayName("Record 4080: County is Providence")
	void CountyOfRecord4080() {
		assertEquals("Providence", customers.get(4079).getCounty());
	}

	@Test
	@DisplayName("Record 4080: State is RI")
	void StateOfRecord4080() {
		assertEquals("RI", customers.get(4079).getState());
	}

	@Test
	@DisplayName("Record 4080: ZIP is 2905")
	void ZIPOfRecord4080() {
		assertEquals("2905", customers.get(4079).getZIP());
	}

	@Test
	@DisplayName("Record 4080: Phone is 401-437-7036")
	void PhoneOfRecord4080() {
		assertEquals("401-437-7036", customers.get(4079).getPhone());
	}

	@Test
	@DisplayName("Record 4080: Fax is 401-437-6632")
	void FaxOfRecord4080() {
		assertEquals("401-437-6632", customers.get(4079).getFax());
	}

	@Test
	@DisplayName("Record 4080: Email is marion@rosecrans.com")
	void EmailOfRecord4080() {
		assertEquals("marion@rosecrans.com", customers.get(4079).getEmail());
	}

	@Test
	@DisplayName("Record 4080: Web is http://www.marionrosecrans.com")
	void WebOfRecord4080() {
		assertEquals("http://www.marionrosecrans.com", customers.get(4079).getWeb());
	}
}
