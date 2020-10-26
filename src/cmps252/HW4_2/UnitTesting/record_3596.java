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

@Tag("27")
class Record_3596 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3596: FirstName is Brant")
	void FirstNameOfRecord3596() {
		assertEquals("Brant", customers.get(3595).getFirstName());
	}

	@Test
	@DisplayName("Record 3596: LastName is Son")
	void LastNameOfRecord3596() {
		assertEquals("Son", customers.get(3595).getLastName());
	}

	@Test
	@DisplayName("Record 3596: Company is Spy In The Sky Operations Inc")
	void CompanyOfRecord3596() {
		assertEquals("Spy In The Sky Operations Inc", customers.get(3595).getCompany());
	}

	@Test
	@DisplayName("Record 3596: Address is 209 Middlesex Ave")
	void AddressOfRecord3596() {
		assertEquals("209 Middlesex Ave", customers.get(3595).getAddress());
	}

	@Test
	@DisplayName("Record 3596: City is Medford")
	void CityOfRecord3596() {
		assertEquals("Medford", customers.get(3595).getCity());
	}

	@Test
	@DisplayName("Record 3596: County is Middlesex")
	void CountyOfRecord3596() {
		assertEquals("Middlesex", customers.get(3595).getCounty());
	}

	@Test
	@DisplayName("Record 3596: State is MA")
	void StateOfRecord3596() {
		assertEquals("MA", customers.get(3595).getState());
	}

	@Test
	@DisplayName("Record 3596: ZIP is 2155")
	void ZIPOfRecord3596() {
		assertEquals("2155", customers.get(3595).getZIP());
	}

	@Test
	@DisplayName("Record 3596: Phone is 781-368-5240")
	void PhoneOfRecord3596() {
		assertEquals("781-368-5240", customers.get(3595).getPhone());
	}

	@Test
	@DisplayName("Record 3596: Fax is 781-368-9037")
	void FaxOfRecord3596() {
		assertEquals("781-368-9037", customers.get(3595).getFax());
	}

	@Test
	@DisplayName("Record 3596: Email is brant@son.com")
	void EmailOfRecord3596() {
		assertEquals("brant@son.com", customers.get(3595).getEmail());
	}

	@Test
	@DisplayName("Record 3596: Web is http://www.brantson.com")
	void WebOfRecord3596() {
		assertEquals("http://www.brantson.com", customers.get(3595).getWeb());
	}
}
