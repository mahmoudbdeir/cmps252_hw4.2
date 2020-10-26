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

@Tag("17")
class Record_3602 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3602: FirstName is Claudette")
	void FirstNameOfRecord3602() {
		assertEquals("Claudette", customers.get(3601).getFirstName());
	}

	@Test
	@DisplayName("Record 3602: LastName is Lorey")
	void LastNameOfRecord3602() {
		assertEquals("Lorey", customers.get(3601).getLastName());
	}

	@Test
	@DisplayName("Record 3602: Company is Letterhead House")
	void CompanyOfRecord3602() {
		assertEquals("Letterhead House", customers.get(3601).getCompany());
	}

	@Test
	@DisplayName("Record 3602: Address is 405 Dura Ave")
	void AddressOfRecord3602() {
		assertEquals("405 Dura Ave", customers.get(3601).getAddress());
	}

	@Test
	@DisplayName("Record 3602: City is Toledo")
	void CityOfRecord3602() {
		assertEquals("Toledo", customers.get(3601).getCity());
	}

	@Test
	@DisplayName("Record 3602: County is Lucas")
	void CountyOfRecord3602() {
		assertEquals("Lucas", customers.get(3601).getCounty());
	}

	@Test
	@DisplayName("Record 3602: State is OH")
	void StateOfRecord3602() {
		assertEquals("OH", customers.get(3601).getState());
	}

	@Test
	@DisplayName("Record 3602: ZIP is 43612")
	void ZIPOfRecord3602() {
		assertEquals("43612", customers.get(3601).getZIP());
	}

	@Test
	@DisplayName("Record 3602: Phone is 419-476-3093")
	void PhoneOfRecord3602() {
		assertEquals("419-476-3093", customers.get(3601).getPhone());
	}

	@Test
	@DisplayName("Record 3602: Fax is 419-476-2206")
	void FaxOfRecord3602() {
		assertEquals("419-476-2206", customers.get(3601).getFax());
	}

	@Test
	@DisplayName("Record 3602: Email is claudette@lorey.com")
	void EmailOfRecord3602() {
		assertEquals("claudette@lorey.com", customers.get(3601).getEmail());
	}

	@Test
	@DisplayName("Record 3602: Web is http://www.claudettelorey.com")
	void WebOfRecord3602() {
		assertEquals("http://www.claudettelorey.com", customers.get(3601).getWeb());
	}
}
