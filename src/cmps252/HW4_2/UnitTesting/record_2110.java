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

@Tag("46")
class Record_2110 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2110: FirstName is Dyrdre")
	void FirstNameOfRecord2110() {
		assertEquals("Dyrdre", customers.get(2109).getFirstName());
	}

	@Test
	@DisplayName("Record 2110: LastName is Dancey")
	void LastNameOfRecord2110() {
		assertEquals("Dancey", customers.get(2109).getLastName());
	}

	@Test
	@DisplayName("Record 2110: Company is Felicione S Seafood Co")
	void CompanyOfRecord2110() {
		assertEquals("Felicione S Seafood Co", customers.get(2109).getCompany());
	}

	@Test
	@DisplayName("Record 2110: Address is 2323 San Ramon Valley Blvd")
	void AddressOfRecord2110() {
		assertEquals("2323 San Ramon Valley Blvd", customers.get(2109).getAddress());
	}

	@Test
	@DisplayName("Record 2110: City is San Ramon")
	void CityOfRecord2110() {
		assertEquals("San Ramon", customers.get(2109).getCity());
	}

	@Test
	@DisplayName("Record 2110: County is Contra Costa")
	void CountyOfRecord2110() {
		assertEquals("Contra Costa", customers.get(2109).getCounty());
	}

	@Test
	@DisplayName("Record 2110: State is CA")
	void StateOfRecord2110() {
		assertEquals("CA", customers.get(2109).getState());
	}

	@Test
	@DisplayName("Record 2110: ZIP is 94583")
	void ZIPOfRecord2110() {
		assertEquals("94583", customers.get(2109).getZIP());
	}

	@Test
	@DisplayName("Record 2110: Phone is 925-855-4605")
	void PhoneOfRecord2110() {
		assertEquals("925-855-4605", customers.get(2109).getPhone());
	}

	@Test
	@DisplayName("Record 2110: Fax is 925-855-0914")
	void FaxOfRecord2110() {
		assertEquals("925-855-0914", customers.get(2109).getFax());
	}

	@Test
	@DisplayName("Record 2110: Email is dyrdre@dancey.com")
	void EmailOfRecord2110() {
		assertEquals("dyrdre@dancey.com", customers.get(2109).getEmail());
	}

	@Test
	@DisplayName("Record 2110: Web is http://www.dyrdredancey.com")
	void WebOfRecord2110() {
		assertEquals("http://www.dyrdredancey.com", customers.get(2109).getWeb());
	}
}
