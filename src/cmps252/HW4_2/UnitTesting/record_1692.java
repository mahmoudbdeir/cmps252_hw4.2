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

@Tag("19")
class Record_1692 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1692: FirstName is Boyce")
	void FirstNameOfRecord1692() {
		assertEquals("Boyce", customers.get(1691).getFirstName());
	}

	@Test
	@DisplayName("Record 1692: LastName is Ettel")
	void LastNameOfRecord1692() {
		assertEquals("Ettel", customers.get(1691).getLastName());
	}

	@Test
	@DisplayName("Record 1692: Company is Penn Hills Municipal Shopg Ctr")
	void CompanyOfRecord1692() {
		assertEquals("Penn Hills Municipal Shopg Ctr", customers.get(1691).getCompany());
	}

	@Test
	@DisplayName("Record 1692: Address is 600 Us Highway 46")
	void AddressOfRecord1692() {
		assertEquals("600 Us Highway 46", customers.get(1691).getAddress());
	}

	@Test
	@DisplayName("Record 1692: City is Clifton")
	void CityOfRecord1692() {
		assertEquals("Clifton", customers.get(1691).getCity());
	}

	@Test
	@DisplayName("Record 1692: County is Passaic")
	void CountyOfRecord1692() {
		assertEquals("Passaic", customers.get(1691).getCounty());
	}

	@Test
	@DisplayName("Record 1692: State is NJ")
	void StateOfRecord1692() {
		assertEquals("NJ", customers.get(1691).getState());
	}

	@Test
	@DisplayName("Record 1692: ZIP is 7013")
	void ZIPOfRecord1692() {
		assertEquals("7013", customers.get(1691).getZIP());
	}

	@Test
	@DisplayName("Record 1692: Phone is 973-478-3528")
	void PhoneOfRecord1692() {
		assertEquals("973-478-3528", customers.get(1691).getPhone());
	}

	@Test
	@DisplayName("Record 1692: Fax is 973-478-4046")
	void FaxOfRecord1692() {
		assertEquals("973-478-4046", customers.get(1691).getFax());
	}

	@Test
	@DisplayName("Record 1692: Email is boyce@ettel.com")
	void EmailOfRecord1692() {
		assertEquals("boyce@ettel.com", customers.get(1691).getEmail());
	}

	@Test
	@DisplayName("Record 1692: Web is http://www.boyceettel.com")
	void WebOfRecord1692() {
		assertEquals("http://www.boyceettel.com", customers.get(1691).getWeb());
	}
}
