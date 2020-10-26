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

@Tag("18")
class Record_949 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 949: FirstName is Hayden")
	void FirstNameOfRecord949() {
		assertEquals("Hayden", customers.get(948).getFirstName());
	}

	@Test
	@DisplayName("Record 949: LastName is Cocca")
	void LastNameOfRecord949() {
		assertEquals("Cocca", customers.get(948).getLastName());
	}

	@Test
	@DisplayName("Record 949: Company is Fayette Electric Cooprtv Inc")
	void CompanyOfRecord949() {
		assertEquals("Fayette Electric Cooprtv Inc", customers.get(948).getCompany());
	}

	@Test
	@DisplayName("Record 949: Address is 7142 W Belmont Ave")
	void AddressOfRecord949() {
		assertEquals("7142 W Belmont Ave", customers.get(948).getAddress());
	}

	@Test
	@DisplayName("Record 949: City is Chicago")
	void CityOfRecord949() {
		assertEquals("Chicago", customers.get(948).getCity());
	}

	@Test
	@DisplayName("Record 949: County is Cook")
	void CountyOfRecord949() {
		assertEquals("Cook", customers.get(948).getCounty());
	}

	@Test
	@DisplayName("Record 949: State is IL")
	void StateOfRecord949() {
		assertEquals("IL", customers.get(948).getState());
	}

	@Test
	@DisplayName("Record 949: ZIP is 60634")
	void ZIPOfRecord949() {
		assertEquals("60634", customers.get(948).getZIP());
	}

	@Test
	@DisplayName("Record 949: Phone is 773-286-8054")
	void PhoneOfRecord949() {
		assertEquals("773-286-8054", customers.get(948).getPhone());
	}

	@Test
	@DisplayName("Record 949: Fax is 773-286-6163")
	void FaxOfRecord949() {
		assertEquals("773-286-6163", customers.get(948).getFax());
	}

	@Test
	@DisplayName("Record 949: Email is hayden@cocca.com")
	void EmailOfRecord949() {
		assertEquals("hayden@cocca.com", customers.get(948).getEmail());
	}

	@Test
	@DisplayName("Record 949: Web is http://www.haydencocca.com")
	void WebOfRecord949() {
		assertEquals("http://www.haydencocca.com", customers.get(948).getWeb());
	}
}
