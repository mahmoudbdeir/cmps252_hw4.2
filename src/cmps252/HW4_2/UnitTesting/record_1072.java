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

@Tag("5")
class Record_1072 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1072: FirstName is Donny")
	void FirstNameOfRecord1072() {
		assertEquals("Donny", customers.get(1071).getFirstName());
	}

	@Test
	@DisplayName("Record 1072: LastName is Nordlie")
	void LastNameOfRecord1072() {
		assertEquals("Nordlie", customers.get(1071).getLastName());
	}

	@Test
	@DisplayName("Record 1072: Company is Rochester Auto Dlrs Assn Inc")
	void CompanyOfRecord1072() {
		assertEquals("Rochester Auto Dlrs Assn Inc", customers.get(1071).getCompany());
	}

	@Test
	@DisplayName("Record 1072: Address is 1 Gate")
	void AddressOfRecord1072() {
		assertEquals("1 Gate", customers.get(1071).getAddress());
	}

	@Test
	@DisplayName("Record 1072: City is Sausalito")
	void CityOfRecord1072() {
		assertEquals("Sausalito", customers.get(1071).getCity());
	}

	@Test
	@DisplayName("Record 1072: County is Marin")
	void CountyOfRecord1072() {
		assertEquals("Marin", customers.get(1071).getCounty());
	}

	@Test
	@DisplayName("Record 1072: State is CA")
	void StateOfRecord1072() {
		assertEquals("CA", customers.get(1071).getState());
	}

	@Test
	@DisplayName("Record 1072: ZIP is 94965")
	void ZIPOfRecord1072() {
		assertEquals("94965", customers.get(1071).getZIP());
	}

	@Test
	@DisplayName("Record 1072: Phone is 415-332-4669")
	void PhoneOfRecord1072() {
		assertEquals("415-332-4669", customers.get(1071).getPhone());
	}

	@Test
	@DisplayName("Record 1072: Fax is 415-332-1072")
	void FaxOfRecord1072() {
		assertEquals("415-332-1072", customers.get(1071).getFax());
	}

	@Test
	@DisplayName("Record 1072: Email is donny@nordlie.com")
	void EmailOfRecord1072() {
		assertEquals("donny@nordlie.com", customers.get(1071).getEmail());
	}

	@Test
	@DisplayName("Record 1072: Web is http://www.donnynordlie.com")
	void WebOfRecord1072() {
		assertEquals("http://www.donnynordlie.com", customers.get(1071).getWeb());
	}
}
