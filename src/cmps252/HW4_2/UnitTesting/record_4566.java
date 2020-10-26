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

@Tag("37")
class Record_4566 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4566: FirstName is Mac")
	void FirstNameOfRecord4566() {
		assertEquals("Mac", customers.get(4565).getFirstName());
	}

	@Test
	@DisplayName("Record 4566: LastName is Gaut")
	void LastNameOfRecord4566() {
		assertEquals("Gaut", customers.get(4565).getLastName());
	}

	@Test
	@DisplayName("Record 4566: Company is Copy Center Inc")
	void CompanyOfRecord4566() {
		assertEquals("Copy Center Inc", customers.get(4565).getCompany());
	}

	@Test
	@DisplayName("Record 4566: Address is 20 Commercial Blvd")
	void AddressOfRecord4566() {
		assertEquals("20 Commercial Blvd", customers.get(4565).getAddress());
	}

	@Test
	@DisplayName("Record 4566: City is Novato")
	void CityOfRecord4566() {
		assertEquals("Novato", customers.get(4565).getCity());
	}

	@Test
	@DisplayName("Record 4566: County is Marin")
	void CountyOfRecord4566() {
		assertEquals("Marin", customers.get(4565).getCounty());
	}

	@Test
	@DisplayName("Record 4566: State is CA")
	void StateOfRecord4566() {
		assertEquals("CA", customers.get(4565).getState());
	}

	@Test
	@DisplayName("Record 4566: ZIP is 94949")
	void ZIPOfRecord4566() {
		assertEquals("94949", customers.get(4565).getZIP());
	}

	@Test
	@DisplayName("Record 4566: Phone is 415-883-6653")
	void PhoneOfRecord4566() {
		assertEquals("415-883-6653", customers.get(4565).getPhone());
	}

	@Test
	@DisplayName("Record 4566: Fax is 415-883-6083")
	void FaxOfRecord4566() {
		assertEquals("415-883-6083", customers.get(4565).getFax());
	}

	@Test
	@DisplayName("Record 4566: Email is mac@gaut.com")
	void EmailOfRecord4566() {
		assertEquals("mac@gaut.com", customers.get(4565).getEmail());
	}

	@Test
	@DisplayName("Record 4566: Web is http://www.macgaut.com")
	void WebOfRecord4566() {
		assertEquals("http://www.macgaut.com", customers.get(4565).getWeb());
	}
}
