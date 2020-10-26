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

@Tag("11")
class Record_1930 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1930: FirstName is Sandy")
	void FirstNameOfRecord1930() {
		assertEquals("Sandy", customers.get(1929).getFirstName());
	}

	@Test
	@DisplayName("Record 1930: LastName is Borella")
	void LastNameOfRecord1930() {
		assertEquals("Borella", customers.get(1929).getLastName());
	}

	@Test
	@DisplayName("Record 1930: Company is Residence Inn By Marriott")
	void CompanyOfRecord1930() {
		assertEquals("Residence Inn By Marriott", customers.get(1929).getCompany());
	}

	@Test
	@DisplayName("Record 1930: Address is 520 Broadway St")
	void AddressOfRecord1930() {
		assertEquals("520 Broadway St", customers.get(1929).getAddress());
	}

	@Test
	@DisplayName("Record 1930: City is Toledo")
	void CityOfRecord1930() {
		assertEquals("Toledo", customers.get(1929).getCity());
	}

	@Test
	@DisplayName("Record 1930: County is Lucas")
	void CountyOfRecord1930() {
		assertEquals("Lucas", customers.get(1929).getCounty());
	}

	@Test
	@DisplayName("Record 1930: State is OH")
	void StateOfRecord1930() {
		assertEquals("OH", customers.get(1929).getState());
	}

	@Test
	@DisplayName("Record 1930: ZIP is 43602")
	void ZIPOfRecord1930() {
		assertEquals("43602", customers.get(1929).getZIP());
	}

	@Test
	@DisplayName("Record 1930: Phone is 419-321-1975")
	void PhoneOfRecord1930() {
		assertEquals("419-321-1975", customers.get(1929).getPhone());
	}

	@Test
	@DisplayName("Record 1930: Fax is 419-321-1178")
	void FaxOfRecord1930() {
		assertEquals("419-321-1178", customers.get(1929).getFax());
	}

	@Test
	@DisplayName("Record 1930: Email is sandy@borella.com")
	void EmailOfRecord1930() {
		assertEquals("sandy@borella.com", customers.get(1929).getEmail());
	}

	@Test
	@DisplayName("Record 1930: Web is http://www.sandyborella.com")
	void WebOfRecord1930() {
		assertEquals("http://www.sandyborella.com", customers.get(1929).getWeb());
	}
}
