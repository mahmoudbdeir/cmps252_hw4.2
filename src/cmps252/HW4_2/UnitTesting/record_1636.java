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

@Tag("16")
class Record_1636 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1636: FirstName is Isabelle")
	void FirstNameOfRecord1636() {
		assertEquals("Isabelle", customers.get(1635).getFirstName());
	}

	@Test
	@DisplayName("Record 1636: LastName is Vanlith")
	void LastNameOfRecord1636() {
		assertEquals("Vanlith", customers.get(1635).getLastName());
	}

	@Test
	@DisplayName("Record 1636: Company is Freebies Magazine")
	void CompanyOfRecord1636() {
		assertEquals("Freebies Magazine", customers.get(1635).getCompany());
	}

	@Test
	@DisplayName("Record 1636: Address is 7911 L St")
	void AddressOfRecord1636() {
		assertEquals("7911 L St", customers.get(1635).getAddress());
	}

	@Test
	@DisplayName("Record 1636: City is Omaha")
	void CityOfRecord1636() {
		assertEquals("Omaha", customers.get(1635).getCity());
	}

	@Test
	@DisplayName("Record 1636: County is Douglas")
	void CountyOfRecord1636() {
		assertEquals("Douglas", customers.get(1635).getCounty());
	}

	@Test
	@DisplayName("Record 1636: State is NE")
	void StateOfRecord1636() {
		assertEquals("NE", customers.get(1635).getState());
	}

	@Test
	@DisplayName("Record 1636: ZIP is 68127")
	void ZIPOfRecord1636() {
		assertEquals("68127", customers.get(1635).getZIP());
	}

	@Test
	@DisplayName("Record 1636: Phone is 402-331-9288")
	void PhoneOfRecord1636() {
		assertEquals("402-331-9288", customers.get(1635).getPhone());
	}

	@Test
	@DisplayName("Record 1636: Fax is 402-331-8375")
	void FaxOfRecord1636() {
		assertEquals("402-331-8375", customers.get(1635).getFax());
	}

	@Test
	@DisplayName("Record 1636: Email is isabelle@vanlith.com")
	void EmailOfRecord1636() {
		assertEquals("isabelle@vanlith.com", customers.get(1635).getEmail());
	}

	@Test
	@DisplayName("Record 1636: Web is http://www.isabellevanlith.com")
	void WebOfRecord1636() {
		assertEquals("http://www.isabellevanlith.com", customers.get(1635).getWeb());
	}
}
