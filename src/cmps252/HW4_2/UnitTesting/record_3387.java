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

@Tag("43")
class Record_3387 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3387: FirstName is Carroll")
	void FirstNameOfRecord3387() {
		assertEquals("Carroll", customers.get(3386).getFirstName());
	}

	@Test
	@DisplayName("Record 3387: LastName is Stoel")
	void LastNameOfRecord3387() {
		assertEquals("Stoel", customers.get(3386).getLastName());
	}

	@Test
	@DisplayName("Record 3387: Company is Napa Auto Parts Elkhorn Store")
	void CompanyOfRecord3387() {
		assertEquals("Napa Auto Parts Elkhorn Store", customers.get(3386).getCompany());
	}

	@Test
	@DisplayName("Record 3387: Address is 2201 W Washington St")
	void AddressOfRecord3387() {
		assertEquals("2201 W Washington St", customers.get(3386).getAddress());
	}

	@Test
	@DisplayName("Record 3387: City is Stockton")
	void CityOfRecord3387() {
		assertEquals("Stockton", customers.get(3386).getCity());
	}

	@Test
	@DisplayName("Record 3387: County is San Joaquin")
	void CountyOfRecord3387() {
		assertEquals("San Joaquin", customers.get(3386).getCounty());
	}

	@Test
	@DisplayName("Record 3387: State is CA")
	void StateOfRecord3387() {
		assertEquals("CA", customers.get(3386).getState());
	}

	@Test
	@DisplayName("Record 3387: ZIP is 95203")
	void ZIPOfRecord3387() {
		assertEquals("95203", customers.get(3386).getZIP());
	}

	@Test
	@DisplayName("Record 3387: Phone is 209-462-6123")
	void PhoneOfRecord3387() {
		assertEquals("209-462-6123", customers.get(3386).getPhone());
	}

	@Test
	@DisplayName("Record 3387: Fax is 209-462-0127")
	void FaxOfRecord3387() {
		assertEquals("209-462-0127", customers.get(3386).getFax());
	}

	@Test
	@DisplayName("Record 3387: Email is carroll@stoel.com")
	void EmailOfRecord3387() {
		assertEquals("carroll@stoel.com", customers.get(3386).getEmail());
	}

	@Test
	@DisplayName("Record 3387: Web is http://www.carrollstoel.com")
	void WebOfRecord3387() {
		assertEquals("http://www.carrollstoel.com", customers.get(3386).getWeb());
	}
}
