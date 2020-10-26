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

@Tag("3")
class Record_1990 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1990: FirstName is Caitlin")
	void FirstNameOfRecord1990() {
		assertEquals("Caitlin", customers.get(1989).getFirstName());
	}

	@Test
	@DisplayName("Record 1990: LastName is Supernaw")
	void LastNameOfRecord1990() {
		assertEquals("Supernaw", customers.get(1989).getLastName());
	}

	@Test
	@DisplayName("Record 1990: Company is Farmville Chamber Of Commerce")
	void CompanyOfRecord1990() {
		assertEquals("Farmville Chamber Of Commerce", customers.get(1989).getCompany());
	}

	@Test
	@DisplayName("Record 1990: Address is 3050 Dryden Rd")
	void AddressOfRecord1990() {
		assertEquals("3050 Dryden Rd", customers.get(1989).getAddress());
	}

	@Test
	@DisplayName("Record 1990: City is Dayton")
	void CityOfRecord1990() {
		assertEquals("Dayton", customers.get(1989).getCity());
	}

	@Test
	@DisplayName("Record 1990: County is Montgomery")
	void CountyOfRecord1990() {
		assertEquals("Montgomery", customers.get(1989).getCounty());
	}

	@Test
	@DisplayName("Record 1990: State is OH")
	void StateOfRecord1990() {
		assertEquals("OH", customers.get(1989).getState());
	}

	@Test
	@DisplayName("Record 1990: ZIP is 45439")
	void ZIPOfRecord1990() {
		assertEquals("45439", customers.get(1989).getZIP());
	}

	@Test
	@DisplayName("Record 1990: Phone is 937-293-5645")
	void PhoneOfRecord1990() {
		assertEquals("937-293-5645", customers.get(1989).getPhone());
	}

	@Test
	@DisplayName("Record 1990: Fax is 937-293-4465")
	void FaxOfRecord1990() {
		assertEquals("937-293-4465", customers.get(1989).getFax());
	}

	@Test
	@DisplayName("Record 1990: Email is caitlin@supernaw.com")
	void EmailOfRecord1990() {
		assertEquals("caitlin@supernaw.com", customers.get(1989).getEmail());
	}

	@Test
	@DisplayName("Record 1990: Web is http://www.caitlinsupernaw.com")
	void WebOfRecord1990() {
		assertEquals("http://www.caitlinsupernaw.com", customers.get(1989).getWeb());
	}
}
