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

@Tag("9")
class Record_3265 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3265: FirstName is Gail")
	void FirstNameOfRecord3265() {
		assertEquals("Gail", customers.get(3264).getFirstName());
	}

	@Test
	@DisplayName("Record 3265: LastName is Reninger")
	void LastNameOfRecord3265() {
		assertEquals("Reninger", customers.get(3264).getLastName());
	}

	@Test
	@DisplayName("Record 3265: Company is Midwest Cad Design")
	void CompanyOfRecord3265() {
		assertEquals("Midwest Cad Design", customers.get(3264).getCompany());
	}

	@Test
	@DisplayName("Record 3265: Address is 2110 K St")
	void AddressOfRecord3265() {
		assertEquals("2110 K St", customers.get(3264).getAddress());
	}

	@Test
	@DisplayName("Record 3265: City is Sacramento")
	void CityOfRecord3265() {
		assertEquals("Sacramento", customers.get(3264).getCity());
	}

	@Test
	@DisplayName("Record 3265: County is Sacramento")
	void CountyOfRecord3265() {
		assertEquals("Sacramento", customers.get(3264).getCounty());
	}

	@Test
	@DisplayName("Record 3265: State is CA")
	void StateOfRecord3265() {
		assertEquals("CA", customers.get(3264).getState());
	}

	@Test
	@DisplayName("Record 3265: ZIP is 95816")
	void ZIPOfRecord3265() {
		assertEquals("95816", customers.get(3264).getZIP());
	}

	@Test
	@DisplayName("Record 3265: Phone is 916-448-1888")
	void PhoneOfRecord3265() {
		assertEquals("916-448-1888", customers.get(3264).getPhone());
	}

	@Test
	@DisplayName("Record 3265: Fax is 916-448-7985")
	void FaxOfRecord3265() {
		assertEquals("916-448-7985", customers.get(3264).getFax());
	}

	@Test
	@DisplayName("Record 3265: Email is gail@reninger.com")
	void EmailOfRecord3265() {
		assertEquals("gail@reninger.com", customers.get(3264).getEmail());
	}

	@Test
	@DisplayName("Record 3265: Web is http://www.gailreninger.com")
	void WebOfRecord3265() {
		assertEquals("http://www.gailreninger.com", customers.get(3264).getWeb());
	}
}
