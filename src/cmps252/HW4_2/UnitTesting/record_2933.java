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

@Tag("49")
class Record_2933 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2933: FirstName is Marcelino")
	void FirstNameOfRecord2933() {
		assertEquals("Marcelino", customers.get(2932).getFirstName());
	}

	@Test
	@DisplayName("Record 2933: LastName is Ota")
	void LastNameOfRecord2933() {
		assertEquals("Ota", customers.get(2932).getLastName());
	}

	@Test
	@DisplayName("Record 2933: Company is Carter, Michael W Esq")
	void CompanyOfRecord2933() {
		assertEquals("Carter, Michael W Esq", customers.get(2932).getCompany());
	}

	@Test
	@DisplayName("Record 2933: Address is 4100 E Arkansas Ave")
	void AddressOfRecord2933() {
		assertEquals("4100 E Arkansas Ave", customers.get(2932).getAddress());
	}

	@Test
	@DisplayName("Record 2933: City is Denver")
	void CityOfRecord2933() {
		assertEquals("Denver", customers.get(2932).getCity());
	}

	@Test
	@DisplayName("Record 2933: County is Denver")
	void CountyOfRecord2933() {
		assertEquals("Denver", customers.get(2932).getCounty());
	}

	@Test
	@DisplayName("Record 2933: State is CO")
	void StateOfRecord2933() {
		assertEquals("CO", customers.get(2932).getState());
	}

	@Test
	@DisplayName("Record 2933: ZIP is 80222")
	void ZIPOfRecord2933() {
		assertEquals("80222", customers.get(2932).getZIP());
	}

	@Test
	@DisplayName("Record 2933: Phone is 303-758-1998")
	void PhoneOfRecord2933() {
		assertEquals("303-758-1998", customers.get(2932).getPhone());
	}

	@Test
	@DisplayName("Record 2933: Fax is 303-758-5523")
	void FaxOfRecord2933() {
		assertEquals("303-758-5523", customers.get(2932).getFax());
	}

	@Test
	@DisplayName("Record 2933: Email is marcelino@ota.com")
	void EmailOfRecord2933() {
		assertEquals("marcelino@ota.com", customers.get(2932).getEmail());
	}

	@Test
	@DisplayName("Record 2933: Web is http://www.marcelinoota.com")
	void WebOfRecord2933() {
		assertEquals("http://www.marcelinoota.com", customers.get(2932).getWeb());
	}
}
