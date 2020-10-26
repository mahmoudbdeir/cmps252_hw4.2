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

@Tag("40")
class Record_1043 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1043: FirstName is Marquis")
	void FirstNameOfRecord1043() {
		assertEquals("Marquis", customers.get(1042).getFirstName());
	}

	@Test
	@DisplayName("Record 1043: LastName is Kloke")
	void LastNameOfRecord1043() {
		assertEquals("Kloke", customers.get(1042).getLastName());
	}

	@Test
	@DisplayName("Record 1043: Company is Municipal Building")
	void CompanyOfRecord1043() {
		assertEquals("Municipal Building", customers.get(1042).getCompany());
	}

	@Test
	@DisplayName("Record 1043: Address is 870 Market St")
	void AddressOfRecord1043() {
		assertEquals("870 Market St", customers.get(1042).getAddress());
	}

	@Test
	@DisplayName("Record 1043: City is San Francisco")
	void CityOfRecord1043() {
		assertEquals("San Francisco", customers.get(1042).getCity());
	}

	@Test
	@DisplayName("Record 1043: County is San Francisco")
	void CountyOfRecord1043() {
		assertEquals("San Francisco", customers.get(1042).getCounty());
	}

	@Test
	@DisplayName("Record 1043: State is CA")
	void StateOfRecord1043() {
		assertEquals("CA", customers.get(1042).getState());
	}

	@Test
	@DisplayName("Record 1043: ZIP is 94102")
	void ZIPOfRecord1043() {
		assertEquals("94102", customers.get(1042).getZIP());
	}

	@Test
	@DisplayName("Record 1043: Phone is 415-834-0979")
	void PhoneOfRecord1043() {
		assertEquals("415-834-0979", customers.get(1042).getPhone());
	}

	@Test
	@DisplayName("Record 1043: Fax is 415-834-3238")
	void FaxOfRecord1043() {
		assertEquals("415-834-3238", customers.get(1042).getFax());
	}

	@Test
	@DisplayName("Record 1043: Email is marquis@kloke.com")
	void EmailOfRecord1043() {
		assertEquals("marquis@kloke.com", customers.get(1042).getEmail());
	}

	@Test
	@DisplayName("Record 1043: Web is http://www.marquiskloke.com")
	void WebOfRecord1043() {
		assertEquals("http://www.marquiskloke.com", customers.get(1042).getWeb());
	}
}
