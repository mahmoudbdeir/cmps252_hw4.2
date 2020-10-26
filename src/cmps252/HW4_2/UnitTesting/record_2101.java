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

@Tag("36")
class Record_2101 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2101: FirstName is Ione")
	void FirstNameOfRecord2101() {
		assertEquals("Ione", customers.get(2100).getFirstName());
	}

	@Test
	@DisplayName("Record 2101: LastName is Cragun")
	void LastNameOfRecord2101() {
		assertEquals("Cragun", customers.get(2100).getLastName());
	}

	@Test
	@DisplayName("Record 2101: Company is Reynolds, John A Esq")
	void CompanyOfRecord2101() {
		assertEquals("Reynolds, John A Esq", customers.get(2100).getCompany());
	}

	@Test
	@DisplayName("Record 2101: Address is 1501 S Columbus Ave")
	void AddressOfRecord2101() {
		assertEquals("1501 S Columbus Ave", customers.get(2100).getAddress());
	}

	@Test
	@DisplayName("Record 2101: City is Goldendale")
	void CityOfRecord2101() {
		assertEquals("Goldendale", customers.get(2100).getCity());
	}

	@Test
	@DisplayName("Record 2101: County is Klickitat")
	void CountyOfRecord2101() {
		assertEquals("Klickitat", customers.get(2100).getCounty());
	}

	@Test
	@DisplayName("Record 2101: State is WA")
	void StateOfRecord2101() {
		assertEquals("WA", customers.get(2100).getState());
	}

	@Test
	@DisplayName("Record 2101: ZIP is 98620")
	void ZIPOfRecord2101() {
		assertEquals("98620", customers.get(2100).getZIP());
	}

	@Test
	@DisplayName("Record 2101: Phone is 509-773-5333")
	void PhoneOfRecord2101() {
		assertEquals("509-773-5333", customers.get(2100).getPhone());
	}

	@Test
	@DisplayName("Record 2101: Fax is 509-773-4677")
	void FaxOfRecord2101() {
		assertEquals("509-773-4677", customers.get(2100).getFax());
	}

	@Test
	@DisplayName("Record 2101: Email is ione@cragun.com")
	void EmailOfRecord2101() {
		assertEquals("ione@cragun.com", customers.get(2100).getEmail());
	}

	@Test
	@DisplayName("Record 2101: Web is http://www.ionecragun.com")
	void WebOfRecord2101() {
		assertEquals("http://www.ionecragun.com", customers.get(2100).getWeb());
	}
}
