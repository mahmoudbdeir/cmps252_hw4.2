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

@Tag("45")
class Record_3712 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3712: FirstName is Fanny")
	void FirstNameOfRecord3712() {
		assertEquals("Fanny", customers.get(3711).getFirstName());
	}

	@Test
	@DisplayName("Record 3712: LastName is Brecheen")
	void LastNameOfRecord3712() {
		assertEquals("Brecheen", customers.get(3711).getLastName());
	}

	@Test
	@DisplayName("Record 3712: Company is Rinehart, Ralph W Esq")
	void CompanyOfRecord3712() {
		assertEquals("Rinehart, Ralph W Esq", customers.get(3711).getCompany());
	}

	@Test
	@DisplayName("Record 3712: Address is 8675 Broussard Rd")
	void AddressOfRecord3712() {
		assertEquals("8675 Broussard Rd", customers.get(3711).getAddress());
	}

	@Test
	@DisplayName("Record 3712: City is Beaumont")
	void CityOfRecord3712() {
		assertEquals("Beaumont", customers.get(3711).getCity());
	}

	@Test
	@DisplayName("Record 3712: County is Jefferson")
	void CountyOfRecord3712() {
		assertEquals("Jefferson", customers.get(3711).getCounty());
	}

	@Test
	@DisplayName("Record 3712: State is TX")
	void StateOfRecord3712() {
		assertEquals("TX", customers.get(3711).getState());
	}

	@Test
	@DisplayName("Record 3712: ZIP is 77713")
	void ZIPOfRecord3712() {
		assertEquals("77713", customers.get(3711).getZIP());
	}

	@Test
	@DisplayName("Record 3712: Phone is 409-892-1482")
	void PhoneOfRecord3712() {
		assertEquals("409-892-1482", customers.get(3711).getPhone());
	}

	@Test
	@DisplayName("Record 3712: Fax is 409-892-1462")
	void FaxOfRecord3712() {
		assertEquals("409-892-1462", customers.get(3711).getFax());
	}

	@Test
	@DisplayName("Record 3712: Email is fanny@brecheen.com")
	void EmailOfRecord3712() {
		assertEquals("fanny@brecheen.com", customers.get(3711).getEmail());
	}

	@Test
	@DisplayName("Record 3712: Web is http://www.fannybrecheen.com")
	void WebOfRecord3712() {
		assertEquals("http://www.fannybrecheen.com", customers.get(3711).getWeb());
	}
}
