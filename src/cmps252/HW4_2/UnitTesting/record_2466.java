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
class Record_2466 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2466: FirstName is Barrett")
	void FirstNameOfRecord2466() {
		assertEquals("Barrett", customers.get(2465).getFirstName());
	}

	@Test
	@DisplayName("Record 2466: LastName is Hanington")
	void LastNameOfRecord2466() {
		assertEquals("Hanington", customers.get(2465).getLastName());
	}

	@Test
	@DisplayName("Record 2466: Company is Thompson, Anne M Esq")
	void CompanyOfRecord2466() {
		assertEquals("Thompson, Anne M Esq", customers.get(2465).getCompany());
	}

	@Test
	@DisplayName("Record 2466: Address is 3414 Bayshore Rd")
	void AddressOfRecord2466() {
		assertEquals("3414 Bayshore Rd", customers.get(2465).getAddress());
	}

	@Test
	@DisplayName("Record 2466: City is Cape May")
	void CityOfRecord2466() {
		assertEquals("Cape May", customers.get(2465).getCity());
	}

	@Test
	@DisplayName("Record 2466: County is Cape May")
	void CountyOfRecord2466() {
		assertEquals("Cape May", customers.get(2465).getCounty());
	}

	@Test
	@DisplayName("Record 2466: State is NJ")
	void StateOfRecord2466() {
		assertEquals("NJ", customers.get(2465).getState());
	}

	@Test
	@DisplayName("Record 2466: ZIP is 8204")
	void ZIPOfRecord2466() {
		assertEquals("8204", customers.get(2465).getZIP());
	}

	@Test
	@DisplayName("Record 2466: Phone is 609-889-8784")
	void PhoneOfRecord2466() {
		assertEquals("609-889-8784", customers.get(2465).getPhone());
	}

	@Test
	@DisplayName("Record 2466: Fax is 609-889-3571")
	void FaxOfRecord2466() {
		assertEquals("609-889-3571", customers.get(2465).getFax());
	}

	@Test
	@DisplayName("Record 2466: Email is barrett@hanington.com")
	void EmailOfRecord2466() {
		assertEquals("barrett@hanington.com", customers.get(2465).getEmail());
	}

	@Test
	@DisplayName("Record 2466: Web is http://www.barretthanington.com")
	void WebOfRecord2466() {
		assertEquals("http://www.barretthanington.com", customers.get(2465).getWeb());
	}
}
