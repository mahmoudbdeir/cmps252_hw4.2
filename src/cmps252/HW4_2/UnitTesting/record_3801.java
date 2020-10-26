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

@Tag("0")
class Record_3801 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3801: FirstName is Ernest")
	void FirstNameOfRecord3801() {
		assertEquals("Ernest", customers.get(3800).getFirstName());
	}

	@Test
	@DisplayName("Record 3801: LastName is Loveless")
	void LastNameOfRecord3801() {
		assertEquals("Loveless", customers.get(3800).getLastName());
	}

	@Test
	@DisplayName("Record 3801: Company is Nichols, Jerry R Esq")
	void CompanyOfRecord3801() {
		assertEquals("Nichols, Jerry R Esq", customers.get(3800).getCompany());
	}

	@Test
	@DisplayName("Record 3801: Address is 82 Clifford St")
	void AddressOfRecord3801() {
		assertEquals("82 Clifford St", customers.get(3800).getAddress());
	}

	@Test
	@DisplayName("Record 3801: City is Newark")
	void CityOfRecord3801() {
		assertEquals("Newark", customers.get(3800).getCity());
	}

	@Test
	@DisplayName("Record 3801: County is Essex")
	void CountyOfRecord3801() {
		assertEquals("Essex", customers.get(3800).getCounty());
	}

	@Test
	@DisplayName("Record 3801: State is NJ")
	void StateOfRecord3801() {
		assertEquals("NJ", customers.get(3800).getState());
	}

	@Test
	@DisplayName("Record 3801: ZIP is 7105")
	void ZIPOfRecord3801() {
		assertEquals("7105", customers.get(3800).getZIP());
	}

	@Test
	@DisplayName("Record 3801: Phone is 973-589-2976")
	void PhoneOfRecord3801() {
		assertEquals("973-589-2976", customers.get(3800).getPhone());
	}

	@Test
	@DisplayName("Record 3801: Fax is 973-589-8293")
	void FaxOfRecord3801() {
		assertEquals("973-589-8293", customers.get(3800).getFax());
	}

	@Test
	@DisplayName("Record 3801: Email is ernest@loveless.com")
	void EmailOfRecord3801() {
		assertEquals("ernest@loveless.com", customers.get(3800).getEmail());
	}

	@Test
	@DisplayName("Record 3801: Web is http://www.ernestloveless.com")
	void WebOfRecord3801() {
		assertEquals("http://www.ernestloveless.com", customers.get(3800).getWeb());
	}
}
