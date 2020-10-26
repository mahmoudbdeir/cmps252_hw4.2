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
class Record_2337 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2337: FirstName is Pasquale")
	void FirstNameOfRecord2337() {
		assertEquals("Pasquale", customers.get(2336).getFirstName());
	}

	@Test
	@DisplayName("Record 2337: LastName is Caughorn")
	void LastNameOfRecord2337() {
		assertEquals("Caughorn", customers.get(2336).getLastName());
	}

	@Test
	@DisplayName("Record 2337: Company is Dingle, Erik N Esq")
	void CompanyOfRecord2337() {
		assertEquals("Dingle, Erik N Esq", customers.get(2336).getCompany());
	}

	@Test
	@DisplayName("Record 2337: Address is 58 Westbank Expy")
	void AddressOfRecord2337() {
		assertEquals("58 Westbank Expy", customers.get(2336).getAddress());
	}

	@Test
	@DisplayName("Record 2337: City is Gretna")
	void CityOfRecord2337() {
		assertEquals("Gretna", customers.get(2336).getCity());
	}

	@Test
	@DisplayName("Record 2337: County is Jefferson")
	void CountyOfRecord2337() {
		assertEquals("Jefferson", customers.get(2336).getCounty());
	}

	@Test
	@DisplayName("Record 2337: State is LA")
	void StateOfRecord2337() {
		assertEquals("LA", customers.get(2336).getState());
	}

	@Test
	@DisplayName("Record 2337: ZIP is 70053")
	void ZIPOfRecord2337() {
		assertEquals("70053", customers.get(2336).getZIP());
	}

	@Test
	@DisplayName("Record 2337: Phone is 504-362-8577")
	void PhoneOfRecord2337() {
		assertEquals("504-362-8577", customers.get(2336).getPhone());
	}

	@Test
	@DisplayName("Record 2337: Fax is 504-362-5379")
	void FaxOfRecord2337() {
		assertEquals("504-362-5379", customers.get(2336).getFax());
	}

	@Test
	@DisplayName("Record 2337: Email is pasquale@caughorn.com")
	void EmailOfRecord2337() {
		assertEquals("pasquale@caughorn.com", customers.get(2336).getEmail());
	}

	@Test
	@DisplayName("Record 2337: Web is http://www.pasqualecaughorn.com")
	void WebOfRecord2337() {
		assertEquals("http://www.pasqualecaughorn.com", customers.get(2336).getWeb());
	}
}
