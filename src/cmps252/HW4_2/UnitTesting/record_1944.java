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

@Tag("42")
class Record_1944 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1944: FirstName is Virgilio")
	void FirstNameOfRecord1944() {
		assertEquals("Virgilio", customers.get(1943).getFirstName());
	}

	@Test
	@DisplayName("Record 1944: LastName is Benoy")
	void LastNameOfRecord1944() {
		assertEquals("Benoy", customers.get(1943).getLastName());
	}

	@Test
	@DisplayName("Record 1944: Company is Friedrich, Julius M Esq")
	void CompanyOfRecord1944() {
		assertEquals("Friedrich, Julius M Esq", customers.get(1943).getCompany());
	}

	@Test
	@DisplayName("Record 1944: Address is 1938 Del Oro Aven")
	void AddressOfRecord1944() {
		assertEquals("1938 Del Oro Aven", customers.get(1943).getAddress());
	}

	@Test
	@DisplayName("Record 1944: City is Oceanside")
	void CityOfRecord1944() {
		assertEquals("Oceanside", customers.get(1943).getCity());
	}

	@Test
	@DisplayName("Record 1944: County is San Diego")
	void CountyOfRecord1944() {
		assertEquals("San Diego", customers.get(1943).getCounty());
	}

	@Test
	@DisplayName("Record 1944: State is CA")
	void StateOfRecord1944() {
		assertEquals("CA", customers.get(1943).getState());
	}

	@Test
	@DisplayName("Record 1944: ZIP is 92056")
	void ZIPOfRecord1944() {
		assertEquals("92056", customers.get(1943).getZIP());
	}

	@Test
	@DisplayName("Record 1944: Phone is 760-630-1507")
	void PhoneOfRecord1944() {
		assertEquals("760-630-1507", customers.get(1943).getPhone());
	}

	@Test
	@DisplayName("Record 1944: Fax is 760-630-0797")
	void FaxOfRecord1944() {
		assertEquals("760-630-0797", customers.get(1943).getFax());
	}

	@Test
	@DisplayName("Record 1944: Email is virgilio@benoy.com")
	void EmailOfRecord1944() {
		assertEquals("virgilio@benoy.com", customers.get(1943).getEmail());
	}

	@Test
	@DisplayName("Record 1944: Web is http://www.virgiliobenoy.com")
	void WebOfRecord1944() {
		assertEquals("http://www.virgiliobenoy.com", customers.get(1943).getWeb());
	}
}
