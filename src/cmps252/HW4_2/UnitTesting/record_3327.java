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

@Tag("32")
class Record_3327 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3327: FirstName is Mabel")
	void FirstNameOfRecord3327() {
		assertEquals("Mabel", customers.get(3326).getFirstName());
	}

	@Test
	@DisplayName("Record 3327: LastName is Klamn")
	void LastNameOfRecord3327() {
		assertEquals("Klamn", customers.get(3326).getLastName());
	}

	@Test
	@DisplayName("Record 3327: Company is Fresno City & County Hist Scty")
	void CompanyOfRecord3327() {
		assertEquals("Fresno City & County Hist Scty", customers.get(3326).getCompany());
	}

	@Test
	@DisplayName("Record 3327: Address is 480 N Potomac St")
	void AddressOfRecord3327() {
		assertEquals("480 N Potomac St", customers.get(3326).getAddress());
	}

	@Test
	@DisplayName("Record 3327: City is Hagerstown")
	void CityOfRecord3327() {
		assertEquals("Hagerstown", customers.get(3326).getCity());
	}

	@Test
	@DisplayName("Record 3327: County is Washington")
	void CountyOfRecord3327() {
		assertEquals("Washington", customers.get(3326).getCounty());
	}

	@Test
	@DisplayName("Record 3327: State is MD")
	void StateOfRecord3327() {
		assertEquals("MD", customers.get(3326).getState());
	}

	@Test
	@DisplayName("Record 3327: ZIP is 21740")
	void ZIPOfRecord3327() {
		assertEquals("21740", customers.get(3326).getZIP());
	}

	@Test
	@DisplayName("Record 3327: Phone is 301-733-4536")
	void PhoneOfRecord3327() {
		assertEquals("301-733-4536", customers.get(3326).getPhone());
	}

	@Test
	@DisplayName("Record 3327: Fax is 301-733-8521")
	void FaxOfRecord3327() {
		assertEquals("301-733-8521", customers.get(3326).getFax());
	}

	@Test
	@DisplayName("Record 3327: Email is mabel@klamn.com")
	void EmailOfRecord3327() {
		assertEquals("mabel@klamn.com", customers.get(3326).getEmail());
	}

	@Test
	@DisplayName("Record 3327: Web is http://www.mabelklamn.com")
	void WebOfRecord3327() {
		assertEquals("http://www.mabelklamn.com", customers.get(3326).getWeb());
	}
}
