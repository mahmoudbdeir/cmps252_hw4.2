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
class Record_1101 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1101: FirstName is Ambrose")
	void FirstNameOfRecord1101() {
		assertEquals("Ambrose", customers.get(1100).getFirstName());
	}

	@Test
	@DisplayName("Record 1101: LastName is Faunce")
	void LastNameOfRecord1101() {
		assertEquals("Faunce", customers.get(1100).getLastName());
	}

	@Test
	@DisplayName("Record 1101: Company is Smith, Paul T")
	void CompanyOfRecord1101() {
		assertEquals("Smith, Paul T", customers.get(1100).getCompany());
	}

	@Test
	@DisplayName("Record 1101: Address is 4021 W Kinzie St")
	void AddressOfRecord1101() {
		assertEquals("4021 W Kinzie St", customers.get(1100).getAddress());
	}

	@Test
	@DisplayName("Record 1101: City is Chicago")
	void CityOfRecord1101() {
		assertEquals("Chicago", customers.get(1100).getCity());
	}

	@Test
	@DisplayName("Record 1101: County is Cook")
	void CountyOfRecord1101() {
		assertEquals("Cook", customers.get(1100).getCounty());
	}

	@Test
	@DisplayName("Record 1101: State is IL")
	void StateOfRecord1101() {
		assertEquals("IL", customers.get(1100).getState());
	}

	@Test
	@DisplayName("Record 1101: ZIP is 60624")
	void ZIPOfRecord1101() {
		assertEquals("60624", customers.get(1100).getZIP());
	}

	@Test
	@DisplayName("Record 1101: Phone is 773-826-9495")
	void PhoneOfRecord1101() {
		assertEquals("773-826-9495", customers.get(1100).getPhone());
	}

	@Test
	@DisplayName("Record 1101: Fax is 773-826-3575")
	void FaxOfRecord1101() {
		assertEquals("773-826-3575", customers.get(1100).getFax());
	}

	@Test
	@DisplayName("Record 1101: Email is ambrose@faunce.com")
	void EmailOfRecord1101() {
		assertEquals("ambrose@faunce.com", customers.get(1100).getEmail());
	}

	@Test
	@DisplayName("Record 1101: Web is http://www.ambrosefaunce.com")
	void WebOfRecord1101() {
		assertEquals("http://www.ambrosefaunce.com", customers.get(1100).getWeb());
	}
}
