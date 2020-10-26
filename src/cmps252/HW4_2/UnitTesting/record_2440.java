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

@Tag("14")
class Record_2440 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2440: FirstName is Sol")
	void FirstNameOfRecord2440() {
		assertEquals("Sol", customers.get(2439).getFirstName());
	}

	@Test
	@DisplayName("Record 2440: LastName is Balasa")
	void LastNameOfRecord2440() {
		assertEquals("Balasa", customers.get(2439).getLastName());
	}

	@Test
	@DisplayName("Record 2440: Company is Solvang Royal Scandinavian Inn")
	void CompanyOfRecord2440() {
		assertEquals("Solvang Royal Scandinavian Inn", customers.get(2439).getCompany());
	}

	@Test
	@DisplayName("Record 2440: Address is 163 Beaverbrook Rd")
	void AddressOfRecord2440() {
		assertEquals("163 Beaverbrook Rd", customers.get(2439).getAddress());
	}

	@Test
	@DisplayName("Record 2440: City is Lincoln Park")
	void CityOfRecord2440() {
		assertEquals("Lincoln Park", customers.get(2439).getCity());
	}

	@Test
	@DisplayName("Record 2440: County is Morris")
	void CountyOfRecord2440() {
		assertEquals("Morris", customers.get(2439).getCounty());
	}

	@Test
	@DisplayName("Record 2440: State is NJ")
	void StateOfRecord2440() {
		assertEquals("NJ", customers.get(2439).getState());
	}

	@Test
	@DisplayName("Record 2440: ZIP is 7035")
	void ZIPOfRecord2440() {
		assertEquals("7035", customers.get(2439).getZIP());
	}

	@Test
	@DisplayName("Record 2440: Phone is 973-696-0425")
	void PhoneOfRecord2440() {
		assertEquals("973-696-0425", customers.get(2439).getPhone());
	}

	@Test
	@DisplayName("Record 2440: Fax is 973-696-0352")
	void FaxOfRecord2440() {
		assertEquals("973-696-0352", customers.get(2439).getFax());
	}

	@Test
	@DisplayName("Record 2440: Email is sol@balasa.com")
	void EmailOfRecord2440() {
		assertEquals("sol@balasa.com", customers.get(2439).getEmail());
	}

	@Test
	@DisplayName("Record 2440: Web is http://www.solbalasa.com")
	void WebOfRecord2440() {
		assertEquals("http://www.solbalasa.com", customers.get(2439).getWeb());
	}
}
