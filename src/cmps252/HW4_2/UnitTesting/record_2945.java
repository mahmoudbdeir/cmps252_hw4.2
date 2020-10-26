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

@Tag("15")
class Record_2945 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2945: FirstName is Bertie")
	void FirstNameOfRecord2945() {
		assertEquals("Bertie", customers.get(2944).getFirstName());
	}

	@Test
	@DisplayName("Record 2945: LastName is Eveline")
	void LastNameOfRecord2945() {
		assertEquals("Eveline", customers.get(2944).getLastName());
	}

	@Test
	@DisplayName("Record 2945: Company is A J Rinella Co Inc")
	void CompanyOfRecord2945() {
		assertEquals("A J Rinella Co Inc", customers.get(2944).getCompany());
	}

	@Test
	@DisplayName("Record 2945: Address is 2601 S Figueroa St")
	void AddressOfRecord2945() {
		assertEquals("2601 S Figueroa St", customers.get(2944).getAddress());
	}

	@Test
	@DisplayName("Record 2945: City is Los Angeles")
	void CityOfRecord2945() {
		assertEquals("Los Angeles", customers.get(2944).getCity());
	}

	@Test
	@DisplayName("Record 2945: County is Los Angeles")
	void CountyOfRecord2945() {
		assertEquals("Los Angeles", customers.get(2944).getCounty());
	}

	@Test
	@DisplayName("Record 2945: State is CA")
	void StateOfRecord2945() {
		assertEquals("CA", customers.get(2944).getState());
	}

	@Test
	@DisplayName("Record 2945: ZIP is 90007")
	void ZIPOfRecord2945() {
		assertEquals("90007", customers.get(2944).getZIP());
	}

	@Test
	@DisplayName("Record 2945: Phone is 213-741-6696")
	void PhoneOfRecord2945() {
		assertEquals("213-741-6696", customers.get(2944).getPhone());
	}

	@Test
	@DisplayName("Record 2945: Fax is 213-741-5931")
	void FaxOfRecord2945() {
		assertEquals("213-741-5931", customers.get(2944).getFax());
	}

	@Test
	@DisplayName("Record 2945: Email is bertie@eveline.com")
	void EmailOfRecord2945() {
		assertEquals("bertie@eveline.com", customers.get(2944).getEmail());
	}

	@Test
	@DisplayName("Record 2945: Web is http://www.bertieeveline.com")
	void WebOfRecord2945() {
		assertEquals("http://www.bertieeveline.com", customers.get(2944).getWeb());
	}
}
