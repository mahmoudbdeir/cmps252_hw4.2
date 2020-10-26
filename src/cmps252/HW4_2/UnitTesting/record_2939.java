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

@Tag("24")
class Record_2939 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2939: FirstName is Darcy")
	void FirstNameOfRecord2939() {
		assertEquals("Darcy", customers.get(2938).getFirstName());
	}

	@Test
	@DisplayName("Record 2939: LastName is Helmstetter")
	void LastNameOfRecord2939() {
		assertEquals("Helmstetter", customers.get(2938).getLastName());
	}

	@Test
	@DisplayName("Record 2939: Company is Morrison Supply Co")
	void CompanyOfRecord2939() {
		assertEquals("Morrison Supply Co", customers.get(2938).getCompany());
	}

	@Test
	@DisplayName("Record 2939: Address is 2001 W O St")
	void AddressOfRecord2939() {
		assertEquals("2001 W O St", customers.get(2938).getAddress());
	}

	@Test
	@DisplayName("Record 2939: City is Lincoln")
	void CityOfRecord2939() {
		assertEquals("Lincoln", customers.get(2938).getCity());
	}

	@Test
	@DisplayName("Record 2939: County is Lancaster")
	void CountyOfRecord2939() {
		assertEquals("Lancaster", customers.get(2938).getCounty());
	}

	@Test
	@DisplayName("Record 2939: State is NE")
	void StateOfRecord2939() {
		assertEquals("NE", customers.get(2938).getState());
	}

	@Test
	@DisplayName("Record 2939: ZIP is 68528")
	void ZIPOfRecord2939() {
		assertEquals("68528", customers.get(2938).getZIP());
	}

	@Test
	@DisplayName("Record 2939: Phone is 402-477-1200")
	void PhoneOfRecord2939() {
		assertEquals("402-477-1200", customers.get(2938).getPhone());
	}

	@Test
	@DisplayName("Record 2939: Fax is 402-477-5664")
	void FaxOfRecord2939() {
		assertEquals("402-477-5664", customers.get(2938).getFax());
	}

	@Test
	@DisplayName("Record 2939: Email is darcy@helmstetter.com")
	void EmailOfRecord2939() {
		assertEquals("darcy@helmstetter.com", customers.get(2938).getEmail());
	}

	@Test
	@DisplayName("Record 2939: Web is http://www.darcyhelmstetter.com")
	void WebOfRecord2939() {
		assertEquals("http://www.darcyhelmstetter.com", customers.get(2938).getWeb());
	}
}
