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

@Tag("17")
class Record_2880 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2880: FirstName is Emery")
	void FirstNameOfRecord2880() {
		assertEquals("Emery", customers.get(2879).getFirstName());
	}

	@Test
	@DisplayName("Record 2880: LastName is Gamby")
	void LastNameOfRecord2880() {
		assertEquals("Gamby", customers.get(2879).getLastName());
	}

	@Test
	@DisplayName("Record 2880: Company is Sales Directors Inc")
	void CompanyOfRecord2880() {
		assertEquals("Sales Directors Inc", customers.get(2879).getCompany());
	}

	@Test
	@DisplayName("Record 2880: Address is 15154 C Dedeaux Rd")
	void AddressOfRecord2880() {
		assertEquals("15154 C Dedeaux Rd", customers.get(2879).getAddress());
	}

	@Test
	@DisplayName("Record 2880: City is Gulfport")
	void CityOfRecord2880() {
		assertEquals("Gulfport", customers.get(2879).getCity());
	}

	@Test
	@DisplayName("Record 2880: County is Harrison")
	void CountyOfRecord2880() {
		assertEquals("Harrison", customers.get(2879).getCounty());
	}

	@Test
	@DisplayName("Record 2880: State is MS")
	void StateOfRecord2880() {
		assertEquals("MS", customers.get(2879).getState());
	}

	@Test
	@DisplayName("Record 2880: ZIP is 39503")
	void ZIPOfRecord2880() {
		assertEquals("39503", customers.get(2879).getZIP());
	}

	@Test
	@DisplayName("Record 2880: Phone is 228-831-1752")
	void PhoneOfRecord2880() {
		assertEquals("228-831-1752", customers.get(2879).getPhone());
	}

	@Test
	@DisplayName("Record 2880: Fax is 228-831-6354")
	void FaxOfRecord2880() {
		assertEquals("228-831-6354", customers.get(2879).getFax());
	}

	@Test
	@DisplayName("Record 2880: Email is emery@gamby.com")
	void EmailOfRecord2880() {
		assertEquals("emery@gamby.com", customers.get(2879).getEmail());
	}

	@Test
	@DisplayName("Record 2880: Web is http://www.emerygamby.com")
	void WebOfRecord2880() {
		assertEquals("http://www.emerygamby.com", customers.get(2879).getWeb());
	}
}
