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

@Tag("44")
class Record_3050 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3050: FirstName is Janet")
	void FirstNameOfRecord3050() {
		assertEquals("Janet", customers.get(3049).getFirstName());
	}

	@Test
	@DisplayName("Record 3050: LastName is Bowthorpe")
	void LastNameOfRecord3050() {
		assertEquals("Bowthorpe", customers.get(3049).getLastName());
	}

	@Test
	@DisplayName("Record 3050: Company is Maytag Customer Service")
	void CompanyOfRecord3050() {
		assertEquals("Maytag Customer Service", customers.get(3049).getCompany());
	}

	@Test
	@DisplayName("Record 3050: Address is 1100 Main St")
	void AddressOfRecord3050() {
		assertEquals("1100 Main St", customers.get(3049).getAddress());
	}

	@Test
	@DisplayName("Record 3050: City is Kansas City")
	void CityOfRecord3050() {
		assertEquals("Kansas City", customers.get(3049).getCity());
	}

	@Test
	@DisplayName("Record 3050: County is Jackson")
	void CountyOfRecord3050() {
		assertEquals("Jackson", customers.get(3049).getCounty());
	}

	@Test
	@DisplayName("Record 3050: State is MO")
	void StateOfRecord3050() {
		assertEquals("MO", customers.get(3049).getState());
	}

	@Test
	@DisplayName("Record 3050: ZIP is 64105")
	void ZIPOfRecord3050() {
		assertEquals("64105", customers.get(3049).getZIP());
	}

	@Test
	@DisplayName("Record 3050: Phone is 816-471-6861")
	void PhoneOfRecord3050() {
		assertEquals("816-471-6861", customers.get(3049).getPhone());
	}

	@Test
	@DisplayName("Record 3050: Fax is 816-471-4752")
	void FaxOfRecord3050() {
		assertEquals("816-471-4752", customers.get(3049).getFax());
	}

	@Test
	@DisplayName("Record 3050: Email is janet@bowthorpe.com")
	void EmailOfRecord3050() {
		assertEquals("janet@bowthorpe.com", customers.get(3049).getEmail());
	}

	@Test
	@DisplayName("Record 3050: Web is http://www.janetbowthorpe.com")
	void WebOfRecord3050() {
		assertEquals("http://www.janetbowthorpe.com", customers.get(3049).getWeb());
	}
}
