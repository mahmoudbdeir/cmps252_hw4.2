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
class Record_215 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 215: FirstName is Brock")
	void FirstNameOfRecord215() {
		assertEquals("Brock", customers.get(214).getFirstName());
	}

	@Test
	@DisplayName("Record 215: LastName is Hom")
	void LastNameOfRecord215() {
		assertEquals("Hom", customers.get(214).getLastName());
	}

	@Test
	@DisplayName("Record 215: Company is Depuy, Robert Davis")
	void CompanyOfRecord215() {
		assertEquals("Depuy, Robert Davis", customers.get(214).getCompany());
	}

	@Test
	@DisplayName("Record 215: Address is 1501 Gilson St")
	void AddressOfRecord215() {
		assertEquals("1501 Gilson St", customers.get(214).getAddress());
	}

	@Test
	@DisplayName("Record 215: City is Madison")
	void CityOfRecord215() {
		assertEquals("Madison", customers.get(214).getCity());
	}

	@Test
	@DisplayName("Record 215: County is Dane")
	void CountyOfRecord215() {
		assertEquals("Dane", customers.get(214).getCounty());
	}

	@Test
	@DisplayName("Record 215: State is WI")
	void StateOfRecord215() {
		assertEquals("WI", customers.get(214).getState());
	}

	@Test
	@DisplayName("Record 215: ZIP is 53715")
	void ZIPOfRecord215() {
		assertEquals("53715", customers.get(214).getZIP());
	}

	@Test
	@DisplayName("Record 215: Phone is 608-257-4779")
	void PhoneOfRecord215() {
		assertEquals("608-257-4779", customers.get(214).getPhone());
	}

	@Test
	@DisplayName("Record 215: Fax is 608-257-7753")
	void FaxOfRecord215() {
		assertEquals("608-257-7753", customers.get(214).getFax());
	}

	@Test
	@DisplayName("Record 215: Email is brock@hom.com")
	void EmailOfRecord215() {
		assertEquals("brock@hom.com", customers.get(214).getEmail());
	}

	@Test
	@DisplayName("Record 215: Web is http://www.brockhom.com")
	void WebOfRecord215() {
		assertEquals("http://www.brockhom.com", customers.get(214).getWeb());
	}
}
