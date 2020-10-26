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

@Tag("35")
class Record_798 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 798: FirstName is Cliff")
	void FirstNameOfRecord798() {
		assertEquals("Cliff", customers.get(797).getFirstName());
	}

	@Test
	@DisplayName("Record 798: LastName is Gottwald")
	void LastNameOfRecord798() {
		assertEquals("Gottwald", customers.get(797).getLastName());
	}

	@Test
	@DisplayName("Record 798: Company is Rick Bros Trck Bodies & Tk Wks")
	void CompanyOfRecord798() {
		assertEquals("Rick Bros Trck Bodies & Tk Wks", customers.get(797).getCompany());
	}

	@Test
	@DisplayName("Record 798: Address is 1510 4th St")
	void AddressOfRecord798() {
		assertEquals("1510 4th St", customers.get(797).getAddress());
	}

	@Test
	@DisplayName("Record 798: City is Santa Rosa")
	void CityOfRecord798() {
		assertEquals("Santa Rosa", customers.get(797).getCity());
	}

	@Test
	@DisplayName("Record 798: County is Sonoma")
	void CountyOfRecord798() {
		assertEquals("Sonoma", customers.get(797).getCounty());
	}

	@Test
	@DisplayName("Record 798: State is CA")
	void StateOfRecord798() {
		assertEquals("CA", customers.get(797).getState());
	}

	@Test
	@DisplayName("Record 798: ZIP is 95404")
	void ZIPOfRecord798() {
		assertEquals("95404", customers.get(797).getZIP());
	}

	@Test
	@DisplayName("Record 798: Phone is 707-545-3960")
	void PhoneOfRecord798() {
		assertEquals("707-545-3960", customers.get(797).getPhone());
	}

	@Test
	@DisplayName("Record 798: Fax is 707-545-4294")
	void FaxOfRecord798() {
		assertEquals("707-545-4294", customers.get(797).getFax());
	}

	@Test
	@DisplayName("Record 798: Email is cliff@gottwald.com")
	void EmailOfRecord798() {
		assertEquals("cliff@gottwald.com", customers.get(797).getEmail());
	}

	@Test
	@DisplayName("Record 798: Web is http://www.cliffgottwald.com")
	void WebOfRecord798() {
		assertEquals("http://www.cliffgottwald.com", customers.get(797).getWeb());
	}
}
