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

@Tag("8")
class Record_2814 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2814: FirstName is Nelson")
	void FirstNameOfRecord2814() {
		assertEquals("Nelson", customers.get(2813).getFirstName());
	}

	@Test
	@DisplayName("Record 2814: LastName is Muzacz")
	void LastNameOfRecord2814() {
		assertEquals("Muzacz", customers.get(2813).getLastName());
	}

	@Test
	@DisplayName("Record 2814: Company is Rema Foods Inc")
	void CompanyOfRecord2814() {
		assertEquals("Rema Foods Inc", customers.get(2813).getCompany());
	}

	@Test
	@DisplayName("Record 2814: Address is 179 Spring St")
	void AddressOfRecord2814() {
		assertEquals("179 Spring St", customers.get(2813).getAddress());
	}

	@Test
	@DisplayName("Record 2814: City is Newton")
	void CityOfRecord2814() {
		assertEquals("Newton", customers.get(2813).getCity());
	}

	@Test
	@DisplayName("Record 2814: County is Sussex")
	void CountyOfRecord2814() {
		assertEquals("Sussex", customers.get(2813).getCounty());
	}

	@Test
	@DisplayName("Record 2814: State is NJ")
	void StateOfRecord2814() {
		assertEquals("NJ", customers.get(2813).getState());
	}

	@Test
	@DisplayName("Record 2814: ZIP is 7860")
	void ZIPOfRecord2814() {
		assertEquals("7860", customers.get(2813).getZIP());
	}

	@Test
	@DisplayName("Record 2814: Phone is 973-579-2784")
	void PhoneOfRecord2814() {
		assertEquals("973-579-2784", customers.get(2813).getPhone());
	}

	@Test
	@DisplayName("Record 2814: Fax is 973-579-5628")
	void FaxOfRecord2814() {
		assertEquals("973-579-5628", customers.get(2813).getFax());
	}

	@Test
	@DisplayName("Record 2814: Email is nelson@muzacz.com")
	void EmailOfRecord2814() {
		assertEquals("nelson@muzacz.com", customers.get(2813).getEmail());
	}

	@Test
	@DisplayName("Record 2814: Web is http://www.nelsonmuzacz.com")
	void WebOfRecord2814() {
		assertEquals("http://www.nelsonmuzacz.com", customers.get(2813).getWeb());
	}
}
