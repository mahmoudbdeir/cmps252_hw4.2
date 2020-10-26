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
class Record_3849 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3849: FirstName is Everette")
	void FirstNameOfRecord3849() {
		assertEquals("Everette", customers.get(3848).getFirstName());
	}

	@Test
	@DisplayName("Record 3849: LastName is Brummel")
	void LastNameOfRecord3849() {
		assertEquals("Brummel", customers.get(3848).getLastName());
	}

	@Test
	@DisplayName("Record 3849: Company is Mundial Inc")
	void CompanyOfRecord3849() {
		assertEquals("Mundial Inc", customers.get(3848).getCompany());
	}

	@Test
	@DisplayName("Record 3849: Address is 3800 W 80th St")
	void AddressOfRecord3849() {
		assertEquals("3800 W 80th St", customers.get(3848).getAddress());
	}

	@Test
	@DisplayName("Record 3849: City is Minneapolis")
	void CityOfRecord3849() {
		assertEquals("Minneapolis", customers.get(3848).getCity());
	}

	@Test
	@DisplayName("Record 3849: County is Hennepin")
	void CountyOfRecord3849() {
		assertEquals("Hennepin", customers.get(3848).getCounty());
	}

	@Test
	@DisplayName("Record 3849: State is MN")
	void StateOfRecord3849() {
		assertEquals("MN", customers.get(3848).getState());
	}

	@Test
	@DisplayName("Record 3849: ZIP is 55431")
	void ZIPOfRecord3849() {
		assertEquals("55431", customers.get(3848).getZIP());
	}

	@Test
	@DisplayName("Record 3849: Phone is 952-896-0100")
	void PhoneOfRecord3849() {
		assertEquals("952-896-0100", customers.get(3848).getPhone());
	}

	@Test
	@DisplayName("Record 3849: Fax is 952-896-2961")
	void FaxOfRecord3849() {
		assertEquals("952-896-2961", customers.get(3848).getFax());
	}

	@Test
	@DisplayName("Record 3849: Email is everette@brummel.com")
	void EmailOfRecord3849() {
		assertEquals("everette@brummel.com", customers.get(3848).getEmail());
	}

	@Test
	@DisplayName("Record 3849: Web is http://www.everettebrummel.com")
	void WebOfRecord3849() {
		assertEquals("http://www.everettebrummel.com", customers.get(3848).getWeb());
	}
}
