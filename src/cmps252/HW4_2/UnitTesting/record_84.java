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

@Tag("41")
class Record_84 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 84: FirstName is Bertha")
	void FirstNameOfRecord84() {
		assertEquals("Bertha", customers.get(83).getFirstName());
	}

	@Test
	@DisplayName("Record 84: LastName is Gant")
	void LastNameOfRecord84() {
		assertEquals("Gant", customers.get(83).getLastName());
	}

	@Test
	@DisplayName("Record 84: Company is Cranford Construction Co")
	void CompanyOfRecord84() {
		assertEquals("Cranford Construction Co", customers.get(83).getCompany());
	}

	@Test
	@DisplayName("Record 84: Address is 3681 Green Rd")
	void AddressOfRecord84() {
		assertEquals("3681 Green Rd", customers.get(83).getAddress());
	}

	@Test
	@DisplayName("Record 84: City is Beachwood")
	void CityOfRecord84() {
		assertEquals("Beachwood", customers.get(83).getCity());
	}

	@Test
	@DisplayName("Record 84: County is Cuyahoga")
	void CountyOfRecord84() {
		assertEquals("Cuyahoga", customers.get(83).getCounty());
	}

	@Test
	@DisplayName("Record 84: State is OH")
	void StateOfRecord84() {
		assertEquals("OH", customers.get(83).getState());
	}

	@Test
	@DisplayName("Record 84: ZIP is 44122")
	void ZIPOfRecord84() {
		assertEquals("44122", customers.get(83).getZIP());
	}

	@Test
	@DisplayName("Record 84: Phone is 216-464-0254")
	void PhoneOfRecord84() {
		assertEquals("216-464-0254", customers.get(83).getPhone());
	}

	@Test
	@DisplayName("Record 84: Fax is 216-464-9934")
	void FaxOfRecord84() {
		assertEquals("216-464-9934", customers.get(83).getFax());
	}

	@Test
	@DisplayName("Record 84: Email is bertha@gant.com")
	void EmailOfRecord84() {
		assertEquals("bertha@gant.com", customers.get(83).getEmail());
	}

	@Test
	@DisplayName("Record 84: Web is http://www.berthagant.com")
	void WebOfRecord84() {
		assertEquals("http://www.berthagant.com", customers.get(83).getWeb());
	}
}
