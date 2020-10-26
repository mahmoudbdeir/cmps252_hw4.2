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

@Tag("25")
class Record_3213 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3213: FirstName is Patty")
	void FirstNameOfRecord3213() {
		assertEquals("Patty", customers.get(3212).getFirstName());
	}

	@Test
	@DisplayName("Record 3213: LastName is Beausolyl")
	void LastNameOfRecord3213() {
		assertEquals("Beausolyl", customers.get(3212).getLastName());
	}

	@Test
	@DisplayName("Record 3213: Company is Warren, J Steve Esq")
	void CompanyOfRecord3213() {
		assertEquals("Warren, J Steve Esq", customers.get(3212).getCompany());
	}

	@Test
	@DisplayName("Record 3213: Address is 4321 N Ballard Rd")
	void AddressOfRecord3213() {
		assertEquals("4321 N Ballard Rd", customers.get(3212).getAddress());
	}

	@Test
	@DisplayName("Record 3213: City is Appleton")
	void CityOfRecord3213() {
		assertEquals("Appleton", customers.get(3212).getCity());
	}

	@Test
	@DisplayName("Record 3213: County is Outagamie")
	void CountyOfRecord3213() {
		assertEquals("Outagamie", customers.get(3212).getCounty());
	}

	@Test
	@DisplayName("Record 3213: State is WI")
	void StateOfRecord3213() {
		assertEquals("WI", customers.get(3212).getState());
	}

	@Test
	@DisplayName("Record 3213: ZIP is 54915")
	void ZIPOfRecord3213() {
		assertEquals("54915", customers.get(3212).getZIP());
	}

	@Test
	@DisplayName("Record 3213: Phone is 920-730-0972")
	void PhoneOfRecord3213() {
		assertEquals("920-730-0972", customers.get(3212).getPhone());
	}

	@Test
	@DisplayName("Record 3213: Fax is 920-730-2916")
	void FaxOfRecord3213() {
		assertEquals("920-730-2916", customers.get(3212).getFax());
	}

	@Test
	@DisplayName("Record 3213: Email is patty@beausolyl.com")
	void EmailOfRecord3213() {
		assertEquals("patty@beausolyl.com", customers.get(3212).getEmail());
	}

	@Test
	@DisplayName("Record 3213: Web is http://www.pattybeausolyl.com")
	void WebOfRecord3213() {
		assertEquals("http://www.pattybeausolyl.com", customers.get(3212).getWeb());
	}
}
