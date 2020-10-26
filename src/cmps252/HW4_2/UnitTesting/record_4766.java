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

@Tag("48")
class Record_4766 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4766: FirstName is Irma")
	void FirstNameOfRecord4766() {
		assertEquals("Irma", customers.get(4765).getFirstName());
	}

	@Test
	@DisplayName("Record 4766: LastName is Upton")
	void LastNameOfRecord4766() {
		assertEquals("Upton", customers.get(4765).getLastName());
	}

	@Test
	@DisplayName("Record 4766: Company is Taylor, Andrew A Attorney")
	void CompanyOfRecord4766() {
		assertEquals("Taylor, Andrew A Attorney", customers.get(4765).getCompany());
	}

	@Test
	@DisplayName("Record 4766: Address is 411 Meadowcroft Rd")
	void AddressOfRecord4766() {
		assertEquals("411 Meadowcroft Rd", customers.get(4765).getAddress());
	}

	@Test
	@DisplayName("Record 4766: City is Deptford")
	void CityOfRecord4766() {
		assertEquals("Deptford", customers.get(4765).getCity());
	}

	@Test
	@DisplayName("Record 4766: County is Gloucester")
	void CountyOfRecord4766() {
		assertEquals("Gloucester", customers.get(4765).getCounty());
	}

	@Test
	@DisplayName("Record 4766: State is NJ")
	void StateOfRecord4766() {
		assertEquals("NJ", customers.get(4765).getState());
	}

	@Test
	@DisplayName("Record 4766: ZIP is 8096")
	void ZIPOfRecord4766() {
		assertEquals("8096", customers.get(4765).getZIP());
	}

	@Test
	@DisplayName("Record 4766: Phone is 856-384-3831")
	void PhoneOfRecord4766() {
		assertEquals("856-384-3831", customers.get(4765).getPhone());
	}

	@Test
	@DisplayName("Record 4766: Fax is 856-384-3446")
	void FaxOfRecord4766() {
		assertEquals("856-384-3446", customers.get(4765).getFax());
	}

	@Test
	@DisplayName("Record 4766: Email is irma@upton.com")
	void EmailOfRecord4766() {
		assertEquals("irma@upton.com", customers.get(4765).getEmail());
	}

	@Test
	@DisplayName("Record 4766: Web is http://www.irmaupton.com")
	void WebOfRecord4766() {
		assertEquals("http://www.irmaupton.com", customers.get(4765).getWeb());
	}
}
