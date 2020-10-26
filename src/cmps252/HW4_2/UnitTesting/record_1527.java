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

@Tag("0")
class Record_1527 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1527: FirstName is Jana")
	void FirstNameOfRecord1527() {
		assertEquals("Jana", customers.get(1526).getFirstName());
	}

	@Test
	@DisplayName("Record 1527: LastName is Anslow")
	void LastNameOfRecord1527() {
		assertEquals("Anslow", customers.get(1526).getLastName());
	}

	@Test
	@DisplayName("Record 1527: Company is Swank Inc")
	void CompanyOfRecord1527() {
		assertEquals("Swank Inc", customers.get(1526).getCompany());
	}

	@Test
	@DisplayName("Record 1527: Address is 7851 Beechcraft Ave  #-a")
	void AddressOfRecord1527() {
		assertEquals("7851 Beechcraft Ave  #-a", customers.get(1526).getAddress());
	}

	@Test
	@DisplayName("Record 1527: City is Gaithersburg")
	void CityOfRecord1527() {
		assertEquals("Gaithersburg", customers.get(1526).getCity());
	}

	@Test
	@DisplayName("Record 1527: County is Montgomery")
	void CountyOfRecord1527() {
		assertEquals("Montgomery", customers.get(1526).getCounty());
	}

	@Test
	@DisplayName("Record 1527: State is MD")
	void StateOfRecord1527() {
		assertEquals("MD", customers.get(1526).getState());
	}

	@Test
	@DisplayName("Record 1527: ZIP is 20879")
	void ZIPOfRecord1527() {
		assertEquals("20879", customers.get(1526).getZIP());
	}

	@Test
	@DisplayName("Record 1527: Phone is 301-258-5928")
	void PhoneOfRecord1527() {
		assertEquals("301-258-5928", customers.get(1526).getPhone());
	}

	@Test
	@DisplayName("Record 1527: Fax is 301-258-1645")
	void FaxOfRecord1527() {
		assertEquals("301-258-1645", customers.get(1526).getFax());
	}

	@Test
	@DisplayName("Record 1527: Email is jana@anslow.com")
	void EmailOfRecord1527() {
		assertEquals("jana@anslow.com", customers.get(1526).getEmail());
	}

	@Test
	@DisplayName("Record 1527: Web is http://www.janaanslow.com")
	void WebOfRecord1527() {
		assertEquals("http://www.janaanslow.com", customers.get(1526).getWeb());
	}
}
