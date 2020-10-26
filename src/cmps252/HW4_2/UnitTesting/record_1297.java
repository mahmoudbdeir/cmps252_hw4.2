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

@Tag("34")
class Record_1297 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1297: FirstName is Fredrick")
	void FirstNameOfRecord1297() {
		assertEquals("Fredrick", customers.get(1296).getFirstName());
	}

	@Test
	@DisplayName("Record 1297: LastName is Lint")
	void LastNameOfRecord1297() {
		assertEquals("Lint", customers.get(1296).getLastName());
	}

	@Test
	@DisplayName("Record 1297: Company is Duvall, Hugh Esq")
	void CompanyOfRecord1297() {
		assertEquals("Duvall, Hugh Esq", customers.get(1296).getCompany());
	}

	@Test
	@DisplayName("Record 1297: Address is 1226 Forest Ave")
	void AddressOfRecord1297() {
		assertEquals("1226 Forest Ave", customers.get(1296).getAddress());
	}

	@Test
	@DisplayName("Record 1297: City is Staten Island")
	void CityOfRecord1297() {
		assertEquals("Staten Island", customers.get(1296).getCity());
	}

	@Test
	@DisplayName("Record 1297: County is Richmond")
	void CountyOfRecord1297() {
		assertEquals("Richmond", customers.get(1296).getCounty());
	}

	@Test
	@DisplayName("Record 1297: State is NY")
	void StateOfRecord1297() {
		assertEquals("NY", customers.get(1296).getState());
	}

	@Test
	@DisplayName("Record 1297: ZIP is 10310")
	void ZIPOfRecord1297() {
		assertEquals("10310", customers.get(1296).getZIP());
	}

	@Test
	@DisplayName("Record 1297: Phone is 718-720-3716")
	void PhoneOfRecord1297() {
		assertEquals("718-720-3716", customers.get(1296).getPhone());
	}

	@Test
	@DisplayName("Record 1297: Fax is 718-720-1466")
	void FaxOfRecord1297() {
		assertEquals("718-720-1466", customers.get(1296).getFax());
	}

	@Test
	@DisplayName("Record 1297: Email is fredrick@lint.com")
	void EmailOfRecord1297() {
		assertEquals("fredrick@lint.com", customers.get(1296).getEmail());
	}

	@Test
	@DisplayName("Record 1297: Web is http://www.fredricklint.com")
	void WebOfRecord1297() {
		assertEquals("http://www.fredricklint.com", customers.get(1296).getWeb());
	}
}
