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

@Tag("4")
class Record_1143 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1143: FirstName is Elise")
	void FirstNameOfRecord1143() {
		assertEquals("Elise", customers.get(1142).getFirstName());
	}

	@Test
	@DisplayName("Record 1143: LastName is Dunphy")
	void LastNameOfRecord1143() {
		assertEquals("Dunphy", customers.get(1142).getLastName());
	}

	@Test
	@DisplayName("Record 1143: Company is Menardo Cosmetics Of Hi Inc")
	void CompanyOfRecord1143() {
		assertEquals("Menardo Cosmetics Of Hi Inc", customers.get(1142).getCompany());
	}

	@Test
	@DisplayName("Record 1143: Address is 989 Howard St")
	void AddressOfRecord1143() {
		assertEquals("989 Howard St", customers.get(1142).getAddress());
	}

	@Test
	@DisplayName("Record 1143: City is San Francisco")
	void CityOfRecord1143() {
		assertEquals("San Francisco", customers.get(1142).getCity());
	}

	@Test
	@DisplayName("Record 1143: County is San Francisco")
	void CountyOfRecord1143() {
		assertEquals("San Francisco", customers.get(1142).getCounty());
	}

	@Test
	@DisplayName("Record 1143: State is CA")
	void StateOfRecord1143() {
		assertEquals("CA", customers.get(1142).getState());
	}

	@Test
	@DisplayName("Record 1143: ZIP is 94103")
	void ZIPOfRecord1143() {
		assertEquals("94103", customers.get(1142).getZIP());
	}

	@Test
	@DisplayName("Record 1143: Phone is 415-495-2649")
	void PhoneOfRecord1143() {
		assertEquals("415-495-2649", customers.get(1142).getPhone());
	}

	@Test
	@DisplayName("Record 1143: Fax is 415-495-1247")
	void FaxOfRecord1143() {
		assertEquals("415-495-1247", customers.get(1142).getFax());
	}

	@Test
	@DisplayName("Record 1143: Email is elise@dunphy.com")
	void EmailOfRecord1143() {
		assertEquals("elise@dunphy.com", customers.get(1142).getEmail());
	}

	@Test
	@DisplayName("Record 1143: Web is http://www.elisedunphy.com")
	void WebOfRecord1143() {
		assertEquals("http://www.elisedunphy.com", customers.get(1142).getWeb());
	}
}
