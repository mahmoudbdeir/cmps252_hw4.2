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

@Tag("9")
class Record_3921 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3921: FirstName is Dominique")
	void FirstNameOfRecord3921() {
		assertEquals("Dominique", customers.get(3920).getFirstName());
	}

	@Test
	@DisplayName("Record 3921: LastName is Semidey")
	void LastNameOfRecord3921() {
		assertEquals("Semidey", customers.get(3920).getLastName());
	}

	@Test
	@DisplayName("Record 3921: Company is Mccalls Dept Store")
	void CompanyOfRecord3921() {
		assertEquals("Mccalls Dept Store", customers.get(3920).getCompany());
	}

	@Test
	@DisplayName("Record 3921: Address is Hwy 634")
	void AddressOfRecord3921() {
		assertEquals("Hwy 634", customers.get(3920).getAddress());
	}

	@Test
	@DisplayName("Record 3921: City is Lawrenceville")
	void CityOfRecord3921() {
		assertEquals("Lawrenceville", customers.get(3920).getCity());
	}

	@Test
	@DisplayName("Record 3921: County is Brunswick")
	void CountyOfRecord3921() {
		assertEquals("Brunswick", customers.get(3920).getCounty());
	}

	@Test
	@DisplayName("Record 3921: State is VA")
	void StateOfRecord3921() {
		assertEquals("VA", customers.get(3920).getState());
	}

	@Test
	@DisplayName("Record 3921: ZIP is 23868")
	void ZIPOfRecord3921() {
		assertEquals("23868", customers.get(3920).getZIP());
	}

	@Test
	@DisplayName("Record 3921: Phone is 434-848-0502")
	void PhoneOfRecord3921() {
		assertEquals("434-848-0502", customers.get(3920).getPhone());
	}

	@Test
	@DisplayName("Record 3921: Fax is 434-848-9797")
	void FaxOfRecord3921() {
		assertEquals("434-848-9797", customers.get(3920).getFax());
	}

	@Test
	@DisplayName("Record 3921: Email is dominique@semidey.com")
	void EmailOfRecord3921() {
		assertEquals("dominique@semidey.com", customers.get(3920).getEmail());
	}

	@Test
	@DisplayName("Record 3921: Web is http://www.dominiquesemidey.com")
	void WebOfRecord3921() {
		assertEquals("http://www.dominiquesemidey.com", customers.get(3920).getWeb());
	}
}
